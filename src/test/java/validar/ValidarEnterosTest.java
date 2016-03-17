package validar;

import org.junit.Test;

/**
 * Created by maliaga on 16-03-16.
 */
public class ValidarEnterosTest {

    @Test
    public void deberiaObtenerTrue() {

        ValidarEnteros validarEnteros = new ValidarEnteros();

        org.junit.Assert.assertTrue(validarEnteros.validarMayor(20, 9));
    }
}
