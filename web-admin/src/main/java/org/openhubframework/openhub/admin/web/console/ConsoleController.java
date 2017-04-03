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

package org.openhubframework.openhub.admin.web.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.openhubframework.openhub.web.common.JavaMelodyConfigurationProperties;


/**
 * Controller for displaying admin console directory of actions
 *
 * @author Tomas Hanus
 */
@Controller
public class ConsoleController {
    
    @Autowired
    private JavaMelodyConfigurationProperties javaMelodyProps;

    public static final String VIEW_NAME = "console";

    @RequestMapping("/console")
    public String showConsole(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("javamelody", javaMelodyProps.isEnabled());

        return VIEW_NAME;
    }
}
