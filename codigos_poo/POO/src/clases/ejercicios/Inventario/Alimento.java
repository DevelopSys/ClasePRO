package clases.ejercicios.Inventario;

public class Alimento implements Inventariable{

    protected String calidad, origen;
    protected double precio;

    public Alimento(String calidad, String origen, double precio) {
        this.calidad = calidad;
        this.origen = origen;
        // 0  = 0.0
        this.precio = precio;
    }

    public String getCalidad() {
        return calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return String.format("%s, %s, %d",getCalidad(),getOrigen(),getPrecio());
    }

    @Override
    public void calcularPrecio() {
        this.precio += this.precio * IVA_ALIMENTOS;
        System.out.println(getPrecio());
    }
}
