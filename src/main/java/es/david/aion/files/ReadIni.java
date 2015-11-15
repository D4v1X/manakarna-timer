package es.david.aion.files;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */
public class ReadIni {
    public static String load(String iniFile) {

        String logDirName = "";
        String logFileName = "";
        try {
            Wini ini = new Wini(new File(iniFile));
            logDirName = ini.get("LogFile", "directory", String.class);
            logFileName = ini.get("LogFile", "filename", String.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (logDirName + logFileName);
    }
}
