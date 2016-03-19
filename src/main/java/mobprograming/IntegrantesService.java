package mobprograming;

/**
 * Created by maliaga on 17-03-16.
 */
public interface IntegrantesService {

    Integrante[] creaIntegrantes();

    Integrante getIntegranteMayorEdad(Integrante[] integrantes);

    Integrante getIntegranteNombreMasLargo(Integrante[] integrantes);

    void showIntegrantes(Integrante[] integrantes);

    int getSumaEdad(Integrante[] integrantes);

}
