import javax.swing.*;
public class Main {


public static void main(String[] args) {
    try
    {
        char[] letras={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        StringBuilder cadena= new StringBuilder();
        int  posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea una posición -1 para finalizar"));
        while (posicion != -1)
        {
            try
            {

                cadena.append(letras[posicion]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, " La posición indicada no es correcta");
            }
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea una posición -1 para finalizar"));

        }
        JOptionPane.showMessageDialog(null," La cadena resultante es: " + cadena);

    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
    }

}

}

