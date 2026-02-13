import javax.swing.*;
import java.util.Arrays;

public class Main {

    static final String[]codigos = new String[]{"10","23","30","47","55","65","135","256", "526", "663"};
    static int[]ventas = new int[10];
    static StringBuilder mensaje = new StringBuilder();

    public static void main(String[] args) {
        boolean error;
        do {
            error = false;
            try {
                String codigo = JOptionPane.showInputDialog("Teclea el codigo del producto: ");
                int y = Arrays.binarySearch(codigos, codigo);
                if (y < 0) {
                    throw new Exception("El codigo no existe");
                }

                int unidades = Integer.parseInt(JOptionPane.showInputDialog("Teclea las unidades de la venta: "));

                ventas[y] = unidades;

                for (int i = 0; i < unidades; i++) {
                    mensaje.append("Producto: " + codigo + " tiene " + unidades + " unidades vendidas");
                    JOptionPane.showMessageDialog(null, mensaje);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                error = true;
            }

        }while(error);

    }
}
