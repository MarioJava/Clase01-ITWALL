package ejemplostatic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by maliaga on 17-03-16.
 */
public class AppTest {

    @Test
    public void deberiaObtenerContadorStatico() {
        App app = new App();

        assertEquals(app.getStatic(), 3);
    }
}
