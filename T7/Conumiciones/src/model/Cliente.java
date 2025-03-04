package model;

import java.util.ArrayList;

public class Cliente {

    private ArrayList<Consumicion> consumiciones;
    private double totalFactura;

    private String nombre;

    public Cliente() {
        this.consumiciones = new ArrayList<>();
        // totalFactura=0
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.consumiciones = new ArrayList<>();
        // totalFactura=0
    }

    public void setConsumiciones(ArrayList<Consumicion> consumiciones) {
        this.consumiciones = consumiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Consumicion> getConsumiciones() {
        return consumiciones;
    }

    // public void anadirConsumicion(){}

    public void incrementarFactura(double precio){
        this.totalFactura+=precio;
    }
    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("totalFactura = " + totalFactura);
        if (consumiciones.isEmpty()){
            System.out.println("Aun no ha pedido nada");
        } else {
            for ( Consumicion consumicion : consumiciones ) {
                consumicion.mostrarDatos();
            }
        }
    }
    public void setConsumicions(ArrayList<Consumicion> consumicions) {
        this.consumiciones = consumicions;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }
}
