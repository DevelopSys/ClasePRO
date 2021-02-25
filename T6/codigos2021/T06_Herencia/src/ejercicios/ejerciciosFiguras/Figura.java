package ejercicios.ejerciciosFiguras;

public abstract class Figura {

    // variables
    protected double area;

    // constructor
    public Figura() {

    }

    // metodos
    public abstract double calcularArea();

    public void mostrarDatos() {
        System.out.println("Area " + area);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
