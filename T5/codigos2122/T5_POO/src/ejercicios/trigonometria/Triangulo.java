package ejercicios.trigonometria;

public class Triangulo {

    private int base, altura;
    private double area;

    public Triangulo(){}

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        this.area = (this.altura*this.base)/2;
    }

    public void mostrarDatos(){
        System.out.println("Area: "+this.area);
        System.out.println("Base: "+this.base);
        System.out.println("Altura: "+this.altura);
    }

    public double getArea() {
        return area;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
}
