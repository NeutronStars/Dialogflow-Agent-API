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
import java.util.Optional;

/**
 * <p>Entities are Dialogflow's mechanism for identifying and extracting useful data from natural language inputs. {@link 'https://dialogflow.com/docs/entities'}</p>
 */

public interface Entity
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the name of this Entity
     * @return entity name
     */
    String getName();

    /**
     * Retrieves the list of references of this entity.
     * @return {@link Collection} of {@link EntityReference}
     */
    Collection<? extends EntityReference> getReferences();

    /**
     * Retrieve the {@link EntityReference} with the name.
     * <br>If the {@link EntityReference} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     entity.getReferenceByName("MyReferenceName").ifPresent(reference {@link EntityReference} -> {
     *        StringBuilder builder = new StringBuilder();
     *        reference.getSynonyms().forEach(builder.append(' ')::append);
     *        System.out.println(builder.toString().trim());
     *     });
     * </code></pre>
     *
     * @param name of {@link EntityReference}
     *        The name of {@link EntityReference}
     * @return {@link Optional} of {@link EntityReference}
     */
    Optional<? extends EntityReference> getReferenceByName(String name);
}
