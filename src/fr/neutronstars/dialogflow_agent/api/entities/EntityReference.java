package fr.neutronstars.dialogflow_agent.api.entities;

import fr.neutronstars.dialogflow_agent.api.Agent;

import java.util.Collection;

public interface EntityReference{

  Agent getAgent();

  Entity getEntity();

  String getName();

  Collection<String> getSynonyms();

}
