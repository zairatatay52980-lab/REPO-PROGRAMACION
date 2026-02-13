package Modelo;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private int anio;
    private int duracionMinutos;
    private String tipo;

    private ArrayList<Estudio> listaEstudios;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, int duracionMinutos, String tipo) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracionMinutos = duracionMinutos;
        this.tipo = tipo;
    }

    public Pelicula(String titulo, int anio, int duracionMinutos, String tipo, ArrayList<Estudio> listaEstudios) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracionMinutos = duracionMinutos;
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

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
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
