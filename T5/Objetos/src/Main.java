import model.Vehiculo;

import java.lang.invoke.ConstantCallSite;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo0 = new Vehiculo();
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus");
        // marca // modelo // ruedas // cv // cc // tipo
        Vehiculo vehiculo1 = new Vehiculo("Seat", "Panda");
        // marca // modelo // ruedas // cv // cc // tipo
        Vehiculo vehiculo2 = new Vehiculo("Ford", "focus", "utilitario");
        // marca // modelo // ruedas // cv // cc // tipo
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Focus",  "utilitario", 100,2000);
        System.out.println("el modelo del coche es "+vehiculo1.getModelo());


    }
}
