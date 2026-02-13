import javax.swing.*;

public class Main {

    /* Crea un array de caracteres que contenga de la ’A’ a la ’Z’ (solo las mayúsculas). Después, ve pidiendo posiciones del array por teclado y
    si la posición es correcta, se añadirá el carácter a una cadena que se mostrará al ﬁnal, se dejará de insertar cuando se introduzca un -1.
    Por ejemplo, si escribo los siguientes números
    0 //Añadira la ’A’
    5 //Añaadira la ’F’
    25 //Añadira la ’Z’
    50 //Error, inserte otro número
    -1 //ﬁn Cadena resultante: AFZ
*/
    public static void main(String[] args) {
        try
        {
            // Declaración, creado y llenado.
            char[] letras={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; // Declaración, creación y llenado
            StringBuilder cadena= new StringBuilder();
            int  posicion = Integer.parseInt(JOptionPane.showInputDialog("Teclea una posición -1 para finalizar"));
            while (posicion != -1)
            {
                try
                {
                    /*
                        if ( posicion < 0 || posicion > letras.length - 1)
                            throw new PosicionIncorrecta();
                    */
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
