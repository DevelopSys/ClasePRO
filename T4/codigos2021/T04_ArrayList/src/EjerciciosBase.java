import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EjerciciosBase {

    public static void main(String[] args) {


        // Crea un programa que cree un ArrayList de palabras,
        // introduce en él 10 palabras cualquiera.
        // Muestra el número de letras de todas las palabras,
        // la palabra con más letras y la palabra con menos letra

        String[] palabras = {"uno", "asd", "asd", "gyrtewq", "gdfsrewq345ty", "hjtyrg"};
        ArrayList<String> palabrasAleatorias = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int aleatorio = (int) (Math.random() * 6);
            palabrasAleatorias.add(palabras[aleatorio]);
        }
        
        int numeroPalabras=0;
        String palabraMax= "" , palabraMin="asdasdasdasdasd";

        int numeroPalabrasFor=0;
        for (int i = 0; i < palabrasAleatorias.size(); i++) {
            numeroPalabrasFor += palabrasAleatorias.get(i).length();
        }

        for (String item:palabrasAleatorias) {
            System.out.println(item.length());
            numeroPalabras += item.length();

            if (palabraMax.length() < item.length()){
                palabraMax = item;
            }

            if (palabraMin.length()> item.length()){
                palabraMin = item;
            }
        }

        for (int i = 0; i < palabrasAleatorias.size(); i++) {
            if (palabrasAleatorias.get(i).length() > palabraMax.length()){
                palabraMax = palabrasAleatorias.get(i);
            }

            if (palabrasAleatorias.get(i).length() < palabraMin.length()){
                palabraMin = palabrasAleatorias.get(i);
            }
        }

        System.out.println(palabraMax);
        System.out.println(palabraMin);
        System.out.println(numeroPalabras);




    }

    public void ejercicioBase5(){
        ArrayList<Integer> listaNumerosUno = new ArrayList<>();
        ArrayList<Integer> listaNumerosDos = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int aleatorioUno = (int) (Math.random()*10);
            int aleatorioDos = (int) (Math.random()*10);
            listaNumerosUno.add(aleatorioUno);
            listaNumerosDos.add(aleatorioDos);
        }

        int coincidencias=0;
        for (int i = 0; i < listaNumerosDos.size(); i++) {
            if (listaNumerosUno.get(i) == listaNumerosDos.get(i)){
                coincidencias++;
            }
        }

        /*int contador=0;
        for (int item:listaNumerosUno) {
            if (item == listaNumerosDos.get(contador)){
                coincidencias++;
            }
            contador++;

        }*/
        System.out.println(coincidencias);
    }

    public void ejercicioBase4() {
        ArrayList<String> compañeros = new ArrayList<>();
        compañeros.add("asd");
        compañeros.add("asc");
        compañeros.add("bgfh");
        compañeros.add("nhgrefw");
        compañeros.add("nb vf");
        compañeros.add("nb vf");
        compañeros.add("nb vf");
        compañeros.add("nb vf");
        compañeros.add("hbgds");
        compañeros.add("louiy");
        int aleatorio = (int) (Math.random() * compañeros.size());
        System.out.println(compañeros.get(aleatorio));


    }

    public void ejercicioBase1() {
        ArrayList<String> listaPalabras = new ArrayList();
        // agregar manualmente
        listaPalabras.add("palabra1");
        listaPalabras.add("Palabra2");
        listaPalabras.add("Palabra3");
        listaPalabras.add("Palabra4");
        listaPalabras.add("Palabra5");
        listaPalabras.add("Palabra6");
        listaPalabras.add("Palabra7");
        listaPalabras.add("Palabra8");
        listaPalabras.add("Palabra9");
        listaPalabras.add("Palabra10");

        System.out.println(listaPalabras);

        // listar palabras
        for (String item : listaPalabras) {
            System.out.println(item);
        }

        /*for (int i = 0; i < listaPalabras.size(); i++) {
            System.out.println("Palabra en la posición: " +i+" "+listaPalabras.get(i));
        }*/
    }

    public void ejercicioBase2() {
        // array de palabras {"asdasd","asdasd","asdasd","asdasd","asdasd","asdasd","asdasd"}
        // arraylist de palabras

        String[] palabras = {"uno", "asd", "asd", "gyrtewq", "gdfsrewq345ty", "hjtyrg"};
        ArrayList<String> palabrasAleatorias = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int aleatorio = (int) (Math.random() * 6);
            palabrasAleatorias.add(palabras[aleatorio]);
        }

        System.out.println(palabrasAleatorias.size());

        for (String item : palabrasAleatorias) {
            System.out.println(item);
        }
    }

    public void ejercicioBase3() {
        ArrayList<Integer> listaNumeros = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 101);
            listaNumeros.add(numero);
        }

        int suma = 0;
        double media = 0.0;

        for (int item : listaNumeros) {
            suma += item;
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }

        int max = 0, min = 101;
        for (int item : listaNumeros) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }

        Collections.sort(listaNumeros);
        min = listaNumeros.get(0);
        max = listaNumeros.get(listaNumeros.size() - 1);

        media = (double) suma / (double) listaNumeros.size();
        System.out.println(media);
        System.out.println(suma);
        System.out.println(max);
        System.out.println(min);

    }
}
