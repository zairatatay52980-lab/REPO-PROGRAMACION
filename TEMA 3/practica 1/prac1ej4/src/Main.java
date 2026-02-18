import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        try {
            String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

            String mes = javax.swing.JOptionPane.showInputDialog("Teclea el mes");

            int x;
            for (x = 0; x < meses.length && meses[x].compareToIgnoreCase(mes) != 0; x++) ;
            // if fuera del for.
            if (x == meses.length)
                javax.swing.JOptionPane.showMessageDialog(null, "Mes no valido (opción uno)");
            else
                javax.swing.JOptionPane.showMessageDialog(null, "Mes correcto (opción uno)");

        }catch (Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

}
