/*
 * Copyright 2014 the original author or authors.
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

package org.openhubframework.openhub.modules;

import org.openhubframework.openhub.api.exception.ErrorCodeCatalog;
import org.openhubframework.openhub.api.exception.ErrorExtEnum;

import org.springframework.util.Assert;

/**
 * Catalog of custom error codes.
 *
 * @author Petr Juza
 */
@ErrorCodeCatalog("CUSTOM")
public enum ErrorEnum implements ErrorExtEnum {

    ;

    private String errDesc;

    /**
     * Creates new error code with specified description.
     *
     * @param errDesc the error description
     */
    private ErrorEnum(String errDesc) {
        Assert.hasText(errDesc, "the errDesc must not be empty");

        this.errDesc = errDesc;
    }

    @Override
    public String getErrorCode() {
        return name();
    }

    @Override
    public String getErrDesc() {
        return errDesc;
    }
}
