//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        try{

            char[] alfabeto= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
            int[] tcont = new int[26];

            inicializarContador(tcont);

            entradaDatos(alfabeto,tcont);

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
        for (int x = 0; x < texto.length(); x++)
        {
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
            if(tcont[x] != 0)
                resultados.append(alfabeto[x]).append(" - ").append(tcont[x]).append("\n");
        }
        JOptionPane.showMessageDialog(null, "La frecuencia de las letras es: \n\n" + resultados  );

        Arrays.stream(tcont).filter(e->e!=0).forEach(e ->System.out.println(e));
    }
}
