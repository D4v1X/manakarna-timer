package es.david.aion.events;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Timer;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class EventManager extends Timer {

    private static final Integer DELAY = 1000;
    private static final Integer PERIOD = 1000;

    private HashMap<String,Event[]> eventHashMap;

    public EventManager(String name) {
        super(name);
        eventHashMap = new LinkedHashMap<String, Event[]>();
        eventHashMap.put("Beritra is transforming into a dragon.", new Event[]{new EventRemoveSeal(), new EventDrake()});
        eventHashMap.put("Beritra received 1 damage due to the effect of Signet Blast: Powerful Seal.", new Event[]{new EventRemoveSeal()});
    }

    public void addEvent(String eventString){
        Event[] events = eventHashMap.get(eventString);
        for (Event event : events)
            this.schedule(event, DELAY, PERIOD);
    }

}
