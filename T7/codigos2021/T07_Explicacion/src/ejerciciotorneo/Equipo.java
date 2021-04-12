package ejerciciotorneo;

public class Equipo {

    private String nombre;
    private int puntos, goles;

    public Equipo(String nombre, int puntos, int goles) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
