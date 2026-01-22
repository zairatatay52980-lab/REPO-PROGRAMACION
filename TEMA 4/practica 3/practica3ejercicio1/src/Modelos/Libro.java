package Modelos;

public class Libro {
    private String titulo;
    private String numPaginas;
    private String editorial;
    private Autor autor;
    private int ejemplaresDisponibles = 3;


    public Libro(String titulo, String numPaginas, String editorial, Autor autor) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }



    public void alquilar(){
        ejemplaresDisponibles--;
    }
    public void devolver(){
        ejemplaresDisponibles--;
    }


    public boolean isEjemplaresDisponibles() {
        return ejemplaresDisponibles > 0;
    }

    @Override
    public String toString() {
        return titulo + " | Atuor: " +autor.getNombre() + " |Ejemplares: " + ejemplaresDisponibles;
    }
}
