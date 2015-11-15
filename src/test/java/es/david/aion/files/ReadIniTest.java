package es.david.aion.files;

import org.junit.Test;

/**
 * Created by Ismael Ojeda Perez on 15/11/2015.
 */
public class ReadIniTest {

    ReadIni readIni = new ReadIni();
    @Test
    public void testLoad() throws Exception {
        String logFileName = readIni.load("src/main/resources/config.ini");
        System.out.println(logFileName);

    }
}