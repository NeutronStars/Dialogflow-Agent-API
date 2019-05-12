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

/**
 * <p>Events allow you to invoke intents based on something that has happened instead of what a user communicates.
 * Dialogflow supports events from several platforms (like Google Assistant, Slack, and more) based on actions users take on those platforms.
 * You can also create your own custom events that can be triggered via fulfillment or the detectIntent API. {@link 'https://dialogflow.com/docs/events'}</p>
 */
public final class Event
{
    public static final Event WELCOME = new Event("WELCOME");
    public static final Event GOOGLE_ASSISTANT_WELCOME = new Event("GOOGLE_ASSISTANT_WELCOME");
    public static final Event GOOGLE_ASSISTANT_PERMISSION = new Event("GOOGLE_ASSISTANT_PERMISSION");
    public static final Event GOOGLE_ASSISTANT_OPTION = new Event("GOOGLE_ASSISTANT_OPTION");
    public static final Event GOOGLE_ASSISTANT_DATETIME = new Event("GOOGLE_ASSISTANT_DATETIME");
    public static final Event GOOGLE_ASSISTANT_SIGN_IN = new Event("GOOGLE_ASSISTANT_SIGN_IN");
    public static final Event GOOGLE_ASSISTANT_PLACE = new Event("GOOGLE_ASSISTANT_PLACE");
    public static final Event GOOGLE_ASSISTANT_DELIVERY_ADDRESS = new Event("GOOGLE_ASSISTANT_DELIVERY_ADDRESS");
    public static final Event GOOGLE_ASSISTANT_CONFIRMATION = new Event("GOOGLE_ASSISTANT_CONFIRMATION");
    public static final Event GOOGLE_ASSISTANT_LINK = new Event("GOOGLE_ASSISTANT_LINK");
    public static final Event GET_FORTUNE = new Event("GET_FORTUNE");
    public static final Event GET_HOROSCOPE = new Event("GET_HOROSCOPE");
    public static final Event GET_JOKE = new Event("GET_JOKE");
    public static final Event GET_QUOTATION = new Event("GET_QUOTATION");
    public static final Event GET_CREDIT_SCORE = new Event("GET_CREDIT_SCORE");
    public static final Event GET_CRYPTOCURRENCY_PRICE = new Event("GET_CRYPTOCURRENCY_PRICE");
    public static final Event PLAY_GAME = new Event("PLAY_GAME");
    public static final Event CHECK_WATERSPORTS_CONDITIONS = new Event("CHECK_WATERSPORTS_CONDITIONS");
    public static final Event CONFIGURE_UPDATES = new Event("CONFIGURE_UPDATES");
    public static final Event CHECK_AIR_QUALITY = new Event("CHECK_AIR_QUALITY");
    public static final Event CHECK_WATER_CONDITIONS = new Event("CHECK_WATER_CONDITIONS");
    public static final Event START_CALMING_ACTIVITY = new Event("START_CALMING_ACTIVITY");
    public static final Event FACEBOOK_WELCOME = new Event("FACEBOOK_WELCOME");
    public static final Event TELEPHONY_WELCOME = new Event("TELEPHONY_WELCOME");
    public static final Event SLACK_WELCOME = new Event("SLACK_WELCOME");
    public static final Event KIK_WELCOME = new Event("KIK_WELCOME");
    public static final Event SKYPE_WELCOME = new Event("SKYPE_WELCOME");
    public static final Event VIBER_WELCOME = new Event("VIBER_WELCOME");
    public static final Event TELEGRAM_WELCOME = new Event("TELEGRAM_WELCOME");

    private final String name;

    private Event(String name)
    {
        this.name = name;
    }

    /**
     * Retrieves the name of this the Event.
     * @return name of the Event
     */
    public String getName()
    {
        return name;
    }

    /**
     * Retrieves a new instance of Event.
     * @param name
     *        The name of the event.
     * @return the new event.
     */
    public static Event of(String name)
    {
        return new Event(name);
    }
}
