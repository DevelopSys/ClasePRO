import java.util.Enumeration;
import java.util.Hashtable;

public class Entrada {

    public static void main(String[] args) {

        Hashtable<String,Object[]> coleccion =new Hashtable();

        int elementos = coleccion.size();
        System.out.println(elementos);

        Object[] elemento1 = {1,false,"hola"};
        Object[] elemento2 = {2,true,"que"};
        Object[] elemento3 = {3,true,"tal"};
        Object[] elemento4 = {4,false,"estais"};
        Object[] elemento5 = {5,true,"bien"};

        // añadir
        coleccion.put("1",elemento1);
        coleccion.put("2",elemento2);
        coleccion.put("3",elemento3);
        coleccion.put("4",elemento4);
        coleccion.put("5",elemento5);

        // mostrar todos los valores del elemento asociado a la clave 4;

        // 1busco y encuentro

        /*if (coleccion.containsKey("2")){
            Object[] encontrado = coleccion.get("2");
            for ( Object item : encontrado ) {
                System.out.println(item);
            }
        } else {
            System.out.println("El elemento no está");
        }*/

        // listar

        //Enumeration<String> claves = coleccion.keys();
        //System.out.println(claves);
        /*while(claves.hasMoreElements()){
            String key = claves.nextElement();
            Object[] elemento = coleccion.get(key);
            System.out.println("Elemento con clave "+key);
            for ( Object item : elemento) {
                System.out.println(item);
            }
            System.out.println("Elemento iterado");
        }*/


        Enumeration<Object[]> objetos  = coleccion.elements();


        while (objetos.hasMoreElements()){
            Object[] item = objetos.nextElement();
            System.out.println("Elemento con clave "+ item[0]);
            for ( Object ob : item) {
                System.out.println(ob);
            }
            System.out.println("Elemento iterado");
        }

        //coleccion.get




    }
}
