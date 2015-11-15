package es.david.aion.events;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class EventRemoveSeal extends Event{

    public EventRemoveSeal() {
        super("Remove Seal", Notification.REMOVESEAL, Duration.REMOVESEAL);
    }

    @Override
    public void build() {

    }
}
