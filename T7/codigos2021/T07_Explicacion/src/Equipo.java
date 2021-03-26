public final class Equipo {

    private String nombre, liga;
    private int posicion;

    public Equipo(String nombre, String liga, int posicion) {
        this.nombre = nombre;
        this.liga = liga;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getLiga() {
        return liga;
    }
}
