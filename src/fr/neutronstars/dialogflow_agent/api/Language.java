import fr.neutronstars.dialogflow_agent.api;

public interface Language{

  Agent getAgent();

  Settings getSettings();

  getName();

  Optional<? extends LanguageLocale> getLanguageLocale();

  boolean isDefault();
}
