import Modelos.Coche;
import Modelos.Propietario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static ArrayList<Coche> coches;
    public static ArrayList<Propietario> propietarios;

public static void main(String [] args) {
     // COCHES
     Coche c1 = new Coche("1234 ABC", "Toyota", 2018 , 18000);
     Coche c2 = new Coche("5678 DEF", "BMW", 2015 , 25000);
     Coche c3 = new Coche("9012 GHI", "Seat", 2012 , 12000);

     Coche c4 = new Coche("3456 JKL", "Toyota", 2020 , 22000);
     Coche c5 = new Coche("7890 MNO", "Audi", 2017 , 30000);
     Coche c6 = new Coche("1122 PQR", "BMW", 2010 , 15000);

     Coche c7 = new Coche("3344 STU", "Seat", 2019 , 16000);
     Coche c8 = new Coche("5566 VWX", "Audi", 2014 , 20000);
     Coche c9 = new Coche("7788 YZA", "Toyota", 2021 , 24000);

     // PROPIETARIOS
     Propietario p1 = new Propietario ("Carlos",List.of(c1 , c2 , c3));
     Propietario p2 = new Propietario ("Ana",List.of(c4 , c5 , c6));
     Propietario p3 = new Propietario ("Luis",List.of(c7 , c8 , c9));


     //añadirlos a la lista

        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);
        coches.add(c5);
        coches.add(c6);
        coches.add(c7);
        coches.add(c8);
        coches.add(c9);

        propietarios.add(p1);
        propietarios.add(p2);
        propietarios.add(p3);



        //1
    List<String> matriculas = new ArrayList<>();

    for (Coche c : coches) {
        matriculas.add(c.getMatricula());
    }

    matriculas = coches.stream().map(Coche::getMatricula).toList();





    // 2

    int contadosCoches = 0;

    for (Coche c : p1.getCoches()) {
        contadosCoches++;

        JOptionPane.showMessageDialog(null, "Numero de coches: " + contadosCoches);
    }



    long contadosCochess = p1.getCoches().stream().count();

    JOptionPane.showMessageDialog(null, "Numero de coches: " + contadosCochess);



    //  3

    List<Coche> mascoches2015 = coches.stream().filter(c -> c.getAño() > 2015).toList();


    //  4

    double mediaPrecios = coches.stream()
            .mapToDouble(Coche::getPrecio)
            .average()
            .orElse(0.0);

    JOptionPane.showMessageDialog(null, "El precio medio es: " + mediaPrecios);

    // 5

    Coche masCaro = coches.stream()
            .max(Comparator.comparingDouble(Coche::getPrecio))
            .orElse(null);

    if(masCaro != null) {
        JOptionPane.showMessageDialog(null, "El coche mas caro es: " + masCaro.getMarca());
    }


    // 6

    boolean exiteBMV = coches.stream().
            anyMatch(c -> c.getMarca().equalsIgnoreCase("BMV"));


    if(exiteBMV) {
        JOptionPane.showMessageDialog(null, "Coche BMW existe");
    }else  {
        JOptionPane.showMessageDialog(null, "Coche BMW no existe");
    }


    // 7









}












}
