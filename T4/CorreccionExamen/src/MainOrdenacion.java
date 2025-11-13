import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainOrdenacion {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(31);
        numeros.add(21);
        numeros.add(51);
        numeros.add(9);
        numeros.add(20);
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("werwasdasdasd");
        palabras.add("hj");
        palabras.add("kiuasda");
        palabras.add("asda");
        palabras.add("dfasdahgf");
        palabras.add("gfasdas");



        /*
        int mayor = numeros.getFirst();
        int menor = numeros.getFirst();
        for (int item: numeros ) {
            if (mayor<item)
                mayor = item;
            if (menor>item)
                mayor = item;
        }*/


        // Collections.sort(palabras);
        // numeros.getFirst();
        // numeros.getLast();
        /*
         */
        palabras.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else  {
                    return -1;
                }

            }
        });
        for (String item : palabras) {
            System.out.println(item);
        }

        // System.out.println(palabras.getFirst());
        // System.out.println(palabras.getLast());
    }
}
