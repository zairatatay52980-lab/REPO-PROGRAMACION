import java.util.Scanner;

public class Main
{
    private static Scanner sc = new Scanner(System.in);
    private static double[][] notas;

    public static void main(String[] args) {
        try
        {
            solicitarDatos();
            calcularMediaAlumno();
            calcularMediaAsignatura();
            buscarNotaMasAltaMasBaja();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void solicitarDatos() throws Exception
    {
        // Faltan las validaciones
        System.out.print("Número de alumnos: ");
        int numAlumnos = sc.nextInt();

        System.out.print("Número de asignaturas: ");
        int numAsignaturas = sc.nextInt();

        // Crear el array bidimensional
        notas = new double[numAlumnos][numAsignaturas];

        // Notas de cada alumno
        for (int i = 0; i < numAlumnos; i++)
        {
            for (int j = 0; j < numAsignaturas; j++)
            {
                System.out.print("Nota del alumno " + (i + 1) +
                        " en la asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
    }

    public static void calcularMediaAlumno() throws Exception{
        // Calcular y mostrar medias por alumno
        System.out.println("\nMedia por alumno");
        for (int i = 0; i < notas.length; i++)
        {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++)
            {
                suma += notas[i][j];
            }
            System.out.println("Alumno " + (i + 1) + ": " + (suma / notas[0].length));
        }
    }

    public static void calcularMediaAsignatura() throws Exception
    {
        // Calcular y mostrar medias por asignatura
        System.out.println("\n Media por asignatura ");
        for (int j = 0; j < notas[0].length; j++)
        {
            double suma = 0;
            for (int i = 0; i < notas.length; i++)
            {
                suma += notas[i][j];
            }
            System.out.println("Asignatura " + (j + 1) + ": " + (suma / notas.length));
        }
    }

    public static void buscarNotaMasAltaMasBaja() throws Exception
    {
        // Encontrar nota más alta y más baja
        double notaMax = notas[0][0];
        double notaMin = notas[0][0];
        for (int i = 0; i < notas.length; i++)
        {
            for (int j = 0; j < notas[i].length; j++)
            {
                if (notas[i][j] > notaMax)
                    notaMax = notas[i][j];
                if (notas[i][j] < notaMin)
                    notaMin = notas[i][j];
            }
        }
        System.out.println("\nNota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);
    }


}