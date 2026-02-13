import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Main {

    /* Crear un array de 10 elementos para guardar en él valores de tipo real
    (float o double) que iremos introduciendo por teclado hasta finalizar.
    Una vez leídos y almacenados se visualizará el valor máximo y el
    mínimo.*/

    public static void main(String[] args) {
        try
        {
            // Declaración y creación del array. Podría ser una variable global.
           Double[] arrayNumeros= new Double[10];
           // Double para usar alguna de las últimas formas.

            // Guardar datos
            entradaDatos(arrayNumeros);

            // Visualizar el máximo y el mínimo de cinco maneras diferentes.
            salidaDatosUno(arrayNumeros);
            salidaDatosDos(arrayNumeros);
            salidaDatosTres(arrayNumeros);
            salidaDatosCuatro(arrayNumeros);
            salidaDatosCinco(arrayNumeros);
        }
        catch(Exception e)
        {
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

    private static void salidaDatosUno(Double[] arrayNumeros) throws Exception
    {
        // Inicializo máximo y mínimo con el primer número.
        double cantidadMinima = arrayNumeros[0];
        double cantidadMaxima = arrayNumeros[0];

        for (int x = 1; x < arrayNumeros.length; x++)
        {
            if (arrayNumeros[x] < cantidadMinima)
                cantidadMinima = arrayNumeros[x]; // Actualizamos mínimo
            else
                if (arrayNumeros[x] > cantidadMaxima)
                    cantidadMaxima = arrayNumeros[x]; // Actualizamos el valor de máximo.
        }

        JOptionPane.showMessageDialog(null, "1.- El maximo valor  " + cantidadMaxima+ " y el mínimo "+ cantidadMinima);
    }

    private static void salidaDatosDos(Double[] arrayNumeros) throws Exception
    {
        // Inicializo máximo y mínimo con valores muy grandes o muy pequeños.
        double cantidadMinima = Double.MAX_VALUE;
        double cantidadMaxima = Double.MIN_VALUE;

        // for mejorado
        for (double elemento: arrayNumeros)
        {
            if (elemento < cantidadMinima)
                cantidadMinima = elemento; // Actualizamos mínimo
            if (elemento > cantidadMaxima)
                cantidadMaxima = elemento; // Actualizamos el valor de máximo.
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

        // Double::compare es la versión reducida de (a, b) -> Double.compare(a, b)
        double min = Arrays.stream(arrayNumeros).min((a, b) -> Double.compare(a, b)).get();

        JOptionPane.showMessageDialog(null, "5.- El máximo valor  " + max+ " y el mínimo "+ min);
    }

}
