package ejercicio4;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Object[]> listaContactos;

    public Agenda() {
        listaContactos = new ArrayList<>();
    }

    // añadir
    // solo si el correo no esta en la lista actualmente
    public void anadirConctacto(Object[] contacto) {
        if (buscarContactoCorreo(contacto[1].toString()) == null) {
            System.out.println("Contacto añadido correctamente");
            listaContactos.add(contacto);
        } else {
            System.out.println("El contacto no se puede agregar, duplicado");
        }
    }

    // listar
    public void listarContactos() {
        if (listaContactos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            int contador = 1;
            for (Object[] contacto : listaContactos) {
                System.out.println("Imprimiendo contacto " + contador);
                for (Object dato : contacto) {
                    System.out.println("\t" + dato);
                }
                contador++;
            }
        }
    }

    // buscar
    public Object[] buscarContactoNombre(String nombre) {
        for (Object[] contacto : listaContactos) {
            if (nombre.equals(contacto[0])) {
                // sacar todos los datos
                return contacto;
            }
        }
        return null;
    }

    public Object[] buscarContactoCorreo(String correo) {
        for (Object[] contacto : listaContactos) {
            if (correo.equals(contacto[1].toString())) {
                return contacto;
            }
        }
        return null;
    }
    // eliminar
    // ordenar por edad

}
