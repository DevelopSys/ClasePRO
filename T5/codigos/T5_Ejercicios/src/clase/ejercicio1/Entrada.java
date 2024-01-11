package clase.ejercicio1;

import clase.ejercicio1.controller.Garaje;
import clase.ejercicio1.model.Coche;
import clase.ejercicio1.model.Motor;

public class Entrada {


    public static void main(String[] args) {
        Coche coche1 = new Coche(new Motor(150),"Marca1","Modelo1");
        Coche coche2 = new Coche(new Motor(150),"Marca2","Modelo2");
        Garaje garaje = new Garaje();
        garaje.aceptarCoche(coche1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2,"motor");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2,"aceite");
        coche1.mostrarDatos();
        coche2.mostrarDatos();
    }
}
