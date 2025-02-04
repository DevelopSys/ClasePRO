import model.Coche;
import model.Moto;
import model.Motor;
import model.Vehiculo;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        // Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche(new Motor(200,20),"1234A","delantera");
        // coche.mostrarDatos();
        Moto moto = new Moto(new Motor(300,50),"234B","pequeña");
        // moto.mostrarDatos();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche);
        vehiculos.add(moto);

        for ( Vehiculo vehiculo : vehiculos ) {
            vehiculo.mostrarDatos();
        }



    }
}
