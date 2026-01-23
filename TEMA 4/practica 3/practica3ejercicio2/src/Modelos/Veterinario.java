package Modelos;

import java.util.ArrayList;

public class Veterinario extends Persona {

    private String dni;
    private int nss; //numero seguridad social


    public Veterinario(String nombre, String direccion, int telefono, String dni, int nss) {
        super(nombre, direccion, telefono);
        this.dni = dni;
        this.nss = nss;
    }

    public Veterinario(String nombre, String direccion, int telefono, ArrayList<Mascota> listaMascotas, String dni, int nss) {
        super(nombre, direccion, telefono, listaMascotas);
        this.dni = dni;
        this.nss = nss;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNss() {
        return nss;
    }
    public void setNss(int nss) {
        this.nss = nss;
    }


}
