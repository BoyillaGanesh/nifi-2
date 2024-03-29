/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.entity;

import io.swagger.annotations.ApiModelProperty;
import org.apache.nifi.web.api.dto.AffectedComponentDTO;
import org.apache.nifi.web.api.dto.ProcessGroupNameDTO;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A serialized representation of this class can be placed in the entity body of a response to the API.
 * This particular entity holds a reference to component that references a variable.
 */
@XmlRootElement(name = "affectedComponentEntity")
public class AffectedComponentEntity extends ComponentEntity implements Permissible<AffectedComponentDTO> {

    private AffectedComponentDTO component;
    private ProcessGroupNameDTO processGroup;

    /**
     * @return variable referencing components that is being serialized
     */
    @Override
    public AffectedComponentDTO getComponent() {
        return component;
    }

    @Override
    public void setComponent(AffectedComponentDTO component) {
        this.component = component;
    }

    @ApiModelProperty("The Process Group that the component belongs to")
    public ProcessGroupNameDTO getProcessGroup() {
        return processGroup;
    }

    public void setProcessGroup(ProcessGroupNameDTO processGroup) {
        this.processGroup = processGroup;
    }

    @Override
    public String toString() {
        return component == null ? "AffectedComponent[No Component]" : component.toString();
    }
}
