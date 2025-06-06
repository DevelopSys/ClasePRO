import controller.Restaurante;
import model.Bebida;
import model.Cliente;
import model.Comida;
import model.Racion;
import util.Provedor;

public class Entrada {

    public static void main(String[] args) {
        /*
        Bebida bebida = new Bebida("Cerveza",2,300);
        Racion racion = new Racion("Patatas",4,1);
        Comida comida = new Comida("Bocadicallo",3,1000);

        bebida.mostrarDatos();
        racion.mostrarDatos();
        comida.mostrarDatos();
        */

        Restaurante restaurante = new Restaurante(Provedor.COMIDASSL);


        restaurante.agregarCliente(new Cliente("Borja"));
        restaurante.agregarCliente(new Cliente("Borja1"));
        restaurante.agregarCliente(new Cliente("Borja2"));
        Bebida bebida = new Bebida("Cocacola",3,300);
        bebida.almacenar();
        Racion racion = new Racion("Cocacola",6,1);
        restaurante.agregarPedido(new Bebida("Cocacola",3,300),"Borja");
        restaurante.agregarPedido(new Comida("Cocacola",6,3000),"Borja1");
        restaurante.agregarPedido(new Racion("Cocacola",6,1),"Borja2");
        // restaurante.pedirCuenta("Borja");
        // restaurante.pedirCuenta("Borja1");
        // restaurante.pedirCuenta("Borja2");
        //restaurante.mostrarClientes();
        // restaurante.mostrarCajaRestaurante();
    }
}
