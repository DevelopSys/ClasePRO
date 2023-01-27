package model;

import java.util.Scanner;

public final class Todoterreno extends Coche {
    // tenga todo lo que tiene coche --> extends

    // modelo?? -> si y no
    // marca??? -> si y no
    private String traccion; // --> 2x4 o 4x4
    private boolean modoCampo;

    public Todoterreno() {
    }

    public Todoterreno(String marca, String modelo, String traccion){
        super(marca,modelo);
        // modoCampo = false
        this.traccion =traccion;
    }

    // encender --> si
    // Cuando un 4x4 (no un 4x2) enciende,
    // pregunta si quiero encender el modo campo
        // y --> se enciende "Encendiendo modo campo"

    @Override
    public void encender() {
        super.encender();
        if (traccion.equalsIgnoreCase("4x4")){
            System.out.println("Quieres encender el modo campo (s/n)");
            String respuesta = new Scanner(System.in).next();
            if (respuesta.equalsIgnoreCase("s")){
                modoCampo = true;
            }
        }
    }
    // mostrarDatos --> si --> agregar la traccion y el modoCampo
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Traccion: "+this.traccion);
        System.out.println("Modo campo: "+this.modoCampo);
    }

    public void subirSuspension(){
        System.out.println("Subiendo suspensión");
    }

    // getter // setter -> marca y modelo

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public boolean isModoCampo() {
        return modoCampo;
    }

    public void setModoCampo(boolean modoCampo) {
        this.modoCampo = modoCampo;
    }
}
