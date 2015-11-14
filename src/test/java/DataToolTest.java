import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by davidsantiago on 14/11/15.
 */
public class DataToolTest {

    DataTool dataTool = new DataTool();

    @Test
    public void filterChat(){
        try {
            dataTool.filterChat("Chat.log");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}