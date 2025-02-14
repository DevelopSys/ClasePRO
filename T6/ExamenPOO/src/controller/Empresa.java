package controller;

import model.Bici;
import model.Patinete;
import model.Vehiculo;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo> listaVehiculos;
    private double caja;

    public Empresa() {
        this.listaVehiculos = new ArrayList<>();
        // this.caja = 0.0;
        // 0
    }

    private Vehiculo buscarVehiculo(String numeroSerie){
        for ( Vehiculo vehiculo : listaVehiculos ) {
            if (vehiculo.getNumeroSerie().equalsIgnoreCase(numeroSerie)){
                return vehiculo;
            }
        }
        return null;
    }

    public void mostrarInformacion(String numeroSerie){
        if (buscarVehiculo(numeroSerie)!=null){
            buscarVehiculo(numeroSerie).mostrarDatos();
        } else {
            System.out.println("No puedo, vehiculo no disponible");
        }

    }

    public void agregarVehiculo(Vehiculo vehiculo){
        if (buscarVehiculo(vehiculo.getNumeroSerie())==null){
            listaVehiculos.add(vehiculo);
        } else {
            System.out.println("Ya existe este nSerie");
        }
    }

    public void repararVehiculo(Vehiculo vehiculo){
        if (vehiculo instanceof Bici){
            // bici > 0.05
            vehiculo.setPrecio( vehiculo.getPrecio() + (vehiculo.getPrecio()*0.05) );
            listaVehiculos.add(vehiculo);
        } else if (vehiculo instanceof Patinete){
            // patinete > 0.05
            vehiculo.setPrecio( vehiculo.getPrecio() + (vehiculo.getPrecio()*0.1) );
            listaVehiculos.add(vehiculo);
        } else {
            System.out.println("No tenemos esa funcionalidad");
        }
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
