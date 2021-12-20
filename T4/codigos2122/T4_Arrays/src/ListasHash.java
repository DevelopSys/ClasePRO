import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class ListasHash {

    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        // para sacar el tamaño de la lista
        listaElementos.size();
        // guardar cosas en un hashtable
        listaElementos.put("1","Elemento 1");
        listaElementos.put("2", "Elemento 2");
        listaElementos.put("3", false);
        listaElementos.put("4", new String[]{"Cosa 1","Cosa 2", "Cosa 3"});

        System.out.println(listaElementos.size());

        // obtener elementos del hashtable

        String[] elementoEncontrado = (String[]) listaElementos.get("4");
        elementoEncontrado[0] = "Nuevo valor";

        // borrar un elemento

        //listaElementos.remove("1");
        System.out.println(listaElementos.get("1"));

        // for
            // NO fori --> contador, la i
            // NO foreach --> la lista, en cada recorrido me da un objeto de la lista

        System.out.println("Listado completo");
        Enumeration<Object> listaClaves = listaElementos.keys();
        while (listaClaves.hasMoreElements()){
            // hay elemento siguiente
            Object clave = listaClaves.nextElement();
            Object elemento = listaElementos.get(clave);
            System.out.println(elemento);

        }






    }
}
