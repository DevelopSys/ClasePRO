import java.util.ArrayList;
import java.util.function.Consumer;

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
        System.out.println("El elemento esta en la lista "+esta);
        datos.clear();
        System.out.println("El tamaño de la lista es de "+datos.size());
        /*datos.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {

            }
        });*/
    }
}
