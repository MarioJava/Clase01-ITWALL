package com.marioaliaga.mobprograming;

import lombok.Data;

/**
 * Created by maliaga on 17-03-16.
 */
@Data
public class Alumno extends Integrante {

    public int telefono;

    public Alumno(String nombre, String apellido, int edad, int telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setTelefono(telefono);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                " telefono=" + getTelefono() +
                " nombre='" + getNombre() + '\'' +
                " apellido='" + getApellido() + '\'' +
                " edad='" + getEdad() + '\'' +
                '}';
    }
}
