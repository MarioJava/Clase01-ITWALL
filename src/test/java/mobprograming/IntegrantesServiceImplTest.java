package mobprograming;

import mobprograming.impl.IntegratesServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by maliaga on 17-03-16.
 */
public class IntegrantesServiceImplTest {

    IntegrantesService service = null;

    @Before
    public void setUp() {
        service = new IntegratesServiceImpl();
    }

    @Test
    public void deberiaObtenerIntegrantes() {

        Integrante[] integrantes = service.creaIntegrantes();

        assertNotNull(integrantes);

        for (Integrante integrante : integrantes) {
            System.out.println(integrante.toString());
        }
    }

    @Test
    public void deberiaEntregarIntegranteMayorEdad() {

        Integrante integranteMayorEdad = service.getIntegranteMayorEdad();

        assertNotNull(integranteMayorEdad);

        System.out.println();
        System.out.println(integranteMayorEdad.toString());
        System.out.println();
    }

    @Test
    public void deberiaEntregarIntegranteNombreMasLargo() {

        Integrante integranteNombreMasLargo = service.getIntegranteNombreMasLargo();

        assertNotNull(integranteNombreMasLargo);
        System.out.println();
        System.out.println(integranteNombreMasLargo.toString());
        System.out.println();
    }

    @Test
    public void deberiaListarTodosLosIntegrantes() {

        Integrante[] integrantes = service.creaIntegrantes();

        System.out.println();
        service.showIntegrantes();
        System.out.println();

        assertNotNull(integrantes);

    }

    @Test
    public void deberiaEntregarLaSumaDeLAsEdades() {

        int sumaEdad = service.getSumaEdad();

        System.out.println();
        System.out.println("La suma de las edades es : " + sumaEdad);
        System.out.println();

        assertEquals(sumaEdad, 165);

    }
}
