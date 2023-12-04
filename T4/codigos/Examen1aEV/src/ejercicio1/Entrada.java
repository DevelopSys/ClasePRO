package ejercicio1;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Columna");
        palabras.add("Baraja");
        palabras.add("Importar");
        palabras.add("Sabio");
        palabras.add("Pantalla");
        palabras.add("Exterior");
        palabras.add("Pupila");

        for (String item : palabras) {
            System.out.println(item);
        }
        String[] aleatorias = new String[4];
        for (int i = 0; i < aleatorias.length; i++) {
            aleatorias[i] = palabras.get((int) (Math.random() * 8));
        }
    }
}
