package fr.neutronstars.dialogflow_agent.api;

import java.util.Collection;
import java.util.Optional;

public interface Entity{

  Agent getAgent();

  String getName();

  Collection<? extends EntityReference> getReferenses();

  Optional<? extends EntityReference> getReferenceBySynonym(String synonym);

}
