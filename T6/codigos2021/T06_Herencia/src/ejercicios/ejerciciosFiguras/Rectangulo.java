package ejercicios.ejerciciosFiguras;

public final class Rectangulo extends Figura {

    private double base, altura, perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro(){
        perimetro = 2* (this.base * this.altura);
        return perimetro;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La base es: "+this.base);
        System.out.println("La altura es: "+this.altura);
        System.out.println("El perimetro es: "+this.perimetro);
    }

    @Override
    public double calcularArea() {
        this.area = this.base * this.altura;
        return area;
    }
}
