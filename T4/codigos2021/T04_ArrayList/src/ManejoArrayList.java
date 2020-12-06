import java.util.ArrayList;

public class ManejoArrayList {

    public static void main(String[] args) {
        ArrayList<String> listaDatos=new ArrayList();
        //System.out.println(listaDatos.size());
        listaDatos.add("Hola");
        listaDatos.add("Que");
        listaDatos.add("Tal");
        listaDatos.add("Estas");
        listaDatos.add("Bien");

        //System.out.println(listaDatos.size());
        //int elemento = (int) listaDatos.get(8);
        //System.out.println((int) listaDatos.get(6));
        /*System.out.println("TODOS");
        for (int i = 0; i < listaDatos.size(); i++) {
            System.out.println(listaDatos.get(i));
        }
        System.out.println(listaDatos);*/
        //listaDatos.remove(0);
        //System.out.println(listaDatos.size());
        //System.out.println(listaDatos.get(0));
        //Object elementoEliminado = listaDatos.remove(4);
        //System.out.println(elementoEliminado);
        /*for (int i = 0; i < listaDatos.size(); i++) {
            Object elementoEliminado = listaDatos.remove(i);
            System.out.println("Eliminando elemento "+elementoEliminado);
        }*/

        //String encontrar = "HOLA";
        /*for ( String palabra :listaDatos) {
            if (encontrar.toLowerCase().equals(palabra.toLowerCase())){
                System.out.println("Encontrada");
            }
        }*/

        //System.out.println(listaDatos.contains("Hola"));
        if (listaDatos.contains("Hola")){
            /*for (int i = 0; i < listaDatos.size() ; i++) {
                if (listaDatos.get(i).equals("Hola")){
                    System.out.println(listaDatos.get(i));
                    break;
                }
            }*/

            int posicion = listaDatos.indexOf("Bien");
            System.out.println(listaDatos.get(posicion)+" y está en la posición "+posicion);

        }else{
            System.out.println("No encontrado");
        }

        System.out.printf(String.format("%.3f",Math.random()*1000));

    }

    public void rellenarArray(ArrayList lista){

    }
}


/*
* 1. Rellena automáticamente un arraylist (solo de doubles) con 50 aleatorios
* 2. Listo los numeros generados
* 3. Obten la suma de todos los aleatorios generados
* 4. Obten la media de todos los números generados
* */
