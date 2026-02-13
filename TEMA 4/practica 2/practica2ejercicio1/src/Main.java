import Modelo.Estudio;
import Modelo.Pelicula;
import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    public static ArrayList<Estudio> listaEstudios = new ArrayList<>();
    public static void main(String[] args) {

        try {
            llenarDatos();
            conseguirEstudioConPeliMasLarga();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static void llenarDatos(){

        Estudio estudio1 = new Estudio("Disney","California","Patatiña 2","www.disney.com", LocalDate.of(1886,2,10),"United States","123456789");
        listaEstudios.add(estudio1);
        Estudio estudio2 = new Estudio("DreamWorks","Nueva York","Croqueta 4C","www.DeamWorks.com", LocalDate.of(1950,2,10),"United States","987654321");
        listaEstudios.add(estudio2);
        Estudio estudio3 = new Estudio("Warner","Texas","Lola-Mento 7A","www.Warner.com", LocalDate.of(1901,2,10),"United States","182478671");
        listaEstudios.add(estudio3);

        ArrayList<Estudio> estudioP1 = new ArrayList<>();
        estudioP1.add(estudio1);
        estudioP1.add(estudio2);
        Pelicula peli1 = new Pelicula("Titanic",1999,160,"Romance",estudioP1);
        listaPeliculas.add(peli1);

        ArrayList<Estudio> estudioP2 = new ArrayList<>();
        estudioP2.add(estudio3);
        Pelicula peli2 = new Pelicula("Cumbres borrascosas",2026,138,"Romance",estudioP2);
        listaPeliculas.add(peli2);

        ArrayList<Estudio> estudioP3 = new ArrayList<>();
        estudioP3.add(estudio3);
        Pelicula peli3 = new Pelicula("Minions",2020,140,"Animado",estudioP3);
        listaPeliculas.add(peli3);

        ArrayList<Estudio> estudioP4 = new ArrayList<>();
        estudioP4.add(estudio1);
        estudioP4.add(estudio2);
        estudioP4.add(estudio3);
        Pelicula peli4 = new Pelicula("Shrek 2",2015,148,"Animado",estudioP4);
        listaPeliculas.add(peli4);

    }

    public static void conseguirEstudioConPeliMasLarga(){

        int tiempoMasAlto = 0;

        Pelicula peliMasLarga = new Pelicula();
        ArrayList<Estudio> estudiosConPeliMasLarga = new ArrayList<>();

        for (Pelicula peli : listaPeliculas){
            if (peli.getDuracionMinutos() > tiempoMasAlto){
                tiempoMasAlto = peli.getDuracionMinutos();
                peliMasLarga = peli;
                estudiosConPeliMasLarga.addAll(peli.getListaEstudios());
            }
        }

        StringBuilder stringConEstudios = new StringBuilder("\n");

        for (Estudio estudio : estudiosConPeliMasLarga){
            stringConEstudios.append(estudio.getNombre()).append("\n");
        }

        JOptionPane.showMessageDialog(null,"El o los estudios que tienen la peli mas larga es o son: "
                + stringConEstudios + " con la peliculo " + peliMasLarga.getTitulo());

    }
}
