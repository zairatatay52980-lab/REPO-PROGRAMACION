import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static String[] ciudades;
    static int [][][] tiempo;
    static StringBuilder mediaPorCiudades= new StringBuilder();
    static StringBuilder mediaPorDia= new StringBuilder();

    public static void main(String[] args) {

        boolean error;

        do {
            error = false;
            try {

                pedirDatos();
                pedirTemperatura();
                sacarMediaPorCiudad();
                sacarMediaPorDia();

            }catch (Exception e){

                error = true;
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                }

        }while (error);

    }

    public static void pedirDatos() throws Exception{

        int numCiudades = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de ciudades: "));
        int numDias = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de dias: "));

        tiempo = new int[numCiudades][numDias][3];
    }

    public static void pedirTemperatura() throws Exception{

        for(int i = 0; i < tiempo.length; i++){
            for(int j = 0; j < tiempo[i].length; j++){
                for(int k = 0; k < tiempo[i][j].length; k++){
                    tiempo[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Teclea la temperatura de la ciudad " + (i+1)+ ", dia "+(j+1)+", hora "+(k+1)+": "));
                }
            }
        }

    }

    public static void sacarMediaPorCiudad() throws Exception{
        int media = 0;
        int contador = 0;
        for(int i = 0; i < tiempo.length; i++) {
            for (int j = 0; j < tiempo[i].length; j++) {
                for (int k = 0; k < tiempo[i][j].length; k++) {
                    media += tiempo[i][j][k];
                    contador++;

                }
                media=media/contador;
                mediaPorCiudades.append("\nCiudad " + (i+1) + media);

            }
            JOptionPane.showMessageDialog(null,mediaPorCiudades);

        }

    }

    public static void sacarMediaPorDia() throws Exception{
        int media = 0;
        int contador = 0;
        for(int i = 0; i < tiempo.length; i++) {
            for (int j = 0; j < tiempo[i].length; j++) {
                for (int k = 0; k < tiempo[i][j].length; k++) {
                    media += tiempo[i][j][k];
                    contador++;


                }
                media=media/contador;
                mediaPorCiudades.append("\nDia " + (i+1) + media);
            }
            JOptionPane.showMessageDialog(null,mediaPorDia);

        }
    }
}