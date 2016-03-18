package mobprograming;

/**
 * Created by maliaga on 17-03-16.
 */
public interface IntegrantesService {

    Integrante[] creaIntegrantes();

    Integrante getIntegranteMayorEdad();

    Integrante getIntegranteNombreMasLargo();

    void showIntegrantes();

    int getSumaEdad();

}
