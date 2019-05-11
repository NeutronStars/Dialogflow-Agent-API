package fr.neutronstars.dialogflow_agent.api;

import java.util.Collection;
import java.util.Optional;

public interface TrainingPhrase
{
  Agent getAgent();

  Intent getIntent();

  String getPhrase();

  Collection<? extends Parameter> getParameters();

  Optional<? extends Parameter> getParametersByName(String name);
}
