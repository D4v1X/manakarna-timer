package es.david.aion.events;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Timer;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class EventManager extends Timer implements EventListener{

    private static final Integer DELAY = 1000;
    private static final Integer PERIOD = 1000;

    private HashMap<String,Event[]> eventHashMap;

    public EventManager(String name) {
        super(name);
        /*
        eventHashMap = new LinkedHashMap<String, Event[]>();
        eventHashMap.put("Beritra is transforming into a dragon.", new Event[]{new EventRemoveSeal(), new EventDrake()});
        eventHashMap.put("Beritra received 1 damage due to the effect of Signet Blast: Powerful Seal.", new Event[]{new EventRemoveSeal()});
        */
    }

    public void addEvent(EventType eventType){
        if(eventType == EventType.DRAKE){
            this.schedule(new EventDrake(), DELAY, PERIOD);
            this.schedule(new EventSealGuardian(), DELAY, PERIOD);

        }
        if(eventType == EventType.REMOVESEAL){
            this.schedule(new EventRemoveSeal(), DELAY, PERIOD);
        }

    }

}
