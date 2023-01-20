package ejercicioTrigonometria;

public class Cuadrado {

    private int base, altura;
    private double area,perimetro;

    public Cuadrado() {}

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    public void mostrarDatos(){
        System.out.println("BAse: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
    }

    public double calcularArea(){
        this.area = this.base * this.altura;
        return this.area;
    }

    public double calcularPerimetro(){
        this.perimetro = 2*this.base + 2*this.altura;
        return this.perimetro;
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
