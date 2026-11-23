package model;

public class Coche {

    // atributos - Cualifican al objeto
    public String marca, modelo;
    public int cv;
    public double precio;

    // constructores -> minimo 1*** public void nombre(){}
    public Coche() {
        precio = 1000;
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
}
