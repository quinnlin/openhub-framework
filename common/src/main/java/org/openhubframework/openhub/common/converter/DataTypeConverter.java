/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openhubframework.openhub.common.converter;

import java.text.ParseException;
import javax.annotation.Nullable;


/**
 * Contract of conversion object from/to string representation.
 *
 * @author Petr Juza
 * @since 2.0
 */
public interface DataTypeConverter {

    /**
     * Converts object to string.
     *
     * @param obj Object of specified type
     * @return string
     */
    @Nullable
    String convertToString(@Nullable Object obj);

    /**
     * Converts string to object.
     *
     * @param str String representation of object
     * @return object of specified type
     * @throws ParseException when parsing error occurs
     */
    @Nullable
    Object convertToObject(@Nullable String str) throws ParseException;

}
