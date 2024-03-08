package tiendanidada.utils;

public enum Tamanio {
    m(3),s(2),l(4);

    private int precioReparacion;

    Tamanio(int precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public int getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(int precioReparacion) {
        this.precioReparacion = precioReparacion;
    }
}
