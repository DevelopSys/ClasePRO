package model;

import java.util.ArrayList;

public class Cliente {

    private ArrayList<Consumicion> consumiciones;
    private double totalFactura;

    public Cliente() {
        this.consumiciones = new ArrayList<>();
        // totalFactura=0
    }
    public ArrayList<Consumicion> getConsumiciones() {
        return consumiciones;
    }

    // public void anadirConsumicion(){}

    public void incrementarFactura(double precio){
        this.totalFactura+=precio;
    }
    public void mostrarDatos(){
        System.out.println("totalFactura = " + totalFactura);
        for ( Consumicion consumicion : consumiciones ) {
            consumicion.mostrarDatos();
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
