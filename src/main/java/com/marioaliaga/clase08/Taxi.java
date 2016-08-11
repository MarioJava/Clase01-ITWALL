package com.marioaliaga.clase08;

/**
 * Created by maliaga on 8/8/16.
 */
public class Taxi extends Vehiculo implements ControlVehiculo, ControlPersonas {

    private int numeroRuedas;

    public String getMatricula() {
        return "Matricula";
    }

    @Override
    public String getModelo() {
        return "MI modelo acá es un Taxi";
    }

    public int controlCombustible(int litros) {
        if(litros > 30){
            return 0;
        }else{
            return litros;
        }
    }

    public String validarCantidadDePersonas(Integer cantPersonas) {
        if(cantPersonas > 4){
            return "Vehiculo está lleno";
        }else{
            return "Aún ca....";
        }
    }
}
