import Modelos.Cliente;
import Modelos.Mascota;
import Modelos.Veterinario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static List<Mascota> listaMascotas = new ArrayList<>();
    private static List<Cliente>  listaClientes = new ArrayList<>();
    private static List<Veterinario> listaVeterinarios = new ArrayList<>();


    public static void main(String[] args) {

            try{

                pedirDatos();

                mostrarMenu();



            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }



    public static void pedirDatos() throws Exception{
        pedirDatosMascotas();
        pedirDatosClientes();
        pedirDatosVeterinario();

    }

    public static void pedirDatosMascotas() throws Exception {
        listaMascotas.add(new Mascota(
        validarSolicitarDatos("Nombre", "Teclea el NOMBRE de la mascota", "^[a-zA-Z]+$");
        validarSolicitarDatos("Direccion", "Teclea la DIRECCION de la mascota", "^[a-zA-Z]+$");

))

    }

    public static void pedirDatosClientes(){


    }

    public static void pedirDatosVeterinario(){


    }




    public static String validarSolicitarDatos(String dato, String mensaje, String expersionRegular) throws Exception{

        String var = " ";

        boolean error;

        do{
            error = false;

            try{
                var = JOptionPane.showInputDialog(mensaje);

                if(var.trim().isEmpty()){
                    throw new Exception(dato + " es obligatorio");

                }

                Pattern pat = Pattern.compile(expersionRegular);
                Matcher mat = pat.matcher(var);

                if(mat.matches()){
                    throw new Exception(dato + " no tiene un formato valido");

                }

            }catch(Exception e){
                error = true;
                JOptionPane.showMessageDialog(null, e);

            }}while(error);

        return var;

    }

}














    public static void mostrarMenu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- M E N U   P R I N C I P A L ---"
                    + "\n 1.Mostrar numero clientes"
                    + "\n 2.Datos personales clientes"
                    + "\n 3.Datos del veterinario"
                    + "\n 4.Datos de Mascota de cliente"
                    + "\n 5.Datos de Mascota de veterinario"
                    + "\n 6. Salir"));

            gestionarOpcion(opcion);

        } while (opcion != 6);
            JOptionPane.showMessageDialog(null, "Saliendo :)");


    }

    public static void gestionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
            mostrarNumCliente();
            break;
            case 2:
            mostrarDatosClientes();
            break;
            case 3:
            mostrarDatosVeterinario();
            break;
            case 4:
            mostrarDatosMascotaCliente();
            break;
            case 5:
            mostrarDatosMascotaVeterinario();
            break;
            case 6: System.exit(6);
            break;
        }
    }

    public static void mostrarNumCliente() {

    }
    public static void mostrarDatosClientes() {

    }
    public static void mostrarDatosVeterinario() {

    }
    public static void mostrarDatosMascotaCliente() {

    }

    public static void mostrarDatosMascotaVeterinario() {


    }






}
