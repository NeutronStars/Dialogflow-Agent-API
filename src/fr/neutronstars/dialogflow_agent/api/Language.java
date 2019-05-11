package fr.neutronstars.dialogflow_agent.api;

import java.util.Optional;

public interface Language{

  Agent getAgent();

  Settings getSettings();

  String getName();

  Optional<? extends LanguageLocale> getLanguageLocale();

  boolean isDefault();
}
