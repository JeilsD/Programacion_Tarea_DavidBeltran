package uni1a;

import java.util.ArrayList;
import java.util.List;

public class PruebaCompleta {
    public static void main(String[] args) {
        
        // Crear algunos investigadores
        Investigadores investigador1 = new Investigadores("Dr. John Doe", "Biología");
        Investigadores investigador2 = new Investigadores("Dra. Jane Smith", "Astrofísica");

        // Mostrar detalles de los investigadores
        investigador1.mostrarDetalles();
        investigador2.mostrarDetalles();
        
        // Crear episodios
        Episodio episodio1 = new Episodio("Episodio Piloto", 45);
        Episodio episodio2 = new Episodio("Episodio 2", 50);

        // Crear una lista de episodios y agregar episodios
        List<Episodio> episodiosTemporada1 = new ArrayList<>();
        episodiosTemporada1.add(episodio1);
        episodiosTemporada1.add(episodio2);

        // Crear una temporada con la lista de episodios
        Temporada temporada1 = new Temporada(1, episodiosTemporada1);

        // Crear una lista de temporadas
        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(temporada1);

        // Crear una SerieDeTV con una lista de temporadas
        SerieDeTV serie = new SerieDeTV("Serie Ejemplo", 2023, "Drama", temporadas);
        // Mostrar detalles de la serie y sus temporadas
        System.out.println("Título de la serie: " + serie.getTitulo());
        System.out.println("Año de lanzamiento: " + serie.getAñoLanzamiento());
        System.out.println("Género: " + serie.getGenero());
        System.out.println("Número de temporadas: " + serie.getTemporadas().size());

        for (Temporada temporada : serie.getTemporadas()) {
            System.out.println("Temporada " + temporada.getNumeroTemporada());
            for (Episodio ep : temporada.getEpisodios()) {
                System.out.println(" - Episodio: " + ep.getTitulo() + " (" + ep.getDuracion() + " min)");
            }
        }
        // Crear instancias de VideoYouTube y Cortometraje
        VideoYouTube videoYT = new VideoYouTube("Tutorial Java", 15, "Educativo", "https://youtube.com/video1");
        Cortometraje corto = new Cortometraje("Corto Ejemplo", 10, "Comedia", "Juan Perez");

        // Mostrar detalles de VideoYouTube
        System.out.println("\nDetalles del Video de YouTube:");
        System.out.println("Título: " + videoYT.getTitulo());
        System.out.println("Duración: " + videoYT.getDuracion() + " min");
        System.out.println("Género: " + videoYT.getGenero());
        System.out.println("URL: " + videoYT.getUrl());

        // Mostrar detalles del cortometraje
        System.out.println("\nDetalles del Cortometraje:");
        System.out.println("Título: " + corto.getTitulo());
        System.out.println("Duración: " + corto.getDuracion() + " min");
        System.out.println("Género: " + corto.getGenero());
        System.out.println("Director: " + corto.getDirector());

        // Realizar investigación con los investigadores
        investigador1.realizarInvestigacion();
        investigador2.realizarInvestigacion();
    }
}