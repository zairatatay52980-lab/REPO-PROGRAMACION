import javax.swing.*;
import java.util.Arrays;

public class Main {

    private static int[] numeros; // Declaración como global

    public static void main(String[] args) {
        try {
            numeros = new int[Integer.parseInt(JOptionPane.showInputDialog("Indica el número de elementos"))];
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

        suma = 0;
        for (int nro : numeros)
            suma += nro;
        JOptionPane.showMessageDialog(null, "La suma asciende a: " + suma);

        suma = Arrays.stream(numeros).sum();
        JOptionPane.showMessageDialog(null, "La suma asciende a: " + suma);

        Arrays.stream(numeros)
                .forEach(n -> System.out.println(n));

    }
}
