package arreglopersonas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by maliaga on 16-03-16.
 */
public class AppTest {
    @Test
    public void deberiaObteherArregloPersonas() {
        Persona[] arr = arreglopersonas.App.getArregloPersonas();

        assertNotNull(arr);
        assertEquals(arr.length, 5);
    }
}
