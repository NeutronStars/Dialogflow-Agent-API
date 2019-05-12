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
 * <p>Training phrases are collections of possible utterances that users might say to match an intent.
 * You don't have to define every possible example of what a user might say because of Dialogflow's built-in machine learning, which naturally expands training phrases to other similar user utterances.
 * However, you'll need to add multiple training phrases within an intent (20 or more examples) so your agent can recognize a greater variety of user input. {@link 'https://dialogflow.com/docs/intents/training-phrases'}</p>
 */
public interface TrainingPhrase
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the instance of {@link Intent} of this TrainingPhrase.
     * @return {@link Intent}
     */
    Intent getIntent();

    /**
     * Retrieves the phrase the user will have to say to invoke the {@link #getIntent()}.
     * @return phrase used for invoke the {@link Intent} of this TrainingPhrase.
     */
    String getPhrase();

    /**
     * Retrieves the list of {@link Parameter} used for this TrainingPhrase.
     * @return {@link Collection} of {@link Parameter}
     */
    Collection<? extends Parameter> getParameters();

    /**
     * Retrieve the {@link Parameter} with the name.
     * <br>If the {@link Parameter} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     trainingPhrase.getParametersByName("MyParameterName").ifPresent(parameter {@link Parameter} -> {
     *        System.out.println(parameter.getValue());
     *     });
     * </code></pre>
     *
     * @param name of {@link Parameter}
     *        The name of {@link Parameter}
     * @return {@link Optional} of {@link Parameter}
     */
    Optional<? extends Parameter> getParametersByName(String name);
}
