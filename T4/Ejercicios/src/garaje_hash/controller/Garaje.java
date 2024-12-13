package garaje_hash.controller;

import javax.swing.plaf.SplitPaneUI;
import java.util.Enumeration;
import java.util.Hashtable;

public class Garaje {

    private Hashtable<String, Object[]> listaCoches;

    public Garaje() {
        listaCoches = new Hashtable<>();
    }

    public void agregarCoche() {
        Object[] coche1 = {"1234A", "Mercedes", "ClaseA", 10000, 150};
        Object[] coche2 = {"2334B", "Mercedes", "ClaseB", 20000, 250};
        Object[] coche3 = {"3456C", "Mercedes", "ClaseC", 30000, 350};
        Object[] coche4 = {"4567D", "Mercedes", "ClaseD", 40000, 450};
        listaCoches.put(String.valueOf(coche1[0]), coche1);
        listaCoches.put(String.valueOf(coche2[0]), coche2);
        listaCoches.put(String.valueOf(coche3[0]), coche3);
        listaCoches.put(String.valueOf(coche4[0]), coche4);
    }

    public void getCoche(String matricula) {
        // sacar solo el coche si esta en la lista
        if (listaCoches.containsKey(matricula)) {
            Object[] cocheEncontrado = listaCoches.get(matricula); // -> null
            System.out.println(cocheEncontrado[3]);
        }
    }

    public void borrarCoche(String matricula){
        listaCoches.remove(matricula); // lo he borrado si esto es != null
    }

    public void modificarCoche(String matricula){
        Object[] coche = listaCoches.get(matricula);
        coche[3] = Integer.valueOf(coche[3].toString()) +20000;
    }

    public void recorrerCochesKey(){
        Enumeration<String> keys = listaCoches.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            getCoche(key);
        }
    }

    public void recorrerCochesElement(){
        System.out.println("Llamada");
        Enumeration<Object[]> coches = listaCoches.elements();
        while (coches.hasMoreElements()){
            Object[] coche = coches.nextElement();
            System.out.println(coche[2]);
        }
    }
}
