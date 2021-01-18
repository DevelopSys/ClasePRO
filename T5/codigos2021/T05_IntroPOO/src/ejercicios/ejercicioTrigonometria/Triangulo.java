package ejercicios.ejercicioTrigonometria;

public class Triangulo {
    /*
    *
    * Tenga un constructor vacío y un constructor con base y altura
Tenga dos atributos tipo int, base y altura
Tenga un método que calcule su área (A=(b*al)/2)*/
    private int base, altura;
    private double area;

    public Triangulo() {

    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {

        this.area = (double) (this.base * this.altura) / (double) 2;
        System.out.println(area);

    }

    public void mostrarDatos(){
        System.out.printf("La base es: %d%n",base);
        System.out.printf("La altura es: %d%n",altura);
        System.out.printf("El area es: %.2f%n",area);
    }


    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
