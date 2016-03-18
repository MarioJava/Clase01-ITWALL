package mobprograming;

import lombok.Data;

/**
 * Created by maliaga on 17-03-16.
 */
@Data
public class Relator extends Integrante {

    public String ensegna;

    public Relator(String nombre, String apellido, int edad, String ensegna) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setEnsegna(ensegna);
    }


    @Override
    public String toString() {
        return "Relator{" +
                " ensegna='" + getEnsegna() + '\'' +
                " nombre='" + getNombre() + '\'' +
                " apellido='" + getApellido() + '\'' +
                " edad='" + getEdad() + '\'' +
                '}';
    }
}
