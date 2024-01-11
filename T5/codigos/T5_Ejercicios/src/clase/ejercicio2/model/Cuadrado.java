package clase.ejercicio2.model;

public class Cuadrado {

    private int base, altura;
    private double area, perimetro;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    public void calcularArea(){
        this.area = base*altura;
    }

    public void calcularPerimetro(){
        this.perimetro = (2*altura)+(2*base);
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
