//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        try{

            // Declaración y creacion de los arrays
            // Arrays coincidentes
            char[] alfabeto= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
            int[] tcont = new int[26];   //por defecto se inicializa a ceros.

            /*
            // Inicializar el array con las letras del abecedario
            // ascii de a es 97, el de b 98, .....
            for (int i = 0; i < 26; i++) {
                //System.out.println( 'a' + i);
                alfabeto[i] = (char) ('a' + i);
            }*/

            // Poner los elementos a cero
            inicializarContador(tcont);

            //Entrada de datos y cálculo de la tabla de frecuencias
            entradaDatos(alfabeto,tcont);

            // Salida de la tabla de frecuencia
            salidaDatos(alfabeto,tcont);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas de tipo: "+ e.getMessage());
        }
    }


    private static void inicializarContador(int[] tcont) throws Exception
    {
        Arrays.fill(tcont, 0);
    }

    private static void entradaDatos(char[] alfabeto, int[] tcont) throws Exception
    {
        int y;
        String texto= JOptionPane.showInputDialog("Introducir texto.").toLowerCase();
        // no me planteo validaciones
        for (int x = 0; x < texto.length(); x++)
        {
          /* for(y=0; y<alfabeto.length && texto.charAt(x)!=alfabeto[y]; y++){}  // Buscar -- Ejercicio 4
            if (y!=alfabeto.length)      //Si encontrado...
                   tcont[y]=tcont[y]+1;*/

            y = Arrays.binarySearch(alfabeto, texto.charAt(x));
            if (y != -1)
                tcont[y]=tcont[y]+1;
        }
    }

    private static void salidaDatos(char[] alfabeto, int[] tcont) throws Exception
    {
        StringBuilder resultados= new StringBuilder();
        for (int x = 0; x < tcont.length; x++)
        {
            if(tcont[x] != 0)  //se quiere excluir las letras que no aparecen
                resultados.append(alfabeto[x]).append(" - ").append(tcont[x]).append("\n");
        }
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + resultados  );

        Arrays.stream(tcont).filter(e->e!=0).forEach(e ->System.out.println(e));
    }
}
