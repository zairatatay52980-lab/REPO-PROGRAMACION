package Modelo;

public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;


    public Alumno() {
    }

    public Alumno(String codigo) {
        this.codigo = codigo;
    }

    public Alumno(String codigo, String nombre, String domicilio, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
