package uni1a;

public class Cortometraje {
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private String director;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }
}