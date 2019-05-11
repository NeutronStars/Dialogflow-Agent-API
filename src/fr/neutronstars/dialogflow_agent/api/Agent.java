import fr.neutronstars.dialogflow_agent.api;

/**
 * interface Agent.
 */
public interface Agent{

  String getName();

  Collection<? extends Intent> getItents();

  Optional<? extends Intent> getItentByName(String name);

  Collection<? extends Entity> getEntities();

  Optional<? extends Entity> getEntityByName(String name);

  Settings getSettings();
}
