import com.marioaliaga.App;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Created by maliaga on 14-03-16.
 */

public class AppTest {

    @Test
    public void deberiaMostrarArrPOrConsola(){

        int [] arr = App.getArreglo();

        assertNotNull(arr);
        assertEquals(arr.length,9);
    }
}
