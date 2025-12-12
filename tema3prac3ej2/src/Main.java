import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static Queue<LocalDate> fechasCaducidad = new LinkedList<>();
    public static Queue<String> nombresProductos = new LinkedList<>();
    public static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        try{
            solicitarDatos();
            fechaHoy();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void solicitarDatos(){
        boolean salir;
        do {

            String producto=pedirProductos();
            LocalDate fechaCaducidad = solicitarFecha();

            fechasCaducidad.add(fechaCaducidad);
            nombresProductos.add(producto);

            String masProductos = JOptionPane.showInputDialog("Hay mas productos?");

            if(masProductos.equalsIgnoreCase("no")){
                salir = false;
            }else{
                salir = true;
            }


        }while(salir);
    }

    public static String pedirProductos(){
        String producto=JOptionPane.showInputDialog("Teclea el nombre del producto");
        return producto;

    }

    public static LocalDate solicitarFecha(){
        String fechaCaducidad=JOptionPane.showInputDialog("Teclea la fecha de caducidad");
        return LocalDate.parse(fechaCaducidad,formatoFecha);
    }

    public static void fechaHoy(){
        String fechaHoy=JOptionPane.showInputDialog("Teclea la fecha de hoy");
        LocalDate hoy=LocalDate.parse(fechaHoy,formatoFecha);
        eliminarProductoCaducado(hoy);
    }
    public static void eliminarProductoCaducado(LocalDate hoy)  {
        while(!fechasCaducidad.isEmpty() && fechasCaducidad.peek().isBefore(hoy)) {
            nombresProductos.poll();
            fechasCaducidad.remove();
            }
        }
    }

    public static Object[] mostrarResultado() {
        StringBuilder resultado = new StringBuilder();
        for (String nombre : nombresProductos) {

        }


        return new Object[0];
    }


