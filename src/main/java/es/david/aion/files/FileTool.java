package es.david.aion.files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class FileTool {
    public void filterChat() throws URISyntaxException, IOException {
        //URI uri = this.getClass().getResource(chat).toURI();
        File theFile = new File("/Users/davidsantiago/IdeaProjects/manakarna-timer/Chat.log");
        LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("/Users/davidsantiago/IdeaProjects/manakarna-timer/Chat2.log"));
            boolean writeBool = false;
            while (it.hasNext()) {
                String line = it.nextLine();
                // do something with line
                if (line.contains("2015.11.13 23:46:31 : All alliance members are ready.")) writeBool = true;
                if (line.contains("2015.11.14 00:00:49 : The extraction of the relic is complete. Beritra has disappeared.")) writeBool = false;
                if (writeBool) {
                    writer.write(line);
                    writer.write("\n");
                    System.out.println(line);
                }
            }
        } finally {
            LineIterator.closeQuietly(it);
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }


    public void lol2() {
        BufferedWriter writer = null;
        try {
            //create a temporary file
            String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File logFile = new File(timeLog);

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write("Hello world!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }

    /*
    public void filterChatwrite(String chat) throws URISyntaxException, IOException {
        FileUtils.writeStringToFile(file, "String to append", true);
    }*/
}
