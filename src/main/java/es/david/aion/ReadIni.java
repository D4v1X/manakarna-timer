package es.david.aion;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */
public class ReadIni {
    public void filterChat(String chat) throws URISyntaxException, IOException, InterruptedException {
        String iniFileName = this.getClass().getResource(chat).toString();
        Wini ini = new Wini(new File(iniFileName));
        String logFileName = ini.get("LogFile", "name", String.class);
    }
}
