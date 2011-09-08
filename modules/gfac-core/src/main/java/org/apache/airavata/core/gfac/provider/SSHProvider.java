/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.core.gfac.provider;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.namespace.QName;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.connection.ConnectionException;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.userauth.keyprovider.KeyProvider;
import net.schmizz.sshj.xfer.scp.SCPFileTransfer;

import org.apache.airavata.commons.gfac.type.HostDescription;
import org.apache.airavata.commons.gfac.type.app.ShellApplicationDeployment;
import org.apache.airavata.commons.gfac.type.parameter.AbstractParameter;
import org.apache.airavata.core.gfac.context.invocation.InvocationContext;
import org.apache.airavata.core.gfac.context.security.impl.SSHSecurityContextImpl;
import org.apache.airavata.core.gfac.exception.GfacException;
import org.apache.airavata.core.gfac.exception.ProviderException;
import org.apache.airavata.core.gfac.notification.NotificationService;
import org.apache.airavata.core.gfac.utils.GFacConstants;
import org.apache.airavata.core.gfac.utils.GfacUtils;
import org.apache.airavata.core.gfac.utils.OutputUtils;

public class SSHProvider extends AbstractProvider {

    private static final String SPACE = " ";
    private static final String SSH_SECURITY_CONTEXT = "ssh";

    private String buildCommand(List<String> cmdList) {
        StringBuffer buff = new StringBuffer();
        for (String string : cmdList) {
            buff.append(string);
            buff.append(SPACE);
        }
        return buff.toString();
    }

    private void initSSHSecurity(InvocationContext context, SSHClient ssh) throws SecurityException, IOException {
        try {
            SSHSecurityContextImpl sshContext = ((SSHSecurityContextImpl) context
                    .getSecurityContext(SSH_SECURITY_CONTEXT));

            KeyProvider pkey = ssh.loadKeys(sshContext.getPrivateKeyLoc(), sshContext.getKeyPass());

            ssh.loadKnownHosts();
            ssh.authPublickey(sshContext.getUsername(), pkey);

        } catch (NullPointerException ne) {
            throw new SecurityException("Cannot load security context for SSH", ne);
        }

    }

    // TODO: This method has a try/catch embedded in 'finally' method. Is there a way
    // TODO: to force cleanup on failed connections?
    public void initialize(InvocationContext context) throws ProviderException {
        HostDescription host = context.getExecutionDescription().getHost();
        ShellApplicationDeployment app = (ShellApplicationDeployment) context.getExecutionDescription().getApp();

        SSHClient ssh = new SSHClient();
        try {

            initSSHSecurity(context, ssh);
            ssh.connect(host.getName());

            final Session session = ssh.startSession();
            try {
                StringBuilder command = new StringBuilder();
                // TODO: Is "|" what you want here?
                command.append("mkdir -p ");
                command.append(app.getTmpDir());
                command.append(" | ");
                command.append("mkdir -p ");
                command.append(app.getWorkingDir());
                command.append(" | ");
                command.append("mkdir -p ");
                command.append(app.getInputDir());
                command.append(" | ");
                command.append("mkdir -p ");
                command.append(app.getOutputDir());
                Command cmd = session.exec(command.toString());
                cmd.join(5, TimeUnit.SECONDS);
            } catch (ConnectionException e) {
                throw e;
            } finally {
                try {
                    session.close();
                } catch (Exception e) {
                    log.warn("Cannot Close SSH Session");
                }
            }
        } catch (IOException e) {
            throw new ProviderException(e.getMessage(), e);
        } finally {
            try {
                ssh.disconnect();
            } catch (Exception e) {
                log.warn("Cannot Close SSH Connection");
            }
        }
    }

