package ejercicios.coches;

public class Coche {

    private Motor motor;
    private String marca, modelo;
    private double costeAverias;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        // costeAverias = 0.0
    }

    public Coche (String marca, String modelo, Motor motor){
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
    }

    public void acumularAveria(double costeAveria){
        this.costeAverias += costeAveria;
    }

    public double getCosteAverias() {
        return costeAverias;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }
}
