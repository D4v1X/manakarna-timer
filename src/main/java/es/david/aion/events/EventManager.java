package es.david.aion.events;

import java.util.Timer;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class EventManager extends Timer {

    public static final Integer DELAY = 1000;
    public static final Integer PERIOD = 1000;

    public EventManager(String name) {
        super(name);
    }

    public void addEvent(Event event){
        this.schedule(event, DELAY, PERIOD);
    }

}
