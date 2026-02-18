import Excepciones.AsignaturaNoValida;
import Excepciones.NotaNoValida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static ArrayList<ArrayList<Integer>> notas;
    private static ArrayList<ArrayList<String>> asignaturas;
    private static ArrayList<String> nombres;
    private static Scanner sc;

    public static void main(String[] args) {
        try
        {
            notas = new ArrayList<>();
            asignaturas = new ArrayList<>();
            nombres = new ArrayList<>();

            sc = new Scanner(System.in);

            recogerDatos();
            calcularMediaProgramacion();
            calcularMediaAlumno();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void recogerDatos()throws Exception{
        String masAlumnos;
        boolean error;
        do
        {

            System.out.println("Teclea el nombre del alumno o alumna");
            String nombre = sc.nextLine();
            nombres.add(nombre);

            asignaturas.add(new ArrayList<>());
            notas.add(new ArrayList<>());

            solicitarAsignaturas();

            System.out.println("Hay más alumnos");
            masAlumnos = sc.nextLine();
        }
        while(masAlumnos.equalsIgnoreCase("si"));

        visualizarDatos();
    }

    public static void solicitarAsignaturas() throws Exception
    {

        String[] asignaturasValidas = {"PROG", "LM","ED","BD","I","IPEI1","DIGI","SOS"};

        List<String> listaAsignaturasValidas = Arrays.asList(asignaturasValidas);
        boolean error;
        String respuesta="";

        do {
            try {
                System.out.println("Teclea el nombre de la asignatura");
                String asignatura = sc.nextLine();
                asignatura = asignatura.toUpperCase();

                if (!listaAsignaturasValidas.contains(asignatura))
                    throw new AsignaturaNoValida();

                asignaturas.get(asignaturas.size() - 1).add(asignatura);

                System.out.println("Teclea nota");
                int nota = sc.nextInt();
                if (nota < 0 || nota > 10)
                    throw new NotaNoValida();

                notas.get(notas.size() - 1).add(nota);
                sc.nextLine();

                System.out.println("¿ Tiene más asignaturas?");
                respuesta = sc.nextLine();
                error = false;
            }
            catch(AsignaturaNoValida | NotaNoValida e)
            {
                System.out.println("Asignatura no valida");
                error = true;
            }
        }
        while (respuesta.equalsIgnoreCase("si") || error);
    }

    public static void visualizarDatos()throws Exception
    {
        for(int x = 0; x < nombres.size(); x++)
        {
            System.out.println(nombres.get(x));

            for (int y=0; y < asignaturas.get(x).size(); y++)
            {
                System.out.print(asignaturas.get(x).get(y) + "\t");
                System.out.println(notas.get(x).get(y));
            }
        }
    }

    public static void calcularMediaProgramacion() throws Exception{
        int contador = 0;
        int sumaNotas = 0;
        for ( int x = 0; x < asignaturas.size(); x++)
        {
            int posicion = asignaturas.get(x).indexOf("PROG");
            if (posicion != -1)
            {
                sumaNotas += notas.get(x).get(posicion);
                contador++;
            }
        }
        System.out.println("La nota media en la asignatura de programación es: " + (sumaNotas / contador));
    }

    public static void calcularMediaAlumno() throws Exception{
        int sumaNotas;
        for ( int x = 0; x < asignaturas.size(); x++)
        {
            sumaNotas = 0;
            for(int y = 0; y < asignaturas.get(x).size(); y++)
            {
                sumaNotas += notas.get(x).get(y);
            }
            System.out.println("La nota media de " + nombres.get(x) + " es: " + (sumaNotas / asignaturas.get(x).size()));
        }
    }
}