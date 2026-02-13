import javax.swing.*;

public class Main{

   static double[] numeros = new double[10];

   public static void main(String[] args){

       solicitarDatos();
       mostrarDatos();
   }

   public static void solicitarDatos(){
       for(int i = 0; i < numeros.length; i++){
       numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("tecleeaaa"));
       }
   }

   public static void mostrarDatos(){
       for(int i = 0; i < numeros.length; i++){
           JOptionPane.showMessageDialog(null, numeros[i]);
       }
   }

}
