package miltimedia.controlador;

import miltimedia.model.*;

import java.util.ArrayList;

public class Coleccion {

    private ArrayList<Elemento> listaElementos;

    public Coleccion() {
        listaElementos = new ArrayList<>();
    }

    // anadir
    public void anadirElementos(Elemento elemento) {
        if (listaElementos.isEmpty()) {
            elemento.setId(1);
        } else {
            elemento.setId(listaElementos.
                    get(listaElementos.size() - 1).getId() + 1);
        }
        listaElementos.add(elemento);
    }

    public void borrarElemento(int id) {

        boolean esta = false;
        for (Elemento elemento : listaElementos) {
            if (elemento.getId() == id) {
                esta = true;
                listaElementos.remove(elemento);
                break;
            }
        }

        if (!esta) {
            System.out.println("No esta el elemento con dicho id");
        }

    }

    public void listarElementos() {
        for (Elemento elemento : listaElementos) {
            elemento.mostrarDatos();
        }
    }

    public void listarDetalle(int tipo) {
        for (Elemento item : listaElementos) {
            // audios
            if (tipo == 1) {
                if (item instanceof Libro) {
                    item.mostrarDatos();
                }
            } else if (tipo == 2) {
                if (item instanceof Video) {
                    item.mostrarDatos();
                }
            } else if (tipo == 3) {
                if (item instanceof Audio) {
                    item.mostrarDatos();
                }
            }
        }
    }
}

