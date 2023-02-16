package model;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Elemento> listaElementos;
    private int numeroSocios;

    public Biblioteca() {
        this.listaPersonas = new ArrayList<>();
        this.listaElementos = new ArrayList<>();
        // numeroSocios = 0
    }

    // registrarPersona
    public void registrarPersona(Persona p) {
        if (p instanceof Socio) {
            numeroSocios++;
            ((Socio) p).setNumeroSocio(numeroSocios);
        }
        listaPersonas.add(p);
    }

    public void listarUsuarios() {
        for (Persona item : listaPersonas) {
            item.mostrarDatos();
        }
    }

    public void darBajaSocio(int numeroSocio) {
        for (Persona item : listaPersonas) {
            if (item instanceof Socio) {
                if (((Socio) item).getNumeroSocio() == numeroSocio) {
                    listaPersonas.remove(item);
                    break;
                }
            }
        }
    }

    public void registrarElemento(Elemento elemento) {
        listaElementos.add(elemento);
    }

    public void listarElementos() {
        for (Elemento item : listaElementos) {
            item.mostrarDatos();
        }
    }

    public void darBajaElemento(int id) {
        for (Elemento item : listaElementos) {
            if (item.getId() == id) {
                listaElementos.remove(item);
                break;
            }
        }
    }

    public Socio buscarSocio(int numeroSocio) {

        for (Persona item : listaPersonas) {
            if (item instanceof Socio) {
                if (((Socio) item).getNumeroSocio() == numeroSocio) {
                    return (Socio) item;
                }
            }
        }

        return null;
    }


    public void prestarElemento(Prestable elemento, int numeroSocio) {
        // necesito un prestable y un socio (o un numero)
        // si está disponible
        // se pone el elemento en la lista del socio
        // cambia el estado del elemento en la lista de la biblioteca
        // relacion con el prestar del prestable
        // relacion con el agregarPrestamo del socio
        Socio socioEncontrado = buscarSocio(numeroSocio);
        if (socioEncontrado != null && !((Elemento) elemento).isPrestado()) {
            elemento.prestar();
            socioEncontrado.agregarPrestamo(elemento);
        } else {
            System.out.println("Alguno de los elementos del proceso ha falladao");
        }
    }

    public void mostrarPrestables() {
        for (Elemento item : listaElementos) {
            /*if (item instanceof Libro || item instanceof DVD){
                item.mostrarDatos();
            }*/
            if (item instanceof Prestable && item.isPrestado()) {
                item.mostrarDatos();
            }
        }
    }

    public void devolverElemento(Prestable elemento, int numeroSocios) {
        // necesito un prestable y un socio (o un numero)
        // si no está disponible
        // se quita el elemento en la lista del socio
        // se cambia el estado del elemento
        // relacion con el devolver del prestable
        // relacion con el reslizarDevoluvion del socio
        Socio socioEnontrado = buscarSocio(numeroSocios);
        if (socioEnontrado != null && ((Elemento) elemento).isPrestado()) {
            elemento.devolver();
            socioEnontrado.devolverPrestamo(elemento);
        }
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public int getNumeroSocios() {

        int contador = 0;
        for (Persona item : listaPersonas) {
            if (item instanceof Socio) {
                contador++;
            }
        }

        return contador;
    }

    public void setNumeroSocios(int numeroSocios) {
        this.numeroSocios = numeroSocios;
    }
}