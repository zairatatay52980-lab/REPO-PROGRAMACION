import Metodos.Circunferencia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {

            double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));

            if (radio <= 0) {
                throw new Exception();

            }
            Circunferencia circunferencia = new Circunferencia(radio);

            JOptionPane.showMessageDialog(null, "Los datos de la circunferencia con radio: " + circunferencia.getRadio() + " son:" +
                    "\n\n Longitud: " + circunferencia.getLongitud() +
                    "\n Area: " + circunferencia.getArea() +
                    "\n Volumen: " + circunferencia.getVolumen());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas " + e.getMessage());
        }

    }
}
