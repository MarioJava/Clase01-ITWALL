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
        System.out.println();
        System.out.println("deberiaObtenerIntegrantes");

        Integrante[] integrantes = service.creaIntegrantes();

        assertNotNull(integrantes);

        for (Integrante integrante : integrantes) {
            System.out.println(integrante.toString());
        }
    }

    @Test
    public void deberiaEntregarIntegranteMayorEdad() {

        System.out.println();
        System.out.println("deberiaEntregarIntegranteMayorEdad");

        Integrante integranteMayorEdad = service.getIntegranteMayorEdad(service.creaIntegrantes());

        assertNotNull(integranteMayorEdad);

        System.out.println();
        System.out.println(integranteMayorEdad.toString());
        System.out.println();
    }

    @Test
    public void deberiaEntregarIntegranteNombreMasLargo() {

        System.out.println();
        System.out.println("deberiaEntregarIntegranteNombreMasLargo");

        Integrante integranteNombreMasLargo = service.getIntegranteNombreMasLargo(service.creaIntegrantes());

        assertNotNull(integranteNombreMasLargo);
        System.out.println();
        System.out.println(integranteNombreMasLargo.toString());
        System.out.println();
    }

    @Test
    public void deberiaListarTodosLosIntegrantes() {

        System.out.println();
        System.out.println("deberiaListarTodosLosIntegrantes");

        Integrante[] integrantes = service.creaIntegrantes();

        assertNotNull(integrantes);

        System.out.println();
        service.showIntegrantes(integrantes);
        System.out.println();


    }

    @Test
    public void deberiaEntregarLaSumaDeLAsEdades() {

        System.out.println();
        System.out.println("deberiaEntregarLaSumaDeLAsEdades");

        int sumaEdad = service.getSumaEdad(service.creaIntegrantes());

        System.out.println();
        System.out.println("La suma de las edades es : " + sumaEdad);
        System.out.println();

        assertEquals(sumaEdad, 165);

    }
}
