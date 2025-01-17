package model;

public class Coche {

    // propiedades
    private String marca, modelo, color, matricula, bastidor;
    private double precio;
    private int cv, par;

    // constructores -> por defecto tengo el constructor vacio sin escribir nada
    public Coche() {
        // para poder ejecutar funciones cuando el obj se crea
        matricula = "sin definir";
        modelo = "sin definir";
        marca = "sin definir";
        bastidor = "sin definir";
        color = "sin definir";
    }

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.par = (int) Math.pow(cv * 2, 2);
    }

    // inicializo el coche con marca modelo color mat bastido cv precio
    // par -> calcula
    // precio -> lo que me dan + %15
    public Coche(String marca, String modelo, String color,
                 String matricula, String bastidor, int cv,
                 double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.cv = cv;
        this.par = (int) Math.pow(cv*2,2);
        this.precio = precio + (precio*0.15);
    }

    public Coche(String marca, String modelo, String matricula, String bastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.bastidor = bastidor;
    }

    // metodos
    public void mostrarDatos() {
        System.out.println("La marca es: " + this.marca);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("Los cv son: " + this.cv);
        System.out.println("El par es: " + this.par);
        System.out.println("El color es: " + this.color);
        System.out.println("El n bastidor es: " + this.bastidor);
        System.out.println("La matricula es: " + this.matricula);
        System.out.println("El precio es: " + this.precio);
    }

    // metodos especiales


    public String getMarca() {
        return this.marca;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
