package Modelos;

public class Libro {
    private String titulo;
    private String numPaginas;
    private String editorial;
    private Autor autor;
    private int ejemplaresDisponibles = 3;


    public Libro(String titulo, String numPaginas, String editorial) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
    }

    public Libro(String titulo, String numPaginas, String editorial, Autor autor) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean alquilar(){

    return false;
    }
    public boolean devolver(){

    return false;
    }


}
