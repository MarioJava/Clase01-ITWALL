package com.marioaliaga.arreglo3personas;

import java.util.List;

/**
 * Created by maliaga on 8/16/16.
 */
public class PersonaService {

    public void mp(List<Persona> p){
        for (Persona per : p){
            System.out.println(per.toString());
        }
    }

    public Persona getPesonaMenosEdad(List<Persona> per){
        Persona obj = null;
        int edadMenor = 100000;
        for (Persona p : per){
           if (p.getEdad() < edadMenor){
               edadMenor = p.getEdad();
               obj = p;
           }
        }
        return obj;
    }
}
