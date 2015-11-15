package es.david.aion.events;

import es.david.aion.player.PlayerController;
import org.apache.log4j.Logger;

import java.util.TimerTask;

/**
 * Created by davidsantiago on 15/11/15.
 */
public abstract class Event extends TimerTask{

    private String name;
    private Notification notification;
    private PlayerController player;
    private PlayerController player2;
    protected Integer interval;
    private boolean first;

    final static Logger logger = Logger.getLogger(Event.class);

    public Event(String name, Notification notification, Duration duration){
        this.name = name;
        this.notification = notification;
        this.player = new PlayerController();
        this.player2 = new PlayerController();
        this.interval = duration.getDuration();
        this.first = true;
    }

    public abstract void build();

    @Override
    public void run() {
        if(first){
            player.play(notification.getSound());
            first = false;
            logger.info(name+": First Notification");
        }
        int instant = setInterval();
        if(instant < 1){
            player2.play(notification.getSound());
            logger.info(name+": Last Notification");
        }
        build();
    }

    /*
    public String getName() {
        return name;
    }

    public Notification getNotification() {
        return notification;
    }

    public Duration getDuration() {
        return duration;
    }
*/
    public PlayerController getPlayer() {
        return player;
    }

    private final int setInterval() {
        if (interval == 1)
            this.cancel();
        return --interval;
    }
}
