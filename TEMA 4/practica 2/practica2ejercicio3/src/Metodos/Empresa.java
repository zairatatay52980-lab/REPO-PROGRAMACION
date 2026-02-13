package Metodos;

import java.util.List;

public class Empresa {
    private String nombre;
    private List<Cliente> listaClientes;
    private List<Empleado> listaEmpleados;

    public Empresa(String nombre, List<Cliente> listaClientes, List<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa(String nombre, List<Cliente> listaClientes) {
        this.nombre = nombre;
        this.listaClientes = listaClientes;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                '}';
    }



}
