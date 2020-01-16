package inicio;

import java.util.Enumeration;
import java.util.Hashtable;

public class Entrada {

    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable = new java.util.Hashtable();
        hashtable.put(1,"elemento uno");
        hashtable.put(2,"elemento dos");
        hashtable.put(3,"elemento tres");
        //System.out.println(hashtable.size());
        //String elemento = hashtable.get(1);
        //hashtable.remove(1);
        //System.out.println(hashtable.size());
        //boolean existe = hashtable.containsKey(1);
        //System.out.println(existe);
        /*Enumeration elementos = hashtable.elements();
        while (elementos.hasMoreElements()){
            String elemento = (String) elementos.nextElement();
            System.out.println(elemento);
        }*/

        Enumeration<Integer> claves = hashtable.keys();
        while (claves.hasMoreElements()){

            Integer clave = claves.nextElement();
            String elemento = hashtable.get(clave);
            System.out.println(elemento);
        }



    }
}
