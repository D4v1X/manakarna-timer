package es.david.aion.files;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author Crazy Natrim
 */
public class LogMonitor
{
    public void filterChat(String chat) throws URISyntaxException, IOException, InterruptedException {
        String filename = "/Users/davidsantiago/IdeaProjects/manakarna-timer/Chat.log";
        FileReader theFile = new FileReader(filename);
        BufferedReader br = new BufferedReader(theFile);
        while (true) {
            String line = br.readLine();
            if (line == null) {
                Thread.sleep(500);
            } else {
                // do something with line

                if (line.contains("Seal")) {
                    System.out.println(line);
                }
            }
        }
    }
}
