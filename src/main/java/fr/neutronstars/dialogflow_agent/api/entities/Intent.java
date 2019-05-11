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
import fr.neutronstars.dialogflow_agent.api.utils.Event;
import fr.neutronstars.dialogflow_agent.api.utils.Platform;

import java.util.Collection;
import java.util.Optional;

/**
 * <p>Generally, an intent represents one dialog turn within the conversation.
 * For example, you could create an agent that recognizes and responds to users' input about their favorite color.
 * If a user said something like <b>My favorite color is purple</b>, your agent would match that input to its corresponding intent and return the response you defined within that intent.
 * Your agent's response usually prompts users for another utterance, which your agent will attempt to match to another intent, and the conversation continues. {@link 'https://dialogflow.com/docs/intents'}</p>
 */

public interface Intent
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the name of this intent.
     * @return intent name.
     */
    String getName();

    /**
     * Retrieves the list of input contexts.
     * {@link Context}
     * @return {@link Collection} of {@link Context}
     */
    Collection<? extends Context> getContextsIn();

    /**
     * Retrieves the list of output contexts.
     * {@link Context}
     * @return {@link Collection} of {@link Context}
     */
    Collection<? extends Context> getContextsOut();

    /**
     * Retrieves the {@link Context} with the name.
     * <br>If the {@link Context} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     intent.getContextByName("MyContextName").ifPresent(context {@link Context} -> {
     *        System.out.println(context.getLifespan());
     *     });
     * </code></pre>
     *
     * @param name The name of {@link Context}.
     * @return {@link Optional} of {@link Context}.
     */
    Optional<? extends Context> getContextByName(String name);

    /**
     * Retrieves the array of Events enabled for this Intent.
     * {@link Event}
     *
     * @return {@link Event} array.
     */
    Event[] getEvents();

    /**
     * Retrieves if {@link Event} was been enabled for this Intent.
     * @param event {@link Event}
     * @return if event is enabled.
     */
    boolean hasEvent(Event event);

    /**
     * Retrieves the list of {@link TrainingPhrase} used for invoke this intent.
     * @return {@link Collection} of {@link TrainingPhrase}
     */
    Collection<? extends TrainingPhrase> getTrainingPhrases();

    /**
     * Retrieves the list of {@link Parameter} of this intent.
     * @return {@link Collection} of {@link Parameter}
     */
    Collection<? extends Parameter> getParameters();

    /**
     * Retrieve the {@link Parameter} with the name.
     *
     * <h2>Example</h2>
     * <pre><code>
     *     intent.getParameterByName("MyParameterName").ifPresent(parameter {@link Parameter} -> {
     *        System.out.println(parameter.getValue());
     *     });
     * </code></pre>
     *
     * @param name
     *        The name of {@link Parameter}
     * @return {@link Optional} of {@link Parameter}
     */
    Optional<? extends Parameter> getParameterByName(String name);

    /**
     * Retrieves the list of all {@link Response} for this intent.
     * @return {@link Collection} of {@link Response}
     */
    Collection<? extends Response> getResponses();

    /**
     * Retrieves the list of all {@link Response} by the {@link Platform} for this intent.
     * @param platform
     *        {@link Platform} target for retrieves the responses.
     * @return {@link Collection} of {@link Response}
     */
    Collection<? extends Response> getResponsesByPlatform(Platform platform);

    /**
     * Retrieves if the intent ends the conversation.
     * @return if this intent ends the conversation.
     */
    boolean isEndConversation();

    /**
     * Retrieves if the intent needs to call the Webhook.
     * @return if the intent needs to call the Webhook.
     */
    boolean isEnableWebhookIntent();

    /**
     * Retrieves if the intent needs to call the Webhook for this slot filling.
     * @return if the intent needs to call the Webhook for this slot filling.
     */
    boolean isEnableWebhookSlotFilling();

}
