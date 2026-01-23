package Modelos;

import java.time.LocalDate;

public class Perro extends Mascota {

    public Perro(String raza, String nombre, LocalDate fechaNacimiento, String sexo, double peso, Cliente propietario, Veterinario veterinario) {
        super(raza, nombre, fechaNacimiento, sexo, peso, propietario, veterinario);
    }


}
