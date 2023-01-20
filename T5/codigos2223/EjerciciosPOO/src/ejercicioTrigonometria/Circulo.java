package ejercicioTrigonometria;

public class Circulo {

    private double radio, diametro,area;

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(){}

    public double calcularArea(){
        this.area = Math.PI * Math.pow(this.radio,2);
        return this.area;
    }

    public double calcularDiametro(){
        diametro = 2*this.radio;
        return this.diametro;
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