    // TODO: This method has a try/catch embedded in 'finally' method. Is there a way
    // TODO: to force cleanup on failed connections?
    public void execute(InvocationContext context) throws ProviderException {
        HostDescription host = context.getExecutionDescription().getHost();
        ShellApplicationDeployment app = (ShellApplicationDeployment) context.getExecutionDescription().getApp();

        // input parameter
        ArrayList<String> tmp = new ArrayList<String>();
        for (Iterator<String> iterator = context.getInput().getNames(); iterator.hasNext();) {
            String key = iterator.next();
            tmp.add(context.getInput().getStringValue(key));
        }

        List<String> cmdList = new ArrayList<String>();

        SSHClient ssh = new SSHClient();
        try {

            /*
             * Builder Command
             */
            cmdList.add(app.getExecutable());
            cmdList.addAll(tmp);

            // create process builder from command
            String command = buildCommand(cmdList);

            // redirect StdOut and StdErr
            // TODO: Make 1> and 2> into static constants.
            // TODO: This only works for the BASH shell. CSH and TCSH will be different.
            command += SPACE + "1>" + SPACE + app.getStdOut();
            command += SPACE + "2>" + SPACE + app.getStdErr();

            // get the env of the host and the application
            Map<String, String> nv = app.getEnv();

            // extra env's
            nv.put(GFacConstants.INPUT_DATA_DIR_VAR_NAME, app.getInputDir());
            nv.put(GFacConstants.OUTPUT_DATA_DIR_VAR_NAME, app.getOutputDir());

            // log info
            log.info("Command = " + buildCommand(cmdList));
            for (String key : nv.keySet()) {
                log.info("Env[" + key + "] = " + nv.get(key));
            }

            // notify start
            NotificationService notifier = context.getExecutionContext().getNotificationService();
            notifier.startExecution(this, context);

            // TODO: initSSHSecurity can throw an IOException but you are
            // treating everything as a GFAC exception.
            initSSHSecurity(context, ssh);
            ssh.connect(host.getName());
            final Session session = ssh.startSession();
            try {
                /*
                 * Build working Directory
                 */
                log.info("WorkingDir = " + app.getWorkingDir());
                session.exec("mkdir -p " + app.getWorkingDir());
                session.exec("cd " + app.getWorkingDir());

                /*
                 * Set environment
                 */
                for (String key : nv.keySet()) {
                    session.setEnvVar(key, nv.get(key));
                }

                /*
                 * Execute
                 */
                Command cmd = session.exec(command);
                log.info("stdout=" + GfacUtils.readFromStream(session.getInputStream()));
                cmd.join(5, TimeUnit.SECONDS);

                // notify end
                notifier.finishExecution(this, context);

                /*
                 * check return value. usually not very helpful to draw
                 * conclusions based on return values so don't bother. just
                 * provide warning in the log messages
                 */
                if (cmd.getExitStatus() != 0) {
                    log.error("Process finished with non zero return value. Process may have failed");
                } else {
                    log.info("Process finished with return value of zero.");
                }

                // TODO: The location of the logDir should be a configurable parameter.
                // TODO: This location is easy to lose. Also, why not use standard logging
                // TODO: tools for this? Or are these really temporary directories rather than logs?
                File logDir = new File("./service_logs");
                if (!logDir.exists()) {
                    logDir.mkdir();
                }

                // Get the Stdouts and StdErrs
                QName x = QName.valueOf(context.getServiceName());
                String timeStampedServiceName = GfacUtils.createServiceDirName(x);
                File localStdOutFile = new File(logDir, timeStampedServiceName + ".stdout");
                File localStdErrFile = new File(logDir, timeStampedServiceName + ".stderr");

                SCPFileTransfer fileTransfer = ssh.newSCPFileTransfer();
                fileTransfer.download(app.getStdOut(), localStdOutFile.getAbsolutePath());
                fileTransfer.download(app.getStdErr(), localStdErrFile.getAbsolutePath());

                String stdOutStr = GfacUtils.readFileToString(localStdOutFile.getAbsolutePath());
                String stdErrStr = GfacUtils.readFileToString(localStdErrFile.getAbsolutePath());

                // set to context
                OutputUtils.fillOutputFromStdout(context.<AbstractParameter> getOutput(), stdOutStr, stdErrStr);

            } catch (IOException e) {
                throw e;
            } finally {
                try {
                    session.close();
                } catch (Exception e) {
                    log.warn("Cannot Close SSH Session");
                }
            }
        } catch (IOException e) {
            throw new ProviderException(e.getMessage(), e);
        } finally {
            try {
                ssh.disconnect();
            } catch (Exception e) {
                log.warn("Cannot Close SSH Connection");
            }
        }
    }

    public void dispose(InvocationContext invocationContext) throws GfacException {
        // TODO Auto-generated method stub
    }

    public void abort(InvocationContext invocationContext) throws GfacException {
        // TODO Auto-generated method stub

    }

}
