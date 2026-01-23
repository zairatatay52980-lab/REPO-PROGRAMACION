package Modelos;

import java.time.LocalDate;

public class Mascota {
    protected String raza;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String sexo;
    protected double peso;

    private Cliente propietario;
    private Veterinario veterinario;


    public Mascota(String raza, String nombre, LocalDate fechaNacimiento, String sexo, double peso, Cliente propietario, Veterinario veterinario) {
        this.raza = raza;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.propietario = propietario;
        this.veterinario = veterinario;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cliente getPropietario() {
        return propietario;
    }
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
