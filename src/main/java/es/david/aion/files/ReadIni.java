package es.david.aion.files;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */
public class ReadIni {
    public static String load() {

        String logDirName = "";
        String logFileName = "";
        try {
            File file = new File(ReadIni.class.getProtectionDomain().getCodeSource().getLocation().getFile());
            String path = file.getParent() + File.separator + "ManakarnaConfig.ini";
            Wini ini = new Wini(new File(path));
            logDirName = ini.get("LogFile", "directory", String.class);
            logFileName = ini.get("LogFile", "filename", String.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (logDirName + File.separator +logFileName);
    }
}
