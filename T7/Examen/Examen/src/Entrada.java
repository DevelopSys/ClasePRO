import controller.Tienda;
import model.*;
import utils.Estado;
import utils.Tipo;

public class Entrada {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        // nt numeroSerie, int precio, String marca, String modelo, Estado estado, Tipo tipo
        tienda.añadirVehiculo(new Bici(1, 100, "marca bici",
                "modelo bici", Estado.NUEVO, Tipo.MTB));
        tienda.añadirVehiculo(new Moto(2, 200, "marca moto",
                "modelo moto", Estado.NUEVO, "Automatica", 2000));
        tienda.añadirVehiculo(new Patinete(3, 100, "marca patinete",
                "modelo patinete", Estado.USADO, 50));
        tienda.añadirVehiculo(new Coche(4, 10000, "marca coche",
                "modelo coche", Estado.USADO, 100, 2000));

        //

        for (Vehiculo vehiculo: tienda.getListaVehiculos()) {
            if (vehiculo instanceof Reparable){
                System.out.println("Reparando vehiculo con numero de serie "+vehiculo.getNumeroSerie());
                ((Reparable) vehiculo).reparar();
            }
        }

        tienda.repararVehiculo(2);
        tienda.venderVehiculo(1);
        tienda.venderVehiculo(2);
        tienda.venderVehiculo(3);
        tienda.getListado();
        System.out.println(tienda.getCaja());
        
    }
}
