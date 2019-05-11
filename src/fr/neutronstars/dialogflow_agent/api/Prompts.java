package fr.neutronstars.dialogflow_agent.api;

import java.util.Collection;

public interface Prompts
{
  Agent getAgent();

  Intent getIntent();

  Parameter getParameter();

  Collection<String> getPrompts();

  int getSize();
}
