/*
Crea una matriz de cuatro filas y cuatro columnas de numeros enteros
que inicialmente esta vacía, nos piden hacer un menu con estas
opciones:

1.- Rellenar toda la matriz de números, debes pedirselos al usuario.
2.- Suma de una fila que se pedirá al usuario (controlar que elija una
correcta).
3.- Suma de una columna que se pedira al usuario (controlar que
elija una correcta).
4.- Sumar la diagonal principal
5.- Sumar la diagonal inversa
6.- La media de todos los valores de la matriz.
7.- Salir.
Hasta que no se haga la primera opci´on, el resto de opciones no se
deberán de ejecutar, simplemente mostrar un mensaje donde diga que
deben rellenar la matriz.
*/

import Excepciones.*;
import javax.swing.JOptionPane;

public class Main {

    private static int[][] matriz; // declaración
    private static boolean rellena; // Hay datos o no en la matriz?

    public static void main(String[] args) {
        try
        {
            matriz = new int[4][4]; // creación
            rellena=false; // inicialización
            int opcion=0;
            while(opcion != 7)
            {
                opcion=mostrarMenu();

                switch (opcion) {
                    case 1 -> rellenar();
                    case 2, 3, 4, 5, 6 -> {
                        if (rellena)
                            switch (opcion) {
                                case 2 -> sumarFila();
                                case 3 -> sumarColumna();
                                case 4 -> sumarDiagonalPrincipal();
                                case 5 -> sumarDiagonalInversa();
                                case 6 -> calcularMedia();
                            }
                        else
                            JOptionPane.showMessageDialog(null, "Primero hay que rellenar la matriz");
                    }
                    case 7 -> JOptionPane.showMessageDialog(null, "Hasta otra");
                    default ->
                        // throw new DatoNoValido();
                            JOptionPane.showMessageDialog(null, "Opción no valida");
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas no identificados " + e.getMessage());
        }

    }

    public static int mostrarMenu() throws Exception
    {
        // Muestra el menú
        int opcion=0;
        boolean correcto=false;
        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        1.- Rellenar toda la matriz\s
                        2.- Suma de una fila
                        3.- Suma de una columna
                        4.- Sumar la diagonal principal
                        5.- Sumar la diagonal inversa
                        6.- La media de todos los valores de la matriz.
                        7.- Salir.\s"""));

                // También lo podemos hacer con un showOptions
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "La opción tiene que ser un número");
            }
            // throw new DatoNoValido()
        }
        while(!correcto);
        return opcion;
    }

    public static void rellenar() throws Exception
    {
        // Rellena las filas y columnas con los datos tecleados por el usuario.
        for(int x = 0; x < matriz.length; x++)
            for(int y=0; y < matriz[x].length; y++)
                matriz[x][y] = solicitarNumero("Teclea el número de la fila " + x + " y columna " + y);
        rellena = true;
        mostrar();
    }

    public static void mostrar() throws Exception{
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int solicitarNumero(String mensaje) throws Exception
    {
        boolean correcto = false;
        int nro=0;
        do{
            try
            {
                nro=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                correcto = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "El dato debe ser numérico");
            }
        }
        while(!correcto);
        return nro;
    }

    public static void sumarFila() throws Exception{
        // Suma los numeros de una fila
        boolean error = true;
        do
        {
            try
            {
                int fila=solicitarNumero("Teclea el número de la fila (0-3)");
                if (fila < 0 || fila >= matriz.length)
                    throw new DatoNoValido();
                int suma = 0;
                for(int x = 0; x < matriz[fila].length; x++)
                    suma+=matriz[fila][x];
                JOptionPane.showMessageDialog(null, " La suma de todos los números de la fila " + fila + " es igual a " + suma);
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "La fila indicada no es correcta");
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "7.- Salir");
            }
        }
        while(error);
    }

    public static void sumarColumna() throws Exception{
        boolean error = true;
        do
        {
            try
            {
                int col=solicitarNumero("Teclea el número de la columna (0-3)");
                if (col < 0 || col > 3)
                    throw new DatoNoValido();
                int suma = 0;
                for(int x = 0; x < matriz[0].length; x++)
                    suma+=matriz[x][col];
                JOptionPane.showMessageDialog(null, " La suma de todos los números de la columna " + col + " es igual a " + suma);
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, "La columna indicada no es correcta");
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null, "7.- Salir");
            }
        }
        while(error);
    }

    public static void sumarDiagonalPrincipal() throws Exception{
        int suma = 0;
        for(int x = 0; x < matriz.length; x++)
            suma+=matriz[x][x];
        JOptionPane.showMessageDialog(null, " La suma de todos los números de la diagonal principal es igual a " + suma);
    }

    public static void sumarDiagonalInversa() throws Exception{
        int suma = 0;
        for(int x = 0,y=3; y >=0; x++,y--)
            suma+=matriz[x][y];
        JOptionPane.showMessageDialog(null, " La suma de todos los números de la diagonal inversa es igual a " + suma);
    }

    public static void calcularMedia() throws Exception{
        int suma = 0;
        for (int[] filas : matriz)
            for (int y = 0; y < filas.length; y++)
                suma += filas[y];
        int media = suma/(matriz.length * matriz[0].length);
        JOptionPane.showMessageDialog(null, " La media es igual a " + media);
    }

}

