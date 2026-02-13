import javax.swing.*;

public class Main {

    static double numeros[];

    public static void main(String[] args) {
        try {
            numeros=new int[Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de posiciones que deseas"))];
            solicitarDatos();
            mostrarDatos();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas" + e.getMessage());
        }
    }
    public static void solicitarDatos(){

    numeros = new double[dato];
    for(int i=0;i<numeros.length;i++){
        numeros[i]= (int) (Math.random()*10);
    }
    }
    public static void mostrarDatos(){
        int suma=0;
        StringBuilder datos=new StringBuilder();
        for(int i=0;i<numeros.length;i++){
           datos.append("Posicion: ");
        }


    }

}
