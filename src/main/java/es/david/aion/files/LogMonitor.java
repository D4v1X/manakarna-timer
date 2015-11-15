package es.david.aion.files;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */

import es.david.aion.events.EventListener;
import es.david.aion.events.EventType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Crazy Natrim
 */
public class LogMonitor {

    private List<EventListener> listeners = new ArrayList<EventListener>();

    public void addListener(EventListener toAdd) {
        listeners.add(toAdd);
    }

    public void filterChat(String logFile) {

        try {
            FileReader theFile = new FileReader(logFile);
            BufferedReader br = new BufferedReader(theFile);
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    Thread.sleep(500);
                } else {
                    // do something with line

                    if (line.contains(EventType.DRAKE.getEventType())) {
                        for (EventListener eventListener : listeners) {
                            eventListener.addEvent(EventType.DRAKE);
                        }
                    }
                    if (line.contains(EventType.REMOVESEAL.getEventType())) {
                        for (EventListener eventListener : listeners) {
                            eventListener.addEvent(EventType.REMOVESEAL);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
