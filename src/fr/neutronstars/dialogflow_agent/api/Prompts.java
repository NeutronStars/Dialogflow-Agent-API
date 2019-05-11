import fr.neutronstars.dialogflow_agent.api;

public interface Prompts
{
  Agent getAgent();

  Intent getIntent();

  Parameter getParameter();

  Collection<String> getPrompts();

  int getSize();
}
