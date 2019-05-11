package fr.neutronstars.dialogflow_agent.api;

import java.util.Collection;

public interface EntityReference{

  Agent getAgent();

  Entity getEntity();

  String getName();

  Collection<String> getSynonyms();

}
