import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Queue<LocalDate> fechasCaducidad = new LinkedList<>();
    public static Queue<String> nombresProductos = new LinkedList<>();
    LocalDate fecha = null;
    private static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {


        try{
            solicitarDatos();
            solicitarFecha();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }



    }

    public static void solicitarDatos(){
        boolean salir;
        do {
            salir = false;

            String producto=pedirProductos();
            LocalDate fechaCaducidad = LocalDate.now();


            fechasCaducidad.add(fechaCaducidad);
            nombresProductos.add(producto);

            String masProductos = JOptionPane.showInputDialog("Hay mas productos?");

            if(masProductos.equalsIgnoreCase("no")){
                salir = true;
            }else{
                salir = false;
            }


        }while(salir);{
            salir=true;
        }
    }

    public static String pedirProductos(){

    }

    public static void solicitarFecha(){

    }

}