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
 * <p>Contexts represent the current state of a user's request and allow your agent to carry information from one intent to another.
 * You can use combinations of input and output contexts to control the conversational path the user takes through your dialog. {@link 'https://dialogflow.com/docs/contexts'}</p>
 */
public interface Context
{

    /**
     * Retrieves the name of this context.
     * @return context name
     */
    String name();

    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the instance of {@link Intent} of this context.
     * @return {@link Intent}
     */
    Intent getIntent();

    /**
     * Retrieve the list of intents where this context is.
     * @return {link Collection} of {@link Intent}
     */
    Collection<? extends Intent> getIntents();

    /**
     * Retrieve the {@link Intent} with the name where this context is.
     * <br>If the {@link Intent} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     context.getIntentByName("MyIntentName").ifPresent(intent {@link Intent} -> {
     *        System.out.println(intent.getName());
     *     });
     * </code></pre>
     *
     * @param name
     *        The name of {@link Intent}
     * @return {@link Optional} of {@link Intent}
     */
    Optional<? extends Intent> getIntentByName(String name);

    /**
     * Retrieves the lifespan of this context
     * @return the lifespan
     */
    int getLifespan();
}
