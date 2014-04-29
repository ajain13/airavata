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
 
CREATE TABLE SUBSCRIPTION (
                SUBSCRIPTIONID VARCHAR(200) NOT NULL DEFAULT '',          
                TOPICS VARCHAR(255) DEFAULT '',                               
                XPATH VARCHAR(200) DEFAULT '',                       
                CONSUMERADDRESS VARCHAR(255) DEFAULT '',                      
                REFERENCEPROPERTIES BLOB,
                CONTENT BLOB,                                                     
                WSRM INTEGER NOT NULL DEFAULT 0 ,                                  
                CREATIONTIME TIMESTAMP NOT NULL  
              );
CREATE TABLE SPECIALSUBSCRIPTION (                              
                       SUBSCRIPTIONID VARCHAR(200) NOT NULL DEFAULT '',              
                       TOPICS VARCHAR(255) DEFAULT '',                               
                       XPATH VARCHAR(200) DEFAULT '',                                
                       CONSUMERADDRESS VARCHAR(255) DEFAULT '',                      
                       REFERENCEPROPERTIES BLOB,                                     
                       CONTENT BLOB,                                                     
                       WSRM INTEGER NOT NULL DEFAULT 0,                         
                       CREATIONTIME TIMESTAMP NOT NULL 
                     );               

	
CREATE TABLE DISQ (                       
          ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
          TRACKID VARCHAR(100) DEFAULT NULL,      
          MESSAGE BLOB,                           
          STATUS INTEGER  DEFAULT NULL,    
          TOPIC VARCHAR(255) DEFAULT '',     
          PRIMARY KEY  (ID)                       
        );	
	
CREATE TABLE MAXIDTABLE(
	MAXID INTEGER
	);
	
CREATE TABLE MINIDTABLE(
	MINID INTEGER
	);
	