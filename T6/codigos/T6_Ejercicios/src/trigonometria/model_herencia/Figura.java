package trigonometria.model_herencia;

public abstract class Figura {

    private double area;

    public abstract void calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
