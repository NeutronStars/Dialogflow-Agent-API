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
import fr.neutronstars.dialogflow_agent.api.utils.Language;
import fr.neutronstars.dialogflow_agent.api.utils.Settings;

/**
 * <p>Dialogflow supports many root languages that can be used for the main development of your agent.
 * Some root languages include locales, which cover region or country-specific versions of a root language.
 * For example, "French" is a root language that includes France and French Canadian locales. {@link 'https://dialogflow.com/docs/agents/multilingual'}</p>
 */
public interface LanguageLocale
{
    /**
     * Retrieves the instance of {@link Agent}.
     * @return {@link Agent}
     */
    Agent getAgent();

    /**
     * Retrieves the instance of {@link Settings}.
     * @return {@link Settings}
     */
    Settings getSettings();

    /**
     * Retrieves the instance of {@link Language}.
     * @return {@link Language}
     */
    Language getLanguage();

    /**
     * Retrieves the name of this LanguageLocale.
     * @return the name of this LanguageLocale.
     */
    String getName();

}
