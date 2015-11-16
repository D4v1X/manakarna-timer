package es.david.aion.events;

import java.io.File;

/**
 * Created by davidsantiago on 15/11/15.
 */
public enum Notification {
    DRAKE("audio"+ File.separator+"Drake.wav"),
    SEALGUARDIAN("audio"+ File.separator+"SealGuardian.wav"),
    REMOVESEAL("audio"+ File.separator+"RemoveSeal.wav");

    private final String sound;

    Notification(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
