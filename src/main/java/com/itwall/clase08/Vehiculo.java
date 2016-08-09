package com.itwall.clase08;

/**
 * Created by maliaga on 8/8/16.
 */
public abstract class Vehiculo {

    public String matricula;

    public abstract String getMatricula();

    public String getModelo(){
        return "Retorna Modelo del Vehiculo";
    }
}
