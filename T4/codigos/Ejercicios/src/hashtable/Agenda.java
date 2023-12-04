package hashtable;

import java.util.*;

public class Agenda {

    private Hashtable<Integer, Object[]> listaAgenda;

    public Agenda() {
        listaAgenda = new Hashtable<>();
        ArrayList<String> lista = new ArrayList<>();
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else return 0;
            }
        });
    }

    // agregar persona
    public void agregarPersona(Object[] persona) {
        /*if(listaAgenda.put(persona[3].toString(),persona)!=null){
            // lo has agregado perfecto
            System.out.println("Agregado correctamente");
        } else {
            // la persona esta en la lista
            System.out.println("Fallo al agregar");
        }*/
        if (listaAgenda.containsKey((int) persona[3])) {
            System.out.println("La persona ya esta en la lista");
        } else {
            listaAgenda.put((int) persona[3], persona);
        }
    }

    public void borrarPersona(int dni) {
        if (listaAgenda.containsKey(dni)) {
            listaAgenda.remove(dni);
        } else {
            System.out.println("La persona no esta en la lista");
        }
    }

    public void buscarPersona(int dni) {
        if (listaAgenda.containsKey(dni)) {
            Object[] persona = listaAgenda.get(dni);
            for (Object item : persona) {
                System.out.println(item);
            }
        } else {
            System.out.println("La persona no se encuentra en la lista");
        }
    }

    public void listarPersona() {
        Enumeration<Object[]> elementos = listaAgenda.elements();
        while (elementos.hasMoreElements()) {
            Object[] item = elementos.nextElement();
            for (Object it : item) {
                System.out.println(it);
            }
        }
    }

    private Object[] estaPersona(String dni) {

        Enumeration<Object[]> elementos = listaAgenda.elements();
        while (elementos.hasMoreElements()) {
            Object[] item = elementos.nextElement();
            if (item[3].toString().equals(dni)) {
                return item;
            }
        }

        return null;

    }

    // borrar persona
    // lista personas
    // busca persona

}
