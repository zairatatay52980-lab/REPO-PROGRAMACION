package Utilidades;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntradaDatos {

    public static String validarTexto(String mensaje, String dato, String expresionRegular) {

        boolean error;
         String variable="";

         do {
             try{
                 error=false;

                 variable = JOptionPane.showInputDialog(mensaje);

                 if (variable.isEmpty()) {
                     throw new Exception(dato + " no puede estar vacío.");
                 }

                 Pattern pattern = Pattern.compile(expresionRegular);
                 Matcher matcher = pattern.matcher(variable);

                    if (!matcher.matches()) {
                        throw new Exception("Formato de " + dato + " no válido.");
                    }

             }catch (Exception e){
                 System.out.println("Error: " + e.getMessage());
                    error=true;
             }

             return variable;

         }while(error);


    }

}
