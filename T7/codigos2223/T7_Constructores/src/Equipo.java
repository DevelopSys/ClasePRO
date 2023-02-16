public class Equipo {

    private String nombre, liga;
    private int posicion, golesFavor;


    public Equipo() {
    }

    public Equipo(String nombre, String liga, int posicion, int golesFavor) {
        this.nombre = nombre;
        this.liga = liga;
        this.posicion = posicion;
        this.golesFavor = golesFavor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", liga='" + liga + '\'' +
                ", posicion=" + posicion +
                '}';
    }
}

