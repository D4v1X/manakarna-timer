package es.david.aion.files;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Crazy Natrim
 */
public class LogMonitor
{
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

                    if (line.contains("Seal")) {
                        System.out.println(line);
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
