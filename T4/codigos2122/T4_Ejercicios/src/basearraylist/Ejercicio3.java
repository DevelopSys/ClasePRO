package basearraylist;

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<String> listaCompanieros = new ArrayList<>();
        listaCompanieros.add("Borja1");
        listaCompanieros.add("Borja2");
        listaCompanieros.add("Borja3");
        listaCompanieros.add("Borja4");
        listaCompanieros.add("Borja5");
        listaCompanieros.add("Borja6");
        int aleatorio = (int) (Math.random()*listaCompanieros.size());
        System.out.println(listaCompanieros.get(aleatorio));
    }
}
