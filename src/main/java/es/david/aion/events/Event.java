package es.david.aion.events;

import es.david.aion.player.PlayerController;

import java.util.TimerTask;

/**
 * Created by davidsantiago on 15/11/15.
 */
public abstract class Event extends TimerTask{

    private String name;
    private Notification notification;
    private PlayerController player;
    protected Integer interval;

    public Event(String name, Notification notification, Duration duration){
        this.name = name;
        this.notification = notification;
        this.player = new PlayerController();
        this.interval = duration.getDuration();
    }

    public abstract void build();

    @Override
    public void run() {
        int instant = setInterval();
        System.out.println(instant);
        if(instant < 1){
            getPlayer().play(notification.getSound());
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
