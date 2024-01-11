package clase.ejercicio2;

import clase.ejercicio2.model.Circulo;
import clase.ejercicio2.model.Cuadrado;
import clase.ejercicio2.model.Triangulo;

public class Entrada {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4,6);
        Cuadrado cuadrado = new Cuadrado(5,7);
        Circulo circulo = new Circulo(4);
        //triangulo.calcularArea();
        System.out.println("El area del triangulo es "
                +triangulo.getArea());

        //cuadrado.calcularArea();
        System.out.println("El area del cuadrado es "
                +cuadrado.getArea());

        //circulo.calcularArea();
        System.out.println("El area del circulo es "
                +circulo.getArea());
    }
}
