package clases.genericos.especializados;

import clases.estaticos.Equipo;

import java.util.List;

public class Entrada {

    public static void main(String[] args) {
        Lista<Integer> listaNumeros = new Lista<>();
        listaNumeros.addNumero(1);
        listaNumeros.addNumero(2);
        listaNumeros.addNumero(3);
        listaNumeros.mostrarNumeros();

        Lista<Double> listaNumerosDecimales = new Lista<>();
        listaNumerosDecimales.addNumero(1.0);
        listaNumerosDecimales.addNumero(2.0);
        listaNumerosDecimales.addNumero(3.0);
        listaNumerosDecimales.mostrarNumeros();

        Lista<Float> listaNumeros2 = new Lista<>();


    }
}
