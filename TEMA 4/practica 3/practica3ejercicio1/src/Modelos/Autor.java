package Modelos;

import java.time.LocalDate;

public class Autor extends Persona {


    public Autor() {
    }

    public Autor(String nombre, LocalDate fechanacimiento, String paisNacimiento) {
        super(nombre, fechanacimiento, paisNacimiento);
    }



}
