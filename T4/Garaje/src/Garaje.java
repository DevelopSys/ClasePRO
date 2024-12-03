import java.util.ArrayList;
import java.util.Objects;

public class Garaje {

    private ArrayList<Object[]> listaCoches = new ArrayList<>();

    public void anadirCoche(String marca, String modelo,
                            int cv, String matricula) {
        Object[] coche = new Object[]{marca, modelo, cv, matricula};
        if (listaCoches.size() < 5) {
            //

            if (!estaCoche(matricula)) {
                listaCoches.add(coche);
            } else {
                System.out.println("La matricula esta en la lista, imposible agregar");
            }

        } else {
            System.out.println("Garaje lleno");
        }
    }

    private boolean estaCoche(String matricula) {

        for (Object[] coche : listaCoches) {
            if (coche[3].equals(matricula)) {
                return true;
            }
        }

        return false;
    }

    public void mostrarCoches() {
        if (listaCoches.isEmpty()) {
            System.out.println("No hay coches que listar");
        } else {
            for (Object[] coche : listaCoches) {
                System.out.println(coche[3] + " - " + coche[0] + " - " + coche[1]);
            }
        }


    }

    public void listarMarca(String marca) {
        for (Object[] coche : listaCoches) {
            if (coche[0].toString().equalsIgnoreCase(marca)){
                System.out.println(coche[3] + " - " + coche[0] + " - " + coche[1]);
            }
        }
    }


}
