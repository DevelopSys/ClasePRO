package ejercicio4;

import java.util.ArrayList;
import java.util.function.Predicate;

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
    public void eliminarObjeto(String correo) {
        if (listaContactos.remove(buscarContactoCorreo(correo))) {
            System.out.println("Contacto borrado correctamente");
        } else {
            System.out.println("No se ha encontrado el contacto");
        }
    }

    public void eliminarPosicion(String correo) {
        for (int i = 0; i < listaContactos.size(); i++) {
            // la i es la posicion
            if (listaContactos.get(i)[1].equals(correo)) {
                listaContactos.remove(i);
                break;
            }
        }
    }

    public void vaciarLista() {
        listaContactos.clear();
    }

    public void eliminarNombre(String nombre) {
        listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return nombre.equals(objects[0]);
            }
        });
    }

    // ordenar por edad
    public void ordenarListaEdad() {
        Object[] mayor = listaContactos.getFirst();
        for (Object[] contacto : listaContactos) {
            if ((int) (contacto[3]) > (int) mayor[3]) {
                mayor = contacto;
            }
        }

        System.out.println("El contacto mayor de tu lista es " + mayor[0]);
    }

}
