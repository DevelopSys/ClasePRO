package ejercicio2;

public class Coche {

    private String marca, modelo;
    private double acumuladoAverias;
    private Motor motor;

    public Coche(String marca, String modelo){
        this.modelo = modelo;
        this.marca = marca;
    }

    public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Coche(String marca, String modelo,int cv){
        // inicializas marca
        this.marca = marca;
        // inicializas modelo
        this.modelo = modelo;
        // inicializas motor
        this.motor = new Motor(cv);
    }

    public void acumularAveria(){
        this.acumuladoAverias+=(int)(Math.random() *401 +100);
    }

    public void mostrarDatos(){
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Precio acumulado "+acumuladoAverias);
        System.out.println("Motor:");
        System.out.println("\tCV: "+this.motor.getCv());
        System.out.println("\tLitros aceite: "+this.motor.getLitrosAceite());
    }

    // Crear un método (mostrarDatos) que muestre todos los datos del coche
    //Marca: XXXX
    //Modelo: XXXX
    //PRecio averias acumuladas: XXX
    //Motor:XXX
        //CV:XXX
        //Litros Aceite:XXX


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

    public double getAcumuladoAverias() {
        return acumuladoAverias;
    }

    public void setAcumuladoAverias(double acumuladoAverias) {
        this.acumuladoAverias = acumuladoAverias;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
