import Modelo.Persona;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public static void main(String[] args) {

        try {

            llenarDatos();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }

    public static void llenarDatos() throws Exception{
        boolean masPersonas = false;
        do {

            String nombre = validarsolicitardatos("nombre","^[a-zA-Z]+$","Teclea el nombre de la persona");
            String dNacimiento = validarsolicitardatos("Dia de nacimiento", "","Teclea el dia de nacimiento");
            String mNacimiento = validarsolicitardatos("Mes de nacimiento","","Teclea el mes de nacimiento");
            String aNacimiento = validarsolicitardatos("Año de nacimiento","","Teclea el año de nacimiento");
            String direccion = validarsolicitardatos("Direccion","^[a-zA-Z1-9]+$","Teclea el direccion");
            String codigoPostal = validarsolicitardatos("Codigo postal","^[0-9]{5}$","Teclea el codigo postal");
            String ciudad = validarsolicitardatos("Ciudad","^[a-zA-Z]+$","Teclea la ciudad");


        }while (masPersonas);

    }

    public static String validarsolicitardatos(String dato, String expresionRegular, String mensaje){
        boolean error;
        String var = "";
        do {
            error = false;
            try {

                var = JOptionPane.showInputDialog(mensaje);

                if (var.trim().isEmpty()) {
                    throw new DatoNoValido(dato + " no puede estar vacio");
                }

                if (dato.equalsIgnoreCase("Dia de nacimiento")){
                    int diaNacimiento = Integer.parseInt(var);
                    if (diaNacimiento < 1 || diaNacimiento > 31) {
                        throw new DatoNoValido(dato + " fuera de rango");
                    }
                }else if (dato.equalsIgnoreCase("Mes de nacimiento")){
                    int mesNacimiento = Integer.parseInt(var);
                    if (mesNacimiento < 1 || mesNacimiento > 12) {
                        throw new DatoNoValido(dato + " fuera de rango");
                    }
                } else if (dato.equalsIgnoreCase("Año de nacimiento")) {
                    int anoNacimiento = Integer.parseInt(var);
                    if (anoNacimiento < 1900 || anoNacimiento > LocalDate.now().getYear()) {
                        throw new DatoNoValido(dato + " fuera de rango");
                    }
                }else{
                    Pattern patron = Pattern.compile(expresionRegular);
                    Matcher mat = patron.matcher(var);

                    if (!mat.matches()) {
                        throw new DatoNoValido(dato + " no tiene un formato valido");
                    }
                }


            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
                error = true;
            }

        }while (error);

        return var;
    }
}