package es.david.aion.events;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class EventSealGuardian extends Event{

    public EventSealGuardian() {
        super("Seal Guardian", Notification.SEALGUARDIAN, Duration.SEALGUARDIAN);
    }

    @Override
    public void build() {

    }
}
