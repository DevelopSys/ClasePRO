package controller;

import model.Contacto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {
    private List<Contacto> contactos;
    private GestorFicheros gestorFicheros;

    public Agenda() {
        contactos = new ArrayList<>();
        gestorFicheros = new GestorFicheros();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.stream()
                .filter(item -> item.getDni().equalsIgnoreCase(contacto.getDni()))
                .findAny()
                .ifPresentOrElse(item -> System.out.println("No se puede ejecutar el contacto ya existe")
                        , () -> {
                            contactos.add(contacto);
                            System.out.println("Conctacto agregado correctamente");
                        });
    }

    public void mostrarContactos() {
        /*for (Contacto contacto: contactos) {
            contacto.mostrarDatos();
        }*/
        contactos.forEach(Contacto::mostrarDatos);
    }

    public void buscarContacto(String dni) {
        /*
        for (Contacto c: contactos) {
            if(c.getDni().equalsIgnoreCase(dni)){
                c.mostrarDatos();
            }
        }*/

        /*contactos.stream()
                .filter(item->item.getDni().equalsIgnoreCase(dni))
                .findFirst()
                .ifPresent(item->item.mostrarDatos());*/


        Optional<Contacto> usuario = contactos.stream()
                .filter(item -> item.getDni().equalsIgnoreCase(dni))
                .findFirst();

        if (usuario.isPresent()) {
            usuario.get().mostrarDatos();
        } else {
            System.out.println("No hay contacto con ese dni");
        }
    }

    public void exportarContactos(){
        contactos
                .forEach(item->gestorFicheros.escribirContacto(item));
    }

    public void importarContactos(){
        // contactos.addAll(gestorFicheros.importarContactos());
        contactos = gestorFicheros.importarContactos();
    }

    public List<Contacto> getContacto() {
        return contactos;
    }

    public void setContacto(List<Contacto> contacto) {
        this.contactos = contacto;
    }
}
