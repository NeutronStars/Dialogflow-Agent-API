/**
 * Copyright 2019 NeutronStars
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
package fr.neutronstars.dialogflow_agent.api.entities;

import fr.neutronstars.dialogflow_agent.api.Agent;

import java.util.Collection;

/**
 * Prompt appears when the parameter is required.
 */
public interface Prompts
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the instance of {@link Intent} of this Prompts.
     * @return {@link Intent}
     */
    Intent getIntent();

    /**
     * Retrieves the instance of {@link Parameter} of this Prompts.
     * @return {@link Parameter}
     */
    Parameter getParameter();

    /**
     * Retrieves the list of prompts.
     * @return {@link Collection} of prompts.
     */
    Collection<String> getPrompts();

    /**
     * Retrieves the prompts count.
     * @return prompts count.
     */
    int getSize();
}
