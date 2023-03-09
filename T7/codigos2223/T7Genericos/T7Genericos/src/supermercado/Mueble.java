package supermercado;

public final class Mueble extends Producto{

    private String descripcion;

    public Mueble(int precio, String nombre, String descripcion) {
        super(precio, nombre);
        this.descripcion = descripcion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Descripcion");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
