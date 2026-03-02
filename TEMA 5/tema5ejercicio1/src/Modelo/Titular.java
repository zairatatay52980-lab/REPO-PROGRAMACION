package Modelo;

public class Titular{


    private String nombre;
    private int id;
    private String dni;

    public Titular() {
    }

    public Titular(String nombre, int id, String dni) {
        this.nombre = nombre;
        this.id = id;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
