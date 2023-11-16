package arraylist.ejercicio1;

import java.util.ArrayList;

public class Garaje {

    private ArrayList<Object[]> listaCoches;
    private int coste;

    // public void Nombre(){}
    public Garaje(){
        listaCoches = new ArrayList<>();
    }

    public void agregarCoche(Object[] coche) {
        // 1234A
        Object[] cocheAdd = estaCoche(coche[3].toString());
        if (cocheAdd != null) {
            System.out.println("El coche esta en la lista");
        } else {
            listaCoches.add(coche);
            System.out.println("Coche añadido correctamente");
        }
    }

    public void listarCoches() {

        if (!listaCoches.isEmpty()){
            for (Object[] coche : listaCoches) {
                System.out.println("Los datos del coche con matricula " + coche[3] + " son");
                for (Object item : coche) {
                    System.out.println("\t" + item);
                }
            }
        } else {
            System.out.println("La lista esta vacia, no se puede listar nada");
        }
    }

    public void mostrarCostes() {
        // recorrer y buscar la posicion de los costes y sumar
        int costeTotal = 0;
        for ( Object[] item : listaCoches ) {
            costeTotal += (int)item[2];
        }
        System.out.println("Los costes aculados del garaje son "+costeTotal);
    }

    public void eliminarCoche(String matricula) {
        Object[] cocheDel = estaCoche(matricula);
        if (cocheDel != null) {
            listaCoches.remove(cocheDel);
            System.out.println("Coche borrado correctamente");
        } else {
            System.out.println("El coche no se encuentra en la lista");
        }
    }

    public void vaciarLista() {
        listaCoches.clear();
        System.out.println("Lista vacia");
    }

    public void buscarCoche(String matricula) {

        Object[] coche = estaCoche(matricula);
        if (coche != null) {
            // sacar la info
            for (Object item : coche) {
                System.out.println(item);
            }
        } else {
            System.out.println("No esta en la lista");
        }
    }

    private Object[] estaCoche(String matricula) {

        for (Object[] item : listaCoches) {
            if (item[3].toString().equalsIgnoreCase(matricula)) {
                // el coche esta en la lista
                return item;
            }
        }

        return null;
    }

    private boolean estaCocheBool(String matricula) {

        for (Object[] item : listaCoches) {
            if (item[3].toString().equalsIgnoreCase(matricula)) {
                return true;
            }
        }
        return false;
    }
}
