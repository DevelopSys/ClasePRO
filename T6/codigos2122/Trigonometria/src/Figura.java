public abstract class Figura {

    protected double area;
    Figura(){}
    public abstract double calcularArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
