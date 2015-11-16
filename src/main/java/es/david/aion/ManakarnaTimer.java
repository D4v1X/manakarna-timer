package es.david.aion;

import es.david.aion.events.EventDrake;
import es.david.aion.events.EventManager;
import es.david.aion.files.LogMonitor;
import es.david.aion.files.ReadIni;
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
        // Load Config
        String logFileUri = ReadIni.load();

        // Create EventManager
        // Create Hashmap Events
        EventManager eventManager = new EventManager("Manakarna");

        // Activate LogMonitor
        // LogMonitor Search
        // LogMonitor addEvent
        LogMonitor logMonitor = new LogMonitor();
        logMonitor.addListener(eventManager);
        logMonitor.filterChat(logFileUri);

    }

}
