package arraylistbase;

import java.util.ArrayList;

public class Ejercicio3 {

    private ArrayList<String> companieros;


    public void iniciarEjercicio() {
        iniciarLista();
        obtenerAleatorio();
    }

    private void iniciarLista() {
        companieros = new ArrayList<>();
        companieros.add("Compañero 1");
        companieros.add("Compañero 2");
        companieros.add("Compañero 3");
        companieros.add("Compañero 4");
        companieros.add("Compañero 5");
    }

    private void obtenerAleatorio() {
        System.out.println("El compañero que le toca es: "
                + companieros.get((int) (Math.random() * 5)));
    }

}
