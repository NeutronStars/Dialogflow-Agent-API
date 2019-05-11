import fr.neutronstars.dialogflow_agent.api;

public interface Intent{

  Agent getAgent();

  String getName();

  Collection<? extends Context> getContextsIn();

  Collection<? extends Context> getContextsOut();

  Optional<? extends Context> getContextByName(String name);

  Event[] getEvents();

  boolean hasEvent(Event event);

  Collection<? extends TrainingPhrase> getTrainingPhrases();

  Collection<? extends Parameter> getParameters();

  Optional<? extends Parameter> getParameterByName(String name);

  Collection<? extends Response> getResponses();

  Collection<? extends Response> getResponsesByPlatform(Platform platform);

  boolean isEndConversation();

  boolean isEnableWebhookIntent();

  boolean isEnableWebhookSlotFilling();

}
