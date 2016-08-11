package com.marioaliaga.arreglopersonas;

/**
 * Created by maliaga on 15-03-16.
 */
public class App {

    public static Persona[] getArregloPersonas() {
        Persona p1 = new Persona();
        p1.setEdad(10);
        p1.setNombre("Mario");

        Persona p2 = new Persona();
        p2.setEdad(102);
        p2.setNombre("Mario 2");

        Persona p3 = new Persona();
        p3.setEdad(103);
        p3.setNombre("Mario 3");


        Persona p4 = new Persona();
        p4.setEdad(104);
        p4.setNombre("Mario 4");

        Persona p5 = new Persona();
        p5.setEdad(105);
        p5.setNombre("Mario 5");

        Persona[] arr = {p1, p2, p3, p4, p5};

        for (Persona p : arr) {
            System.out.println("La edad es :" + p.getEdad());
            System.out.println("EL nombre es " + p.getNombre());
        }

        return arr;
    }

    public static void main(String... args) {
        getArregloPersonas();
    }
}
