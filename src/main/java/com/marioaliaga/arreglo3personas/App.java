package com.marioaliaga.arreglo3personas;

/**
 * Created by maliaga on 8/10/16.
 */
public class App {

    public static void main(String ... arg){

        Persona persona1 = new Persona("nombre 1", "apellido 1", 1);
        Persona persona2 = new Persona("nombre 2", "apellido 2", 2);
        Persona persona3 = new Persona("nombre 3", "apellido 3", 3);

        Persona [] personas = {persona1, persona2, persona3};

        for(int i = 0 ; i < personas.length ; i++){
            System.out.println(personas[i].toString());
        }

    }
}
