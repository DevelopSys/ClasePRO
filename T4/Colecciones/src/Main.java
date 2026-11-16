import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Object -> super clase de java
        ArrayList<String> datos = new ArrayList<>();
        System.out.println("La lista esta vacia " + datos.isEmpty());
        System.out.println("El tamaño de la lista es de " + datos.size());
        System.out.println("Añadir un elemento");
        datos.add("Elemento 1");
        datos.add("Elemento 2");
        datos.add("Elemento 3");
        System.out.println("El tamaño de la lista es de " + datos.size());
        System.out.println("Obteniendo elementos");
        String elemento = datos.get(1);
        System.out.println("El elemento de la posicion 2 es " + datos.get(1));
        System.out.println("Procedemos a eliminar un dato de la lista");
        System.out.println("Elemento con valor " + datos.remove(0) + " eliminado correctamente");
        System.out.println("El tamaño de la lista es de " + datos.size());

        /*for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i));
        }*/

        /*for ( String item : datos ) {
            System.out.println(item);
        }*/

        datos.forEach((data) -> System.out.println(data));
        boolean esta = datos.contains("Elemento 2");
        System.out.println("El elemento esta en la lista " + esta);
        datos.clear();
        System.out.println("El tamaño de la lista es de " + datos.size());
        datos.add("Hola");
        datos.add("Adios");
        datos.add("Buenos dias");
        // ordenacion facil
        // datos.so
        System.out.println("Ordenacion");
        // Collections.sort(datos);
        // datos.forEach((item)-> System.out.println(item));
        // ordenacion compleja
        datos.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return -1;
                }
                return 1;

            }
        });
        datos.forEach((item) -> System.out.println(item));

        datos.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        });
        ArrayList<Integer> lista = new ArrayList<>();
        lista.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 0;
            }
        });

        /*datos.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {

            }
        });*/
    }
}
