package com.marioaliaga.arreglos;

import com.marioaliaga.arreglopersonas.Persona;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by maliaga on 16-03-16.
 */
public class MatricesTest {

    @Test
    public void deberiaObtenerUnaMatriz() {

        int matriz[][] = new Matrices().getMatriz();

        assertNotNull(matriz);
        assertNotEquals(matriz, new Persona[3][3]);
    }
}
