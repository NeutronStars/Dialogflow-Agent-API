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

public enum Event{
  WELCOME,
  GOOGLE_ASSISTANT_WELCOME,
  GOOGLE_ASSISTANT_PERMISSION,
  GOOGLE_ASSISTANT_OPTION,
  GOOGLE_ASSISTANT_DATETIME,
  GOOGLE_ASSISTANT_SIGN_IN,
  GOOGLE_ASSISTANT_PLACE,
  GOOGLE_ASSISTANT_DELIVERY_ADDRESS,
  GOOGLE_ASSISTANT_CONFIRMATION,
  GOOGLE_ASSISTANT_LINK,
  GET_FORTUNE,
  GET_HOROSCOPE,
  GET_JOKE,
  GET_QUOTATION,
  GET_CREDIT_SCORE,
  GET_CRYPTOCURRENCY_PRICE,
  PLAY_GAME,
  CHECK_WATERSPORTS_CONDITIONS,
  CONFIGURE_UPDATES,
  CHECK_AIR_QUALITY,
  CHECK_WATER_CONDITIONS,
  START_CALMING_ACTIVITY,
  FACEBOOK_WELCOME,
  TELPHONNY_WELCOME,
  SLACK_WELCOME,
  KIK_WELCOME,
  SKYPE_WELCOME,
  VIBER_WELCOME,
  TELEGRAM_WELCOME;
}
