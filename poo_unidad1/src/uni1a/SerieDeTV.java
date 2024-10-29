package uni1a;

import java.util.List;

public class SerieDeTV {
    private String titulo;
    private int añoLanzamiento;
    private String genero;
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int anioLanzamiento, String genero, List<Temporada> temporadas) {
        this.titulo = titulo;
        this.añoLanzamiento = anioLanzamiento;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) { // Agrega este método
        this.genero = genero;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }
}