package fr.neutronstars.dialogflow_agent.api;

import java.util.Collection;
import java.util.Optional;

public interface Context{

  String name();

  Agent getAgent();

  Collection<? extends Intent> getIntents();

  Optional<? extends Intent> getIntentByName(String name);
}
