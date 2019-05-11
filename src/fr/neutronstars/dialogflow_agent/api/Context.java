import fr.neutronstars.dialogflow_agent.api;

public interface Context{

  String name();

  Agent getAgent();

  Collection<? extends Intent> getIntents();

  Optional<? extends Intent> getIntentByName(String name);
}
