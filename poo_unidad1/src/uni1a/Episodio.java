package uni1a;

public class Episodio {
    private String titulo;
    private int duracionEnMinutos;

    public Episodio(String titulo, int duracionEnMinutos) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
}