package clases.estaticos;

public class Equipo {

    private String nombre;
    private int posicion;

    public Equipo(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public void mostrarDatos()
    {
        System.out.printf(String.format("%d %s %n",getPosicion(),getNombre()));
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
}
