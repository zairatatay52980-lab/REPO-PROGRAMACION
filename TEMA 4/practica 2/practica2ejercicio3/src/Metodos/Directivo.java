package Metodos;

import java.util.List;

public class Directivo extends Empleado{

    private String categoria;
    private List<Empleado> subordinados;


    public Directivo(int edad, String nombre, double sueldoBruto, String categoria) {
        super(edad, nombre, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(List<Empleado> subordinados) {
        this.subordinados = subordinados;
    }


    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                '}';
    }
}
