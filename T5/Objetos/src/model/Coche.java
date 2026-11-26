package model;

public class Coche {

    // atributos - Cualifican al objeto
    private String marca, modelo;
    private int cv, km, velocidad;
    private double precio;

    // constructores -> minimo 1*** public void nombre(){}
    public Coche() {
        this.precio = 1000;
    }

    public Coche(String marca, String modelo, int cv, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        if (cv > 300) {
            this.precio = precio * 1.4;
        } else if (cv > 200) {
            this.precio = precio * 1.2;
        } else {
            this.precio = precio * 1.1;
        }
    }

    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.precio = 20000;
    }

    public Coche(String marca, int cv, double precio) {
        this.marca = marca;
        this.cv = cv;
        this.precio = precio;
    }

    public Coche(int cv, String modelo, double precio) {
        this.modelo = modelo;
        this.cv = cv;
        this.precio = precio;
    }


    // metodos
    public void mostrarFichaTecnica() {
        String marca = this.marca == null ? "sin definir" : "marca = "+getMarca();
        System.out.println(marca);
        System.out.println("modelo = " + modelo);
        System.out.println("cv = " + cv);
        System.out.println("precio = " + precio);
        System.out.println("velocidad = " + velocidad);
        System.out.println("km = " + km);
    }

    // realizar el metodo acelerar -> incrementar la velocidad
    /*
    si tengo mas de 200 cv -> velocidad max es de 280
    si tengo menos -> velocida max es de 250
     */
    // realizar el metodo frenar -> decrementar la velocidad
    /*
    no puedo decelerar negativo
    no puedo tener una velocidad de 0
     */

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
