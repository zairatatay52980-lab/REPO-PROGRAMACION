import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Double> listaValores = new ArrayList<Double>();

    public static void main(String[] args) {

        boolean salir;
        do {
            salir=false;

            try {

                rellenarLista();
                String continuar = JOptionPane.showInputDialog(null, "¿Quieres continuar?(si/no)");

                if(!continuar.equalsIgnoreCase("no")){
                    salir = true;
                }else {
                    mostrarMenu();
                }
            }catch (Exception e){
                salir=true;
                JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }while(salir);

    }
    public  static void mostrarMenu() throws Exception {
        String menu;
        do {menu = JOptionPane.showInputDialog(null, " a) Visualizar el valor maximo y el mınimo.\n"
                +" b) Solicitar un numero y buscarlo\n"
                +" c) Solicitar un numero, buscarlo y borrarlo.\n"
                +" d) Convertir el arrayList en un array.\n"
                +" e) Si no esta vacıo, mostrar el numero de elementos que contiene.\n" +
                " f ) Insertar un nuevo elemento por el final.\n" +
                " g) Insertar un nuevo elemento en la posicion que te indique el usuario.\n" +
                " h) Borrar un elemento de una posicion concreta.\n" +
                " i) Calcular la suma y la media aritmetica de los valores contenidos.\n" +
                " j) Finalizar.");


            switch (menu){
                case "a": valorMaxYMin();
                    break;
                case "b": buscarNumero();
                    break;
                case "c":

                    break;
                case "d":
                    break;
                case "e":
                    mostrarTamaño();
                    break;
                case "f":
                    insertar();
                    break;
                case "g":
                    insertarPorPosicion();
                    break;
                case "h":
                    borrarPorPosicion();
                    break;
                case "i":
                    calcularSumaYMedia();
                    break;
            }

        }while(!menu.equalsIgnoreCase("j"));
    }

    public static void calcularSumaYMedia() throws Exception {
        double media=0;
        for (int i=0;i<listaValores.size();i++) {
            //media = media + listaValores.get(i);
            media +=listaValores.get(i);
        }
        media = media/listaValores.size();
        JOptionPane.showMessageDialog(null, "La media es "+media);
    }
    public static void borrarPorPosicion()  throws Exception {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "que posicion vas a borrar?")) ;
        listaValores.remove(posicion);
    }
    public static void insertarPorPosicion() throws Exception{
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "en que posicion se va a insertar?")) ;
        listaValores.add(posicion,Double.parseDouble(JOptionPane.showInputDialog(null, "Teclea el valo r que quieres añadir")));
    }
    public static void insertar() throws Exception{
        listaValores.add(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el valor para añadirlo: ")));
    }
    public static void mostrarTamaño() throws Exception {
        if (listaValores.size()>0) {
            JOptionPane.showMessageDialog(null, "La coleccion tiene un tamaño de: " + listaValores.size());
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }
    public static void rellenarLista()throws Exception{

        double numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Teclea un numero"));
        listaValores.add(numero);

    }
    public static void valorMaxYMin(){
        double max = Collections.max(listaValores);
        double min = Collections.min(listaValores);
        JOptionPane.showMessageDialog(null, "El valor maximo es: " + max+ " y el valor minimo es: "+min);
    }
    public static void buscarNumero() throws Exception{
        double buscarNumero = Double.parseDouble(JOptionPane.showInputDialog(null,"Teclea el numero que quieres buscar"));

        if(listaValores.contains(buscarNumero)){
            JOptionPane.showMessageDialog(null, "El numero es: " + buscarNumero);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningun numero");
        }


    }


}