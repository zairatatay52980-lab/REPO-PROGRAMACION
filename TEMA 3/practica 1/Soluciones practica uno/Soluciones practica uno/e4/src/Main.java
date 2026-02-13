import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            // Declarar, crear y llenar.
            String[] meses = {"enero", "febrero","marzo", "abril","mayo", "junio","julio", "agosto","septiembre", "octubre","noviembre", "diciembre"};
            /* String[] meses= new String[12];
            meses[0] = "enero";
            meses[1] = "febrero";

            meses[11] = "diciembre";*/

            String mes= javax.swing.JOptionPane.showInputDialog("Teclea el mes");

            int x;
            // Versión uno: Buscar con un for. Dos condiciones.
            for(x = 0; x < meses.length &&  meses[x].compareToIgnoreCase(mes)!= 0; x++);
            // if fuera del for.
            if (x == meses.length)
                javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción uno)");
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción uno)");

            // Versión dos. Condición dentro del for.
            boolean encontrado = false;
            for(x = 0; x < meses.length && !encontrado; x++)
            {
                if (meses[x].compareToIgnoreCase(mes)== 0)
                    encontrado = true;
                // CUIDADO CON PONER ELSE DENTRO DE LA REPETITIVA
            }
            if (!encontrado)
                javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción dos)");
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción dos)");


            // Versión tres: indexOf?? contains ...Sólo con String
            // Convierto el array en un string
            String todos = Arrays.toString(meses);
            if (todos.indexOf(mes)== -1)
                javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción tres)");
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción tres)");

            // Versión cuatro: todos.contains(mes)
            if (!todos.contains(mes))
                javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción cuatro)");
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción cuatro)");

            //binarySearch de la clase Arrays requiere que los datos estén ordenados.

            // Versión cinco NO ME GUSTA
            for(x = 0; x < meses.length; x++)
            {
                if (meses[x].compareToIgnoreCase(mes)== 0)
                    break; // return;

            }
            if (x == meses.length)
                javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción cinco)");
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción cinco)");

            // Versión seis
            encontrado = Arrays.stream(meses).anyMatch(elemento -> elemento.equals(mes));
            if (encontrado)
                javax.swing.JOptionPane.showMessageDialog(null,"Mes correcto (opción seis)");
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Mes no valido (opción seis)");
        }
        catch (Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

}
