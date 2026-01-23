package Modelos;

import java.time.LocalDate;

public class Gato extends Mascota {

    public Gato(String raza, String nombre, LocalDate fechaNacimiento, String sexo, double peso, Cliente propietario, Veterinario veterinario) {
        super(raza, nombre, fechaNacimiento, sexo, peso, propietario, veterinario);
    }
}
