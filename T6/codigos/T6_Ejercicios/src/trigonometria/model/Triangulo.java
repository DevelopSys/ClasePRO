package clase.ejercicio2.model;

public class Triangulo {

    private int base, altura;
    private double area;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        area = (double)(base*altura)/2;
    }

    private void calcularArea(){
        area = (double)(base*altura)/2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
