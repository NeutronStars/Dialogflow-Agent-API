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

package fr.neutronstars.dialogflow_agent.api;

import java.util.Collection;
import java.util.Optional;

/**
 * The core of Dialogflow Agent. You can access the agent content from this instance.
 */
public interface Agent
{

    /**
     * Get the name of your agent.
     *
     * @return agent name.
     */
    String getName();

    /**
     * Get all intents of your agent.
     * {@link Intent}
     *
     * @return the list of intents.
     */
    Collection<? extends Intent> getIntents();

    /**
     * Get intent with the name.
     * <br>If the intent <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     agent.getIntentByName("MyIntentName").ifPresent(intent {@link Intent} -> {
     *        System.out.println(intent.getName());
     *     });
     * </code></pre>
     *
     * @param name The name of the intent.
     * @return optional of the intent.
     */
    Optional<? extends Intent> getIntentByName(String name);

    /**
     * Get all entities of your agent.
     * {@link Entity}
     *
     * @return the list of entities.
     */
    Collection<? extends Entity> getEntities();

    /**
     * Get entity with the name.
     * <br>If the entity <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     agent.getEntityByName("MyEntityName").ifPresent(entity {@link Entity} -> {
     *        System.out.println(entity.getName());
     *     });
     * </code></pre>
     *
     * @param name The name of the entity.
     * @return optional of the entity.
     */
    Optional<? extends Entity> getEntityByName(String name);

    /**
     * Get settings of your agent.
     * {@link Settings}
     *
     * @return settings.
     */
    Settings getSettings();
}
