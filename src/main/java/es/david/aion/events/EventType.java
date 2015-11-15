package es.david.aion.events;

/**
 * Created by davidsantiago on 15/11/15.
 */
public enum EventType {
    DRAKE("Beritra is transforming into a dragon."),
    SEALGUARDIAN("wav.wav"),
    REMOVESEAL("Beritra received 1 damage due to the effect of Signet Blast: Powerful Seal.");

    private final String eventType;

    EventType(String eventType){
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }
}
