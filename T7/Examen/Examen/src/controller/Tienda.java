package controller;

import model.Almacenable;
import model.Reparable;
import model.Vehiculo;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Vehiculo> listaVehiculos;
    private double caja;

    public Tienda() {
        listaVehiculos = new ArrayList<>();
    }

    public void informacionAlmacenable(){
        ((Almacenable)listaVehiculos.get(0)).apilar();
        ((Reparable)listaVehiculos.get(0)).reparar();
    }

    public void añadirVehiculo(Vehiculo vehiculo){
        if (estaVehiculo(vehiculo.getNumeroSerie())==null){
            listaVehiculos.add(vehiculo);
        } else {
            System.out.println("no se puede porque esta en la lista");
        }
    }

    public void getListado(){
        for (Vehiculo item : listaVehiculos) {
            item.mostrarDatos();
        }
    }

    public void repararVehiculo(int numeroSerie){
        Vehiculo vehiculo = estaVehiculo(numeroSerie);
        if (vehiculo instanceof Reparable){
            ((Reparable) vehiculo).reparar();
        } else {
            System.out.println("Error en el proceso");
        }
    }

    // REPARAR TODOS

    public void venderVehiculo(int numeroSerie){
        Vehiculo vehiculo = estaVehiculo(numeroSerie);
        if (vehiculo !=null){
            caja += vehiculo.getPrecio();
            listaVehiculos.remove(vehiculo);
        } else {
            System.out.println("Fallo en el proceso");
        }
    }

    public void getVehiculo(int numeroSerie){

        Vehiculo vehiculo = estaVehiculo(numeroSerie);
        if (vehiculo!=null){
            vehiculo.mostrarDatos();
        } else {
            System.out.println("El vehiculo del que pides informacion no esta");
        }
    }

    private Vehiculo estaVehiculo(int numeroSerie){

        for (Vehiculo item: listaVehiculos) {
            if (item.getNumeroSerie() == numeroSerie){
                return item;
            }
        }
        return null;

    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
