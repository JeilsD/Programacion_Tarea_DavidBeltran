package uni1a;

import java.util.List;

public class Temporada {
    private int NumeroTemporada;
    private List<Episodio> episodios;

    public Temporada(int numeroTemporada, List<Episodio> episodios) {
        this.NumeroTemporada = numeroTemporada;
        this.episodios = episodios;
    }

    public int getNumeroTemporada() {
        return NumeroTemporada;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
}