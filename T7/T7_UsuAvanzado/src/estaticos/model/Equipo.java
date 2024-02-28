package estaticos.model;

public class Equipo {

    private String nombre, liga;
    private int fundacion;

    public Equipo() {
    }

    public Equipo(String nombre, String liga, int fundacion) {
        this.nombre = nombre;
        this.liga = liga;
        this.fundacion = fundacion;
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

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }
}
