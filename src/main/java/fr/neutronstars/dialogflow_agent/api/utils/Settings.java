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
package fr.neutronstars.dialogflow_agent.api.utils;

import fr.neutronstars.dialogflow_agent.api.Agent;

import java.util.TimeZone;

/**
 * <p>Access the agent's settings. {@link 'https://dialogflow.com/docs/agents/create-manage'} </p>
 */
public interface Settings
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the description of {@link Agent}
     * @return the description of {@link Agent}
     */
    String getDescription();

    /**
     * Retrieves the {@link TimeZone} of {@link Agent}
     * @return the {@link TimeZone}.
     */
    TimeZone getDefaultTimeZone();

    /**
     * Retrieves the array of {@link Language} used by the {@link Agent}
     * @return array of {@link Language}
     */
    Language[] getLanguages();
}
