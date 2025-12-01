package model;

public class Circulo {
    private int radio;
    private double diametro, area;

    public Circulo(){}
    public Circulo(int radio){
        this.radio = radio;
        calcularArea();
        calcularDiametro();
    }

    private void calcularDiametro(){
        this.diametro = 2*this.radio;
    }

    private void calcularArea(){
        this.area = 2*Math.PI*Math.pow(this.radio,2);
    }

    public void mostrarDatos(){
        System.out.println("radio = " + radio);
        System.out.println("diametro = " + diametro);
        System.out.println("area = " + area);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
