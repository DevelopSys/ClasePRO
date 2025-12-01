package model;

public class Cuadrado {
    private int base, altura;
    private int area;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    private void calcularArea() {
        this.area = 2 * base + 2 * altura;
    }

    public void mostrarDatos(){
        System.out.println("base = " + base);
        System.out.println("altura = " + altura);
        System.out.println("area = " + area);
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
