package ejercicios.ejercicioTrigonometria;

public class Circulo {

    // variables
    private double area, radio, diametro;

    // constructores
    public Circulo(){
        // inicializa todas las variables a valores por defecto (primitivas) o null (complejas)
    }

    public Circulo(double radio){
        //System.out.println("asdasd");
        this.radio = radio;
    }

    // métodos

    public void calcularArea(){
        // (A=Pi*r2)
        this.area = Math.PI*(this.radio * this.radio);
    }

    public void calcularDiametro(){
        // D = 2*r
        this.diametro = 2*this.radio;
    }

    // getter setter


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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
}
