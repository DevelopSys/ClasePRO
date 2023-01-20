package ejercicioTrigonometria;

public class Triangulo {

    private int base, altura;
    private double area;

    public Triangulo(int base, int altura){
        this.base= base;
        this.altura = altura;
    }

    public Triangulo(){}

    public double calcularArea(){

        area = (double) (base*altura)/2;
        return area;
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
}
