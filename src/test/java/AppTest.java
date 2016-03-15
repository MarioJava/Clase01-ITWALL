
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by maliaga on 14-03-16.
 */

public class AppTest {

    @Test
    public void deberiaMostrarArrPOrConsola(){

        int [] arr = App.getArreglo();

        assertEquals(arr.length,9);
    }
}
