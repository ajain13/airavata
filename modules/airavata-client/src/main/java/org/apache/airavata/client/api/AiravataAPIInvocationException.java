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

package org.apache.airavata.client.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AiravataAPIInvocationException extends Exception {
	private static final Logger log = LoggerFactory.getLogger(AiravataAPIInvocationException.class);

	private static final long serialVersionUID = 1L;

	public AiravataAPIInvocationException(Throwable e) {
		super(e.getLocalizedMessage(), e);
		log.error(e.getLocalizedMessage(),e);
	}
	public AiravataAPIInvocationException(String message) {
		super(message, null);
		log.error(message);
	}

	public AiravataAPIInvocationException(String message, Throwable e) {
		super(message, e);
		log.error(message,e);
	}

}
