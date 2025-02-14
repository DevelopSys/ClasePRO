import controller.Empresa;
import model.*;

public class Entrada {
    public static void main(String[] args) {


        Empresa empresa = new Empresa(); // []
        empresa.agregarVehiculo(new Moto("1234a", "nuevo", "marca"
                , "modelo", 10000.0, "automatica", 1000.0));
        empresa.agregarVehiculo(new Coche("1234b", "seminuevo", "marca"
                , "modelo", 20000.0, 200, 1000));
        empresa.agregarVehiculo(new Patinete("1234c", "nuevo", "marca"
                , "modelo", 200,100));
        empresa.agregarVehiculo(new Bici("1234d", "nuevo", "marca"
                , "modelo", 200,"mtb"));
        empresa.agregarVehiculo(new Bici("1234d", "nuevo", "marca"
                , "modelo", 200,"mtb"));
        empresa.mostrarInformacion("1234b");
    }

}
