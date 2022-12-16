package objetos;

// base del objeto de tipo coche
public class Coche {

    // propiedades o atributos -> variables
    // cosas que definen al objeto (Coche)
    // marca, modelo, cv, numeroPuertas, precio
    private String marca, modelo;
    private int cv, numeroPuertas, precio;

    // métodos -> constructor siempre y cuando no tenga otro hay uno por defecto
        // por defecto tengo el constructor default Coche()
        // marca = null modelo = null cv = 0 numeroPuertas = 0 precio = 0

        // public NombreClase(parametros){}


    public Coche(){
        modelo = "por defecto";
        marca = "por defecto";
    }
    public Coche(String marca, String modelo, int numeroPuertas, int cv, int precio){
        this.marca  = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cv = cv;
        this.numeroPuertas = numeroPuertas;
    }
    public Coche(String marca, String modelo, int numeroPuertas, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.numeroPuertas = numeroPuertas;
        precio = 5000;
    }


    // métodos -> funcionalidades

    // métodos -> getter / setter


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

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
