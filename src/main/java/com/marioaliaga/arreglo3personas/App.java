package com.marioaliaga.arreglo3personas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maliaga on 8/10/16.
 */
public class App {

    public static void main(String ... arg){

        Persona persona1 = new Persona("nombre 1", "apellido 1", 10);
        Persona persona2 = new Persona("nombre 2", "apellido 2", 20);
        Persona persona3 = new Persona("nombre 3", "apellido 3", 30);

        List<Persona> arr = new ArrayList<Persona>(0);
        arr.add(persona1);
        arr.add(persona2);
        arr.add(persona3);

        PersonaService ser = new PersonaService();
        ser.mp(arr);

        Persona personaMenor = ser.getPesonaMenosEdad(arr);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("La persona Menor es:");
        System.out.println(personaMenor.toString());

    }

}
