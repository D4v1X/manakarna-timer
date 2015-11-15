package es.david.aion;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by davidsantiago on 14/11/15.
 */
public class DataTool {

    public DataTool() {

    }

    public void filterChat(String chat) throws URISyntaxException, IOException {
        URI uri = this.getClass().getResource(chat).toURI();
        File theFile = new File(uri);
        LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                // do something with line
                if (line.contains("Seal")){
                    System.out.println(line);
                }
            }
        } finally {
            LineIterator.closeQuietly(it);
        }
    }

    /*
    public void filterChatwrite(String chat) throws URISyntaxException, IOException {
        FileUtils.writeStringToFile(file, "String to append", true);
    }*/
}
