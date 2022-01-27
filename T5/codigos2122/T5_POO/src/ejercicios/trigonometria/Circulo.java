package ejercicios.trigonometria;

public class Circulo {

    private double radio,diametro, area;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public void calcularArea(){
        area = Math.PI * Math.pow(this.radio,2);
    }

    public void calcularDiametro(){
        this.diametro = this.radio * 2;
    }

    public double getArea() {
        return area;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRadio() {
        return radio;
    }
}
