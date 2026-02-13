import javax.swing.*;
import java.util.Arrays;

public class Main {

    /* Crea un array de números donde le indicamos por teclado el tamaño
    del array, rellenaremos el array con números aleatorios entre 0 y 9,
    al final muestra por pantalla el valor de cada posición y la suma de
    todos los valores.*/

    private static int[] numeros; // Declaración como global

    public static void main(String[] args) {
        try {
            // Creación
            numeros = new int[Integer.parseInt(JOptionPane.showInputDialog("Indica el número de elementos"))]; // Creación
            llenado();
            mostrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas: " + e.getMessage());
        }
    }

    public static void llenado() throws Exception {
        for (int x = 0; x < numeros.length; x++) {
            numeros[x] = (int) (Math.random() * 10);
        }
    }

    public static void mostrar() throws Exception {
        int suma = 0;
        StringBuilder datos = new StringBuilder();
        for (int x = 0; x < numeros.length; x++) {
            datos.append("Posición: ").append(x).append(" contenido: ").append(numeros[x]).append("\n");
            suma += numeros[x];
        }
        JOptionPane.showMessageDialog(null, datos + " La suma asciende a: " + suma);

        // Al querer mostrar la posición no me viene bien ningún tipo de repetitiva.
        // Lo podemos intentar con suma.
        suma = 0;
        for (int nro : numeros)
            suma += nro;
        JOptionPane.showMessageDialog(null, "La suma asciende a: " + suma);

        // stream
        suma = Arrays.stream(numeros).sum();
        JOptionPane.showMessageDialog(null, "La suma asciende a: " + suma);

        // forEach
        Arrays.stream(numeros)
                .forEach(n -> System.out.println(n));

    }
}
