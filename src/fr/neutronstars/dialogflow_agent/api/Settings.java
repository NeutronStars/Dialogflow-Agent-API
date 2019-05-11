package fr.neutronstars.dialogflow_agent.api;

import java.util.TimeZone;

public interface Settings{

  Agent getAgent();

  String getDescription();

  TimeZone getDefaultTimeZone();

  Language[] getLanguages();

  boolean hasLanguage(Language Language);

}
