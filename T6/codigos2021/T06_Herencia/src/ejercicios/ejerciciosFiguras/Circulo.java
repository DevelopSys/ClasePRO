package ejercicios.ejerciciosFiguras;

public final class Circulo extends Figura {

    private double radio, diametro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Diametro: "+diametro);
        System.out.println("Radio: "+radio);
    }

    public double calcularDiametro(){
        return  0;
    }

    @Override
    public double calcularArea() {

        this.area = Math.PI * (this.radio * this.radio);
        return area;
    }
}
