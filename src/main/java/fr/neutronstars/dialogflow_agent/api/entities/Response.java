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
import fr.neutronstars.dialogflow_agent.api.utils.Platform;

/**
 * <p>Every intent must define a response that's returned to the user.
 * There are two primary ways you can return a response to the user — either with a pre-defined, static response or with a response generated from a webhook.
 * In both of these cases, you can use extracted parameters in the response. {@link 'https://dialogflow.com/docs/intents/responses'}</p>
 */
public interface Response
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the instance of {@link Intent} of this Response.
     * @return {@link Intent}
     */
    Intent getIntent();

    /**
     * Retrieves the response send to users.
     * @return the response.
     */
    String getResponse();

    /**
     * Retrieves the {@link Platform} where the response will be used.
     * @return {@link Platform} of this response.
     */
    Platform getPlatform();
}
