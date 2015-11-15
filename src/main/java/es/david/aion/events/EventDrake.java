package es.david.aion.events;

import org.apache.log4j.Logger;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class EventDrake extends Event {

    public EventDrake() {
        super("Beritra Drake", Notification.DRAKE, Duration.DRAKE);
    }

    @Override
    public void build() {
    }
}
