import fr.neutronstars.dialogflow_agent.api;

public interface EntityReference{

  Agent getAgent();

  Entity getEntity();

  String getReferenceValue();

  Collection<String> getSynonyms();

}
