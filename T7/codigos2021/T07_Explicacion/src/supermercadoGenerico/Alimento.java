package supermercadoGenerico;

public abstract class Alimento extends Producto {

    protected String calidad, origen;

    public Alimento(String calidad, String origen, int precio) {
        super(precio);
        //super();
        this.calidad = calidad;
        this.origen = origen;
    }

    public Alimento(){}

    public void miMetodo(){

    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
