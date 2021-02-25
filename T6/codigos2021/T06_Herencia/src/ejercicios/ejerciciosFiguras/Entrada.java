package ejercicios.ejerciciosFiguras;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        /*ArrayList<Triangulo> listaTriangulo = new ArrayList<>();
        ArrayList<Circulo> listaCirculo = new ArrayList<>();
        ArrayList<Rectangulo> listaRectangilo = new ArrayList<>();

        listaCirculo.add(new Circulo());
        listaTriangulo.add(new Triangulo());
        listaRectangilo.add(new Rectangulo(2,3));

        listaCirculo.get(0).calcularArea();
        listaRectangilo.get(0).calcularArea();
        listaRectangilo.get(0).calcularArea();*/

        ArrayList<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Circulo(3));
        listaFiguras.add(new Triangulo(3,5));
        listaFiguras.add(new Rectangulo(2,4));

        for ( Figura figuraItem : listaFiguras) {
            figuraItem.calcularArea();
            figuraItem.mostrarDatos();
        }

    }
}
