package clase.ejercicio1.model;

public class Coche {

    private Motor motor;
    private String marca, modelo;
    private double precioAverias;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche(Motor motor, String marca, String modelo) {
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acumularAveria(double precioAveria){
        this.precioAverias += precioAveria;
    }

    public void mostrarDatos(){
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Averias "+precioAverias);
        System.out.println("Datos del motor");
        System.out.println("CV "+motor.getCv());
        System.out.println("Litros aceite "+motor.getLibtrosAceite());
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
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

    public double getPrecioAveria() {
        return precioAverias;
    }

    public void setPrecioAveria(double precioAveria) {
        this.precioAverias = precioAveria;
    }
}
