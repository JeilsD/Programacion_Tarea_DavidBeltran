package uni1a;

public class Investigadores {
    private String nombre;
    private String especialidad;

    public Investigadores(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarDetalles() {
        System.out.println("Investigador: " + nombre + " - Especialidad: " + especialidad);
    }

    public void realizarInvestigacion() {
        System.out.println(nombre + " está realizando una investigación en " + especialidad + ".");
    }
}