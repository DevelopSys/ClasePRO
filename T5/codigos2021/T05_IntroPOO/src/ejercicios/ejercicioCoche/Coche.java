package ejercicios.ejercicioCoche;

public class Coche {

    // variables
    private String marca, modelo;
    private int bastidor, velocidad;
    private double km;
    private Motor motor;

    public Coche(String marca, String modelo, int bastidor, Motor motor ){
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.motor = motor;
        // vel = 0
        // km = 0
    }


    public Coche(String marca, String modelo, int bastidor, int cv, double cc){
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.motor = new Motor(cv,cc);

    }

    public void mostrarDatos(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Bastido: "+getBastidor());
        System.out.println("CV: "+getMotor().getCaballosV());
        System.out.println("CC: "+getMotor().getCentimetrosC());
    }

    public void reprogramar(){
        // incrementa en 25% el valor de los cv
        int incrementar = (int)(motor.getCaballosV()*0.25);
        this.getMotor().setCaballosV(motor.getCaballosV()+incrementar);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getBastidor() {
        return bastidor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getKm() {
        return km;
    }

    public Motor getMotor() {
        return motor;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
