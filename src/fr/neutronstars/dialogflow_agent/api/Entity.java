import fr.neutronstars.dialogflow_agent.api;

public interface Entity{

  Agent getAgent();

  String getName();

  Collection<? extends EntityReference> getReferenses();

  Optional<? extends EntityReference> getReferenceBySynonym(String synonym);

}
