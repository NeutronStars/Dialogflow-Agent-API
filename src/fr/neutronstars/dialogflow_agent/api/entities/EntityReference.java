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
 * Represents the list of values ​​for an {@link Entity}.
 */
public interface EntityReference
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the instance of {@link Entity}
     * @return {@link Entity}
     */
    Entity getEntity();

    /**
     * Retrieves the name of the reference.
     * @return reference name.
     */
    String getName();

    /**
     * Retrives the list of synonyms of the reference.
     * @return {@link Collection} of synonyms.
     */
    Collection<String> getSynonyms();

}
