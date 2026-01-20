package Modelos;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected LocalDate fechanacimiento;
    protected String paisNacimiento;


    public Persona() {
    }

    public Persona(String nombre, LocalDate fechanacimiento, String paisNacimiento) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.paisNacimiento = paisNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }
}
