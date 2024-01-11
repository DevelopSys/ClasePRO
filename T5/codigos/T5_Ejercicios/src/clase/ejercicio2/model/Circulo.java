package clase.ejercicio2.model;

public class Circulo {

    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
    }

    public void calcularArea(){
        this.area = Math.PI * Math.pow(radio,2);
    }

    public void calcularDiametro(){
        // 2*2 = 4
        this.diametro = 2*this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
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
