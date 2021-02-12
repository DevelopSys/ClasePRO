package ejercicios.ejerciciosFiguras;

public final class Triangulo extends Figura {

    private int base, altura;

    public Triangulo(int base, int altura){

        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){

    }

    @Override
    public double calcularArea() {
        this.area = (this.base * this.altura)/2;
        return area;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Base "+this.base);
        System.out.println("Altura "+this.altura);
    }
}
