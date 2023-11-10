package arraylistbase;

import java.util.ArrayList;

public class Ejercicio4 {

    private ArrayList<String> listaPalabras;

    public void iniciarEjercicio(){
        iniciarLista();
        contarLetras();
        palabrasExtremos();
    }

    private void iniciarLista(){
        listaPalabras = new ArrayList<>();
        listaPalabras.add("Primera");
        listaPalabras.add("asdasdasdasdasd");
        listaPalabras.add("kjhiogvbn");
        listaPalabras.add("nkbhjmn");
        listaPalabras.add("mjhbvb");
        listaPalabras.add("oiuy");
        listaPalabras.add("iuygbvnmkiu");
        listaPalabras.add("kiuytg");
        listaPalabras.add("kijuhgf");
        listaPalabras.add("oiuytf");
    }

    private void contarLetras(){
        int letrasTotal=0;
        for ( String item : listaPalabras ) {
            letrasTotal = letrasTotal + item.length();
        }
        System.out.println("El numero de letras en total es de "+letrasTotal);
    }

    private void palabrasExtremos(){
        String palabraGrande = listaPalabras.get(0) ;
        String palabraPequenia = listaPalabras.get(0);

        for ( String item : listaPalabras ) {
            if (item.length()> palabraGrande.length()){
                palabraGrande = item;
            }

            if (item.length() < palabraPequenia.length()){
                palabraPequenia = item;
            }
        }

        System.out.println("La palabra mas grande es "+palabraGrande);
        System.out.println("La palabra mas pequeña es "+palabraPequenia);
    }



}
