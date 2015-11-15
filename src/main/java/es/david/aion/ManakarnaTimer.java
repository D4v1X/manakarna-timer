package es.david.aion;

import es.david.aion.events.EventDrake;
import es.david.aion.events.EventManager;
import org.apache.log4j.Logger;

/**
 * Created by davidsantiago on 14/11/15.
 */
public class ManakarnaTimer{
    /**
     *
     * @param args
     */
    final static Logger logger = Logger.getLogger(ManakarnaTimer.class);


    public static void main(String[] args) {
        /*
        String parameter = "Hola log";

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
*/

        EventManager eventManager = new EventManager("Manakarna");
        eventManager.addEvent(new EventDrake());
/*

        final String audioFilePath = "wav.wav";
        Integer audioTimer = 120;
        final PlayerController player = new PlayerController();
        player.play(audioFilePath);

        class SayHello extends TimerTask {
            public void run() {
                System.out.println("Hello World!");
                player.play(audioFilePath);
            }
        }

        // And From your main() method or any other method
        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 1000);
        timer.cancel();

        //player.play(audioFilePath);
        */
    }


}
