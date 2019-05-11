import fr.neutronstars.dialogflow_agent.api;

public interface TrainingPhrase
{
  Agent getAgent();

  Intent getIntent();

  String getPhrase();

  Collection<? extends Parameter> getParameters();

  Optional<? extends Parameter> getParametersByName(String name);
}
