package org.example;

import org.example.controller.ConcesionarioController;
import org.example.database.HibernateUtil;
import org.example.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        ConcesionarioController controller = new ConcesionarioController();
        //controller.agregarCocheFicha();
        controller.getVehiculosCliente();
        //controller.getListaVehiculos();
        //controller.agregarOtroCoche();
        //controller.agregarCoche(new Vehiculo("Mercedes","EQC",new Motor(3000,400),80000, new Ficha(2,2023,'A',true)));
        //controller.getFichaVehiculo();
        //controller.agregarCoche(new Vehiculo("Mercedes","Clase A",new Motor(2000,200),60000));
        //controller.obtenerVehiculo();
        //controller.borrarVehiculo();
        //controller.modificarVehiculo();
        //controller.realizarBusquedaMarca("Ford");
    }
}