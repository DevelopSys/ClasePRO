public abstract class Pedido {

    double precio;
    int numeroConsumiciones;

    public Pedido(double precio, int numeroConsumiciones) {
        this.precio = precio;
        this.numeroConsumiciones = numeroConsumiciones;
        calcularPrecioReal();
    }

    public abstract void calcularPrecioReal();

    public void mostrarFactura(){
        System.out.println("Precio "+precio);
        System.out.println("Consumiciones "+numeroConsumiciones);
        System.out.println("CIF "+Constantes.CIF);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroConsumiciones() {
        return numeroConsumiciones;
    }

    public void setNumeroConsumiciones(int numeroConsumiciones) {
        this.numeroConsumiciones = numeroConsumiciones;
    }
}
