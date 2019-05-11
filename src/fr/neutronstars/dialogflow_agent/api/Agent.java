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
 *
 * <p>Agents are best described as Natural Language Understanding (NLU) modules.
 * These modules can be included in your app, website, product, or service and translate text or spoken user requests into actionable data.
 * This translation occurs when a user's utterance matches an intent within your agent. {@link 'https://dialogflow.com/docs/agents'}</p>
 */
public interface Agent
{

    /**
     * Retrieves the name of this agent.
     *
     * @return agent name.
     */
    String getName();

    /**
     * Retrieves all intents of this agent.
     * {@link Intent}
     *
     * @return the list of intents.
     */
    Collection<? extends Intent> getIntents();

    /**
     * Retrieves {@link Intent} with the name.
     * <br>If the {@link Intent} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     agent.getIntentByName("MyIntentName").ifPresent(intent {@link Intent} -> {
     *        System.out.println(intent.getName());
     *     });
     * </code></pre>
     *
     * @param name The name of the {@link Intent}.
     * @return {@link Optional} of the {@link Intent}.
     */
    Optional<? extends Intent> getIntentByName(String name);

    /**
     * Retrieves all entities of this agent.
     * {@link Entity}
     *
     * @return the {@link Collection} of {@link Entity}.
     */
    Collection<? extends Entity> getEntities();

    /**
     * Retrieves {@link Entity} with the name.
     * <br>If the {@link Entity} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     agent.getEntityByName("MyEntityName").ifPresent(entity {@link Entity} -> {
     *        System.out.println(entity.getName());
     *     });
     * </code></pre>
     *
     * @param name The name of the {@link Entity}.
     * @return {@link Optional} of the {@link Entity}.
     */
    Optional<? extends Entity> getEntityByName(String name);

    /**
     * Retrieves {@link Settings} of this agent.
     *
     * @return {@link Settings}.
     */
    Settings getSettings();
}
