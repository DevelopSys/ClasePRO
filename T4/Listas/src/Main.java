import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList listaDatos=new ArrayList();

        System.out.println("El tamaño actual de la lista es "+listaDatos.size());
        // []
        // añadimos elementos
        listaDatos.add(1);
        listaDatos.add(2);
        listaDatos.add(3);
        listaDatos.add(4);
        listaDatos.add("Palabras");
        listaDatos.add(new Object[]{1,"dato",false,0.0});
        // [1,2,3,4,"Palabras",Object[]]
        System.out.println("El tamaño actual de la lista es "+listaDatos.size());
        // obtener elementos
        System.out.println("El elemento en la posicion 4 es "+listaDatos.get(4));
        System.out.println("Procedemos a sacar todos los datos de la lista");
        for ( Object item : listaDatos ) {
            System.out.println(item);
        }

        Object item = listaDatos.getFirst();
        item = 5;
        for (Object data: listaDatos) {
            System.out.println(data);
        }
        listaDatos.set(0,false);


        /*
        System.out.println("Procedemos a sacar todos los datos del array de la ultima posicion");
        Object[] temporal = (Object[])listaDatos.getLast();

        temporal[0]= 999;

        for ( Object item : (Object[])listaDatos.getLast() ) {
            System.out.println(item);
        }*/

    }


}
