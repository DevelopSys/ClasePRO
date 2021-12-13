import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Colecciones {

    public static void main(String[] args) {

        // lista de cualquier tipo > OBJECT
        ArrayList listaCosas = new ArrayList();
        // para poder saber su tamaño
        int tamanio = listaCosas.size(); // --> 0
        System.out.println(tamanio);

        // añado un elemento a la lista
        listaCosas.add(5);
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("1");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        //System.out.println(listaCosas);
        String palabra = String.valueOf(listaCosas.get(1));
        System.out.println("El valor es: " + palabra);
        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add(0.9);
        listaCosas.add(6);
        listaCosas.add("4");
        listaCosas.add(6);
        listaCosas.add(6);
        listaCosas.add("9");
        listaCosas.add(6);
        listaCosas.add(34567);
        listaCosas.add(6);

        // sacar de golpe todos los elementos del array

        /*for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println( i+1 +" - "+listaCosas.get(i));
        }*/

        int posiciones = 1;
        for (Object item : listaCosas) {
            System.out.println(posiciones + "-" + item);
            posiciones++;
        }

        // buscar dentro de una lista la palabra "Borja"
        // cuando la encuentre sacar el mensaje
        // palabra encontrada y la posición de la misma

        /*posiciones = 0;
        for (Object item : listaCosas) {

            if (item.equals("Hola")) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posición "+posiciones);
            }
            posiciones++;
        }*/
        /*int posicionElemento  =listaCosas.indexOf("sdfgh");

        if (posicionElemento>-1){
            System.out.println("Palabra encontrada");
            System.out.println("En la posicion "+posicionElemento);
        }

        // Pidais por consola una palabra a buscar
        // en el caso de que la palabra se encuente en la lista
            // se modifique su valor por otro pedido por consola
        // en el caso de que la palanra no se encuentre en la lista
            // se agregará al final

        Scanner lectura = new Scanner(System.in);
        System.out.println("Que numero quieres buscar");
        int palabraBusqueda = lectura.nextInt();

        int posicionEncontrada = listaCosas.indexOf(palabraBusqueda);

        if (posicionEncontrada > -1){
            // 0 a n --> la palabra está
            System.out.println("Por que palabra quieres sustituir");
            palabraBusqueda = lectura.nextInt();
            listaCosas.set(posicionEncontrada,palabraBusqueda);

        } else {
            // -1 --> la palabra no está
            listaCosas.add(palabraBusqueda);
        }

        System.out.println(listaCosas);*/


        System.out.println("El tamaño actual es de: "+listaCosas.size());
        listaCosas.remove(0);

        System.out.println(listaCosas);

        /*for ( Object item : listaCosas ) {

            if (item.equals(6)){
                listaCosas.remove(item);
            }
        }*/

        /*for (int i = 0; i < listaCosas.size(); i++) {

            if (listaCosas.get(i) instanceof Integer){
                // solo lo quiero hacer cuando se un numero
                if (((int)listaCosas.get(i))== 6){
                    listaCosas.remove(i);
                }
            }
         }
         */
        listaCosas.removeIf( new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        });
        

        System.out.println(listaCosas);

    }

}
