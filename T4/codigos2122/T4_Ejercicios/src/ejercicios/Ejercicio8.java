package ejercicios;

public class Ejercicio8 {

    public static void main(String[] args) {

        String palabraMax="";
        String palabraMin="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String frase = "Esto es una frase para poder trabajar con el ejercicio numero 8";
        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() > palabraMax.length()){
                palabraMax = palabras[i];
            }
            if (palabras[i].length()<palabraMin.length()){
                palabraMin = palabras[i];
            }
            if (palabras[i].length() == 4){
                System.out.println(palabras[i]);
            }

        }

        /*for ( String item : palabras ) {

            if (item.length() > palabraMax.length()){
                palabraMax = item;
            }
            if (item.length() < palabraMin.length()){
                palabraMin = item;
            }

            if (item.length() == 4){
                System.out.println(item);
            }
        }*/

        System.out.println("la mas grande es "+palabraMax);
        System.out.println("la mas pequeña es "+palabraMin);
    }
}
