import Modelo.Estudio;
import Modelo.Pelicula;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public  class Main {

    public static ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

    public static void main(String[] args) {

        try{

            llenarDatos();
            EstudioConPeliculaMasLarga();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }

    public static void llenarDatos(){

        Estudio estudio1 = new Estudio("Universal", "Toronto", "Croqueta Nº2", "UniversalStudio.web", LocalDate.of(1970,12,13) , "United States");
        Estudio estudio2 = new Estudio("Walt Disney", "New York", "Mickey Nº1", "WaltDisneyStudio.web", LocalDate.of(1950,4,11) , "United States");
        Estudio estudio3 = new Estudio("Warner", "California", "Platillo Nº5", "WarnerStudio.web", LocalDate.of(1970,1,3) , "United States");
        Estudio estudio4 = new Estudio("Paramount", "Texas", "Espongita Nº5", "ParamountStudio.web", LocalDate.of(1960,4,12) , "United States");


        Pelicula pelicula1 = new Pelicula("Titanic", 1990, 180, "Romance");
        Pelicula pelicula2 = new Pelicula("ET", 1987, 90, "Suspense");
        Pelicula pelicula3 = new Pelicula("El señor de los anillos", 2007, 133, "Aventura");
        Pelicula pelicula4 = new Pelicula("Piratas del Caribe", 2018, 188, "Aventura");
        Pelicula pelicula5 = new Pelicula("El rey Leon", 2002, 97, "Animacion");




    }

    public static void EstudioConPeliculaMasLarga(){
        int mayorTiempo=0;
        Pelicula peliMasLarga = new Pelicula();
        Estudio estudioConPeliculaMasLarga = new Estudio();

        for (Pelicula pelicula : listaPeliculas){
            if(pelicula.getDuracionMinuto() < mayorTiempo){
                mayorTiempo = pelicula.getDuracionMinuto();
                peliMasLarga = pelicula;

                estudioConPeliculaMasLarga=pelicula.getListaEstudios().get(mayorTiempo);


            }
        }

    }

}
