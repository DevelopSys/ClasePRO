package ejercicios.ejercicioConsumicion;

public class Articulo {

    private String nombre;
    private double coste;

    public Articulo(String nombre, double coste){
        this.nombre = nombre;
        this.coste = coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getCoste() {
        return coste;
    }
}
