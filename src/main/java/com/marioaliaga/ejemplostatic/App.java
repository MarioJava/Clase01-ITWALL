package com.marioaliaga.ejemplostatic;

/**
 * Created by maliaga on 17-03-16.
 */
public class App {

    public int getStatic() {

        Persona persona = new Persona();
        System.out.println(Persona.contador);

        Persona persona2 = new Persona();
        System.out.println(Persona.contador);

        Persona persona3 = new Persona();
        System.out.println(Persona.contador);

        return Persona.contador;

    }
}
