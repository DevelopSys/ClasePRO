import java.util.ArrayList;

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
        listaCosas.add("Borja");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        //System.out.println(listaCosas);
        String palabra = String.valueOf(listaCosas.get(1));
        System.out.println("El valor es: " + palabra);
        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("Hola");
        listaCosas.add("true");
        listaCosas.add(34567);

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

        posiciones = 0;
        for (Object item : listaCosas) {

            if (item.equals("Hola")) {
                System.out.println("Palabra encontrada");
                System.out.println("En la posición "+posiciones);
            }
            posiciones++;
        }


    }

}
