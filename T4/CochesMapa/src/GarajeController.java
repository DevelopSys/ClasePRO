import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class GarajeController {
    private HashMap<String, Object[]> garaje;

    // matricula, marca, modelo, cv, precio,
    // 0            1       2     3     4
    public GarajeController() {
        garaje = new HashMap<>();
    }

    // añadir coche
    public void anadirCoche(Object[] coche) {
        /*
        if (garaje.containsKey(coche[0].toString())){
            System.out.println("El coche ya esta en la lista");
        } else {
            garaje.put(coche[0].toString(),coche);
        }
         */
        if (garaje.putIfAbsent(coche[0].toString(), coche) == null) {
            System.out.println("Coche agregado correctamente");
        } else {
            System.out.println("El coche esta, no se puede agregar");
        }
    }

    public void obtenerTamanio() {
        System.out.println("El tamaño de la lista actual es de " + garaje.size());
    }

    public void listarCoches(){
        Set<String> claves =garaje.keySet();
        for (String key : claves) {
            buscarCoche(key);
        }

    }


    // buscar coche
    public void buscarCoche(String matricula){
        Object[] cocheBuscado = garaje.get(matricula);
        if (cocheBuscado==null){
            System.out.println("El coche no esta en la lista");
        } else {
            System.out.println("Imprimiendo los datos del coche.....");
            for (Object item: cocheBuscado) {
                System.out.println("\t"+item);
            }
        }
    }

    // listar coches

    // eliminar coche

    public void eliminarCoche(String matricula) {
        if (garaje.remove(matricula) == null) {
            System.out.println("No se puede borrar, el coche no esta en la lista");
        } else {
            System.out.println("Borrado correctamente");
        }

    }

    // vaciar coches

}
