package uni1a;

public class VideoYouTube {
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private String url;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String url) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.url = url;
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

    public String getUrl() {
        return url;
    }
}