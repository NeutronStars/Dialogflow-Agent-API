import fr.neutronstars.dialogflow_agent.api;

public interface Parameter
{
  Agent getAgent();

  Intent getIntent();

  String getName();

  Optional<? extends Entity> getEntity();

  String getValue();

  boolean isRequired();

  boolean isList();

  Optional<String> defaultValue();

  Optional<? extends Prompts> getPrompts();
}
