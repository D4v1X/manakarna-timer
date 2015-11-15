package es.david.aion.events;

/**
 * Created by davidsantiago on 15/11/15.
 */
public enum Notification {
    DRAKE("wav.wav");

    private final String sound;

    Notification(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
