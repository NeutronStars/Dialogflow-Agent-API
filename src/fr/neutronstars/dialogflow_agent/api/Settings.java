import fr.neutronstars.dialogflow_agent.api;

public interface Settings{

  Agent getAgent();

  String getDescription();

  TimeZone getDefaultTimeZone();

  Language[] getLanguages();

  boolean hasLanguage(Language Language);

}
