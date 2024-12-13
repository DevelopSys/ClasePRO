package agenda_arraylist.controller;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Object[]> listaContactos;

    // constructor
    // private static void nombre(params){}
    public Agenda() {
        listaContactos = new ArrayList<>();
    }

    public boolean agregarPersona(String nombre, String apellido,
                                  int telefono, String dni) {

        Object[] contacto = {nombre, apellido, telefono, dni};
        // comprobacion dni
        if (buscarUsuario(dni) == null) {
            // agregar
            listaContactos.add(contacto);
            return true;
        }
        // no agregar la persona
        return false;
    }

    private Object[] buscarUsuario(String dni) {

        for (Object[] item : listaContactos) {
            if (String.valueOf(item[3]).equalsIgnoreCase(dni)) {
                // esta en la lista
                return item;
            }
        }
        // no esta en la lista
        return null;
    }

    public int listarDatosPersona(String dni) {
        Object[] usuario = buscarUsuario(dni);
        if (listaContactos.isEmpty()) {
            // la lista esta vacia
            return 1;
        } else if (usuario == null) {
            // la lista no esta vacia pero el usuario no esta
            return 2;
        }
        // la lista no esta vacia pero el usuario si esta
        for ( Object item : usuario ) {
            System.out.println(item);
        }
        return -1;

    }


}
