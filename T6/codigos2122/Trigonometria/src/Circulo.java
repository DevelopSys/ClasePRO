public class Circulo extends Figura{

    private double radio, diametro;

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(){}

    @Override
    public double calcularArea() {
        this.area = Math.PI * Math.pow(this.radio,2);
        return this.area;
    }

    public double calcularDiametro(){
        this.diametro = this.radio *2;
        return this.diametro;
    }
}
