package es.david.aion.files;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class LogMonitorTest {

    LogMonitor logMonitor = new LogMonitor();

    @Test
    public void testFilterChat() throws Exception {
        //logMonitor.filterChat("/Users/davidsantiago/IdeaProjects/manakarna-timer/Chat.log");
        logMonitor.filterChat("/Users/davidsantiago/IdeaProjects/manakarna-timer/Chat.log");
    }
}