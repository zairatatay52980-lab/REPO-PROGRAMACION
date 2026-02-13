import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            String mes = JOptionPane.showInputDialog("Teclea un mes");


            mes = mes.toLowerCase().trim();

            boolean encontrado = false;

            for (int i = 0; i < meses.length && !encontrado; i++) {


                if (meses[i].compareToIgnoreCase(mes) == 0) {
                    encontrado = true;
                }
            }
            if (!encontrado)
                javax.swing.JOptionPane.showMessageDialog(null, "Mes no valido");
            else
                javax.swing.JOptionPane.showMessageDialog(null, "Mes correcto");


        }catch (Exception e){}

    }
}