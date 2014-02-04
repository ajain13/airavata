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

package org.apache.airavata.persistance.registry.jpa;

import org.apache.airavata.persistance.registry.jpa.resources.*;

import java.sql.Timestamp;
import java.util.Calendar;

public class ExecutionErrorResourceTest extends AbstractResourceTest {
    private WorkflowDataResource workflowDataResource;
    private NodeDataResource nodeDataResource;
    private ExperimentMetadataResource experimentResource;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        GatewayResource gatewayResource = super.getGatewayResource();
        WorkerResource workerResource = super.getWorkerResource();

        ProjectResource project = new ProjectResource(workerResource, gatewayResource, "testProject");
        project.save();

        experimentResource = (ExperimentMetadataResource) gatewayResource.create(ResourceType.EXPERIMENT_METADATA);
        experimentResource.setExpID("testExpID");
        experimentResource.setExecutionUser(workerResource.getUser());

        experimentResource.setProject(project);
        experimentResource.setDescription("testDescription");
        experimentResource.setExperimentName("textExpID");
        experimentResource.setSubmittedDate(getCurrentTimestamp());
        experimentResource.setShareExp(true);
        experimentResource.save();

        workflowDataResource = (WorkflowDataResource) experimentResource.create(ResourceType.WORKFLOW_DATA);
        workflowDataResource.setWorkflowInstanceID("testWFInstance");
        workflowDataResource.setTemplateName("testTemplate");
        workflowDataResource.setExperimentID("testExpID");
        Timestamp timestamp = getCurrentTimestamp();
        workflowDataResource.setLastUpdatedTime(timestamp);
        workflowDataResource.save();

        nodeDataResource = workflowDataResource.createNodeData("testNodeID");
        nodeDataResource.setWorkflowDataResource(workflowDataResource);
        nodeDataResource.setInputs("testInput");
        nodeDataResource.setOutputs("testOutput");
        nodeDataResource.setStatus("testStatus");
        nodeDataResource.save();
    }


    public void testSave() throws Exception {
        ExecutionErrorResource executionErrorResource = (ExecutionErrorResource) workflowDataResource.create(ResourceType.EXECUTION_ERROR);
        executionErrorResource.setErrorCode("testErrorCode");
        executionErrorResource.setActionTaken("testAction");
        executionErrorResource.setErrorLocation("testErrorLocation");
        executionErrorResource.setErrorReference(0);
        executionErrorResource.setWorkflowDataResource(workflowDataResource);

        executionErrorResource.setMetadataResource(experimentResource);
        executionErrorResource.setNodeID(nodeDataResource.getNodeID());
        executionErrorResource.setGfacJobID("testGfacJobID");
        executionErrorResource.setErrorDes("testDes");
        executionErrorResource.setErrorMsg("errorMsg");
        executionErrorResource.save();
        System.out.println(executionErrorResource.getErrorID());

        assertTrue("Execution Error saved successfully", workflowDataResource.isExists(ResourceType.EXECUTION_ERROR, executionErrorResource.getErrorID()));

    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
