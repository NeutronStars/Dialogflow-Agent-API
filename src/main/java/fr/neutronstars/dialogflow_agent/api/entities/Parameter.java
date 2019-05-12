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

import java.util.Optional;

/**
 * <p>Within each intent, there is a table under the training phrases section entitled Action and parameters.
 * Once you annotate your training phrases, the corresponding parameters automatically appear in this table.
 * This section also contains a text field named "action".
 * The value of this field is passed to fulfillment and can be used to trigger specific logic. {@link 'https://dialogflow.com/docs/intents/actions-parameters'}</p>
 */
public interface Parameter
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the {@link Intent} of this Parameter.
     * @return {@link Intent}
     */
    Intent getIntent();

    /**
     * Retrieves the name of this Parameter.
     * @return the name of parameter
     */
    String getName();

    /**
     * Retrieves the {@link Entity} used for this Parameter.
     * <br>If the {@link Entity} <b>does not exist</b> then the optional <b>will be empty</b>.
     *
     *  <h2>Example</h2>
     * <pre><code>
     *     parameter.getEntity().ifPresent(entity {@link Entity} -> {
     *        System.out.println(entity.getName());
     *     });
     * </code></pre>
     *
     * @return {@link Optional} of {@link Entity}
     */
    Optional<? extends Entity> getEntity();

    /**
     * The value of a parameter can be used in responses to refer to that parameter.
     * The value is like a placeholder or the variable assigned to the parameter.
     *
     * @return the value / variable.
     */
    String getValue();

    /**
     * Retrieves if this Parameter is required.
     *
     * If this parameter <b>is required</b>, it will be possible to insert <b>prompts</b>. {@link #getPrompts()}
     *
     * @return if parameter is required.
     */
    boolean isRequired();

    /**
     * the IS LIST option in the parameter table defines this entity as a list.
     * This makes it possible to enter an unlimited number of possible parameters in a user utterance in a single entity.
     *
     * @return isList.
     */
    boolean isList();

    /**
     * Retrieve the default value if the user does not specify information to this parameter.
     *
     *  <h2>Example</h2>
     * <pre><code>
     *     parameter.defaultValue().ifPresent(System.out::println);
     * </code></pre>
     *
     * @return {@link Optional} of the default value.
     */
    Optional<String> defaultValue();

    /**
     * Retrieves the {@link Prompts} if this Parameter is required. {@link #isRequired()}
     *
     *  <h2>Example</h2>
     * <pre><code>
     *     parameter.getPrompts().ifPresent(prompts -> prompts.getPrompts().forEach(System.out::println));
     * </code></pre>
     *
     * @return {@link Optional} of {@link Prompts}
     */
    Optional<? extends Prompts> getPrompts();
}
