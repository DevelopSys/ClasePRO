package clases.ejercicios;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {



        ArrayList<Idioma> listaIdiomas = new ArrayList<>();

        Idioma castellano = new Idioma("Español",50000000) {
            @Override
            public void saludar() {
                System.out.println("Hola");
            }

            @Override
            public void despedir() {
                System.out.println("Despedir");

            }
        };

        Idioma aleman = new Idioma("Aleman",100000000) {
            @Override
            public void saludar() {
                System.out.println("ASDASDASdSaludar");
            }

            @Override
            public void despedir() {
                System.out.println("ASDASDASdDespedir");
            }
        };

        castellano.agregarPalabra("Que");
        castellano.agregarPalabra("progamacion");

        aleman.agregarPalabra("asdasd");
        aleman.agregarPalabra("htreter");

        listaIdiomas.add(castellano);
        listaIdiomas.add(aleman);

        for (Idioma idioma: listaIdiomas) {
            System.out.printf("El saludo en %s %n",idioma.getNombre());
            idioma.saludar();
        }

        for (Idioma idioma: listaIdiomas) {
            System.out.printf("La despedida en %s %n",idioma.getNombre());
            idioma.despedir();
        }

        for (Idioma idioma: listaIdiomas) {
            System.out.printf("Las palabras en %s son %n",idioma.getNombre());
            idioma.listarPalabras();
        }







    }
}
