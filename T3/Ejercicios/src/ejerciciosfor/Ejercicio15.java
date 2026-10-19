package ejerciciosfor;

import java.util.Arrays;

public class Ejercicio15 {

    public static void main(String[] args) {
        String frase = "Esta frase la vamos a analizar. Para ello creamos una variable, " +
                "que nos sirve de ejemplo. " +
                "Ahora comenzamos, y terminamos, el ejercicio";

        // nº de frases
        // nª letras
        // nª letras sin espacions y sin signos de puntuacin
        // nº palabras


        String[] frases = frase.split("\\."); // asdasd | asdasd | asdasd
        System.out.println("El numero de frases es " + frases.length);
        String[] letras = frase.split("");
        System.out.println("El numero de letras es " + letras.length);
        String[] letrasSinNada = frase.replaceAll(" ","")
                .replaceAll(",","")
                .replaceAll("\\.","").split("");
        System.out.println("El numero de letras solo es " + letrasSinNada.length);
        String[] palabras= frase.split(" ");
        System.out.println("El numero de palabras es " + palabras.length);
        // System.out.println(frases);

    }
}
