package Modelo;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private int anio;
    private int duracionMinuto;
    private String tipo;

    private ArrayList<Estudio> listaEstudios;


    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, int duracionMinuto, String tipo) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracionMinuto = duracionMinuto;
        this.tipo = tipo;
    }

    public Pelicula(String titulo, int anio, int duracionMinuto, String tipo, ArrayList<Estudio> listaEstudios) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracionMinuto = duracionMinuto;
        this.tipo = tipo;
        this.listaEstudios = listaEstudios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracionMinuto() {
        return duracionMinuto;
    }

    public void setDuracionMinuto(int duracionMinuto) {
        this.duracionMinuto = duracionMinuto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }
}
