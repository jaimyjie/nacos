/*
 * Copyright 1999-2023 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.api.naming.remote.request;

/**
 * Nacos naming watch service request.
 *
 * @author tanyongquan
 */
public class WatchServiceRequest extends AbstractNamingRequest {
    
    private String type;
    
    public WatchServiceRequest() {
    }
    
    public WatchServiceRequest(String namespace, String serviceNamePattern, String groupNamePattern, String type) {
        super(namespace, serviceNamePattern, groupNamePattern);
        this.type = type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
}