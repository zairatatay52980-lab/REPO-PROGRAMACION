import Modelo.Alumno;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public static void main(String[] args) {

        try {
            listaAlumno();
            buscarAlumnoPorCodigo();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public static void listaAlumno(){
        Alumno alumno1 = new Alumno("1", "Patricio Estrella", "Salchica 1", "999999999");
        Alumno alumno2 = new Alumno("2", "Pablito clavo un clavito", "Salchicha 2", "999999998");
        Alumno alumno3 = new Alumno("3", "Tres tristes tigres comieron trigo", "Salchica 3", "999999997");
    }

    public static void buscarAlumnoPorCodigo(){
        int buscarCodigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del alumno"));
        int i;
        for (i = 0; i < alumnos.size() &&  buscarCodigo != alumnos.get(i).getCodigo(); i++) {}

        if (i == alumnos.size()) {}

        JOptionPane.showMessageDialog(null, "Codigo: "+ alumnos.get(i).getCodigo() + "\nNombre: " + alumnos.get(i).getNombre()+ "\nDomicilio: "+alumnos.get(i).getDomicilio()+ "\nTelefono: "+alumnos.get(i).getTelefono());

    }

}
