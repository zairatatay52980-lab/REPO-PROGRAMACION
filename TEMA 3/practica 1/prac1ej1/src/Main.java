import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            Double[] arrayNumeros = new Double[10];


            entradaDatos(arrayNumeros);

            salidaDatosUno(arrayNumeros);
            salidaDatosDos(arrayNumeros);
            salidaDatosTres(arrayNumeros);
            salidaDatosCuatro(arrayNumeros);
            salidaDatosCinco(arrayNumeros);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas " + e.getClass());
        }
    }
    private static void entradaDatos(Double[] arrayNumeros) throws Exception
    {

        for(int x=0; x<arrayNumeros.length; x++)
        {
            try
            {
                arrayNumeros[x] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la posición " + x));
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Hay que teclear numeros.");
                x--;
            }
        }
        // Sin return. arrayNumeros no ha sido modificado.

    }

    private static void salidaDatosUno(Double[] arrayNumeros) throws Exception {
        // Inicializo máximo y mínimo con el primer número.
        double cantidadMinima = arrayNumeros[0];
        double cantidadMaxima = arrayNumeros[0];

        for (int x = 1; x < arrayNumeros.length; x++) {
            if (arrayNumeros[x] < cantidadMinima)
                cantidadMinima = arrayNumeros[x];
            else if (arrayNumeros[x] > cantidadMaxima)
                cantidadMaxima = arrayNumeros[x]; // Actualizamos el valor de máximo.

            JOptionPane.showMessageDialog(null, "1.- El maximo valor  " + cantidadMaxima + " y el mínimo " + cantidadMinima);
        }
    }

    private static void salidaDatosDos(Double[] arrayNumeros) throws Exception
    {
        double cantidadMinima = Double.MAX_VALUE;
        double cantidadMaxima = Double.MIN_VALUE;

        // for mejorado
        for (double elemento: arrayNumeros)
        {
            if (elemento < cantidadMinima)
                cantidadMinima = elemento;
            if (elemento > cantidadMaxima)
                cantidadMaxima = elemento;
        }

        JOptionPane.showMessageDialog(null, "2.- El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);
    }

    private static void salidaDatosTres(Double[] arrayNumeros) throws Exception
    {
        // Ordeno de menor a mayor.
        Arrays.sort(arrayNumeros);

        double cantidadMinima = arrayNumeros[0];
        double cantidadMaxima = arrayNumeros[arrayNumeros.length-1];

        JOptionPane.showMessageDialog(null, "3.- El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);
    }

    private static void salidaDatosCuatro(Double[] arrayNumeros) throws Exception{
        // Convierto en lista para poder usar métodos de Collections
        List<Double> lista = Arrays.asList(arrayNumeros);

        Double max = Collections.max(lista);
        Double min= Collections.min(lista);

        JOptionPane.showMessageDialog(null, "4.- El máximo valor  " + max+ " y el mínimo "+ min);
    }

    private static void salidaDatosCinco(Double[] arrayNumeros) throws Exception{

        double max = Arrays.stream(arrayNumeros)
                .max(Double::compare)
                .get();

        double min = Arrays.stream(arrayNumeros).min((a, b) -> Double.compare(a, b)).get();

        JOptionPane.showMessageDialog(null, "5.- El máximo valor  " + max+ " y el mínimo "+ min);
    }

}