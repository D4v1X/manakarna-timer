package es.david.aion.events;

/**
 * Created by davidsantiago on 15/11/15.
 */
public enum Duration {
    DRAKE(15),
    SEALGUARDIAN (2);

    private final Integer duration;

    Duration(Integer duration){
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }
}
