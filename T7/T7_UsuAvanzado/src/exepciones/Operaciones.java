package exepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Operaciones {

    private ArrayList<Double> listaResultados;
    private String[] operaciones = {"suma", "resta", "division", "multiplicacion"};

    public void sumar(int operando1, int operando2) {
        double resultado = operando1 + operando2;
        try {
            listaResultados.add(resultado);
        } catch (NullPointerException e) {
            System.out.println("Fallo detectado, lista no incializada");
            System.out.println(e.getMessage());
        }
    }

    public void dividir(int operando1, int operando2) {

        double resultado = (double) operando1 / (double) operando2;
        try {
            System.out.println("estas realizando la operacion de " + operaciones[4]);
            listaResultados.add(resultado);
        } catch (Exception e) {
            System.out.println("Error en ejcucion");
            System.out.println(e.getMessage());
            System.out.println("Error la lista no esta inicializada");
        } finally {
            System.out.println("Terminando de operar");
        }

    }

    public void multiplicar(int operando1, int operando2) {
        double resultado = (double) operando1 * (double) operando2;
        listaResultados.add(resultado);

    }

    public void lecturaFichero() throws IOException {

        File file = new File("");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("asdasd");

    }

    public void lanzarPropia(int numero) {

        try {
            if (numero < 0) {
                throw new MyException("este es el mensaje de error");
                //throw new NullPointerException();
            } else {
                System.out.println(numero);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


