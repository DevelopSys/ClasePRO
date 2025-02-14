package model;

abstract public class Vehiculo {

    private String numeroSerie, estado, marca, modelo;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String numeroSerie, String estado, String marca, String modelo, double precio) {
        this.numeroSerie = numeroSerie;
        this.estado = estado;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.precio += calcularIncremento() ;
    }

    private double calcularIncremento(){
        double incremento =0;

        if (this.estado.equalsIgnoreCase("nuevo")){
            System.out.println("entra por nuevo");
            incremento = this.precio*0.1;
        } else if (this.estado.equalsIgnoreCase("seminuevo")){
            incremento = this.precio*0.05;
        }

        return incremento;
    }

    public void mostrarDatos(){
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("estado = " + estado);
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("precio = " + precio);
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
