package trigonometria;

import clase.ejercicio2.model.Circulo;
import trigonometria.model_herencia.*;

import java.util.ArrayList;

public class Entrada {

    static ArrayList<Figura> elementosTrigonometria = new ArrayList();

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,3);
        Cuadrado cuadrado = new Cuadrado(2,3);
        Ciruclo circulo = new Ciruclo(3);

        anadirElemento(triangulo);
        anadirElemento(cuadrado);
        anadirElemento(circulo);
    }

    public static void anadirElemento(Figura figura){
        elementosTrigonometria.add(figura);
    }


}
