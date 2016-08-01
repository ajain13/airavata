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

package org.apache.airavata.cloud.bigDataClientSideServices.marathon.marathonClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.airavata.cloud.exceptions.marathonExceptions.MarathonException;
import org.apache.airavata.cloud.util.marathonUtilities.MarathonUtilImpl;
import org.apache.airavata.cloud.util.marathonUtilities.MarathonUtilI;

public class MarathonJobSchedulerImpl implements MarathonJobSchedulerI {
	MarathonUtilI util = new MarathonUtilImpl();


	public void jobKill(String name, String address) throws MarathonException{
		try{

			String completeCommandToRunProcess = "curl -X DELETE "+address+""+name;
			BufferedReader stdout = util.executeProcess(completeCommandToRunProcess);
			util.printLog(stdout);
		}

		catch (Exception ex) {
			throw new MarathonException("Exception occured while launching the job.\n"+ex.toString());
		}
	}
	public void jobLaunch(String name, String address) throws MarathonException{
		try{

			String completeCommandToRunProcess = "curl -X POST "+address+"/v2/apps -d @"+name+" -H Content-type: application/json";
			BufferedReader stdout = util.executeProcess(completeCommandToRunProcess);
			util.printLog(stdout);
		}

		catch (Exception ex) {
			throw new MarathonException("Exception occured while launching the job.\n"+ex.toString());
		}
	}
	public void configCreate(String name, String ram, String cpu, String disk, String image, String command) throws MarathonException{
	try {
		String config = "'id': "+name+",'cmd': \""+command+"\", \"container\": {\"type\": \"DOCKER\", \"docker\": {\"image\": \"danielpan/dacapo\", \"forcePullImage\": bool(1)}},\"constraints\":[[\"hostname\",\"UNIQUE\"]],\"cpus\": float("+cpu+"), \"mem\": "+ram+"), \"disk\": "+disk+", \"instances\": 1";
		File file = new File(name+".json");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(config);
		bw.close();

		}catch (IOException ex) {
			throw new MarathonException("IO Exception occured while creating the configuration file.\n"+ex.toString());
		}catch (Exception ex) {
			throw new MarathonException("Exception occured while creating the configuration file.\n"+ex.toString());
		}
	}

	public void jobList(String address) throws MarathonException{
		try{

			String completeCommandToRunProcess = "curl GET "+address+"/v2/apps";
			BufferedReader stdout = util.executeProcess(completeCommandToRunProcess);
			util.printLog(stdout);
		}

		catch (Exception ex) {
			throw new MarathonException("Exception occured while retrieving the list jobs.\n"+ex.toString());
		}
	}

	public void jobListById(String address, String id) throws MarathonException{
		try{

			String completeCommandToRunProcess ="curl GET "+address+"/v2/apps/"+id;
			BufferedReader stdout = util.executeProcess(completeCommandToRunProcess);
			util.printLog(stdout);
		}

		catch (Exception ex) {
			throw new MarathonException("Exception occured while retrieving the list jobs.\n"+ex.toString());
		}
	}
	public void jobListByName(String address, String name) throws MarathonException{
		try{

			String completeCommandToRunProcess = "curl GET "+address+"/v2/apps/"+name;
			BufferedReader stdout = util.executeProcess(completeCommandToRunProcess);
			util.printLog(stdout);
		}

		catch (Exception ex) {
			throw new MarathonException("Exception occured while retrieving the list jobs.\n"+ex.toString());
		}
	}


}
