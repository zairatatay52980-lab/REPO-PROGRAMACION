package Modelos;

import java.util.ArrayList;

public class Cliente extends Persona{

    public Cliente(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    public Cliente(String nombre, String direccion, int telefono, ArrayList<Mascota> listaMascotas) {
        super(nombre, direccion, telefono, listaMascotas);
    }
}
