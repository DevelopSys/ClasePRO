package arraylist.ejercicio1;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Object[]> listaCoches
            = new ArrayList<>();

    public void agregarCoche(Object[] coche) {
        // 1234A

        boolean estaCoche = false;
        for (Object[] item : listaCoches) {
            if (item[3].toString().equalsIgnoreCase(coche[3].toString())) {
                // el coche esta en la lista
                System.out.println("No se puede agregar, el coche ya esta");
                estaCoche = true;
                break;
            }
        }
        // condicion
        if (!estaCoche) {
            listaCoches.add(coche);
        }
    }
    public void listarCoches(){
        for ( Object[] coche : listaCoches ) {
            System.out.println("Los datos del coche con matricula "+coche[3]+" son");
            for (Object item: coche ) {
                System.out.println("\t"+item);
            }

        }
    }

    public void buscarCoche(String matricula){
        // esta la matricula -> sacas sus datos
        // no esta la matricula -> sacas un aviso
    }
}
