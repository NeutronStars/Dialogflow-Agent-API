package fr.neutronstars.dialogflow_agent.api;

public interface Response
{
  Agent getAgent();

  Intent getIntent();

  String getResponse();

  Platform getPlatform();
}
