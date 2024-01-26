package model;

public abstract class Coche {

    private String marca, modelo;
    private int cv, cc;
    private int velocidad;

    public Coche(){}

    // no hay constructor vacio
    public Coche(String marca, String modelo, int cv, int cc, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
    }

    public abstract void decelerar(int velocidad);

    public void acelerar(int velocidad){
        this.velocidad += velocidad;
    }
    public void mostrarDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("CV: "+cv);
        System.out.println("CC: "+cc);
        System.out.println("Velocidad: "+velocidad);
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

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
