import controller.Restaurante;
import model.Cliente;
import model.Pedido;
import model.Producto;

public class Entrada {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante("Nombre","1234A");
        Cliente cliente1 = new Cliente("Borja1","123A");
        Cliente cliente2 = new Cliente("Borja2","234A");
        Cliente cliente3 = new Cliente("Borja3","345A");

        Producto producto1 = new Producto("Bebida",1);
        Producto producto2 = new Producto("Comida",2);

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(producto1);
        Pedido pedido2 = new Pedido(cliente2);
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        Pedido pedido3 = new Pedido(cliente3);
        pedido1.agregarProducto(producto2);
        Pedido pedido4 = new Pedido(cliente3);
        pedido1.agregarProducto(producto1);
        Pedido pedido5 = new Pedido(cliente2);
        pedido1.agregarProducto(producto1);

        restaurante.anadirPedido(pedido1);
        restaurante.anadirPedido(pedido2);
        restaurante.anadirPedido(pedido3);

        restaurante.cobrarPedido("123A");
        restaurante.cobrarPedido("234A");

        restaurante.listarPedidos();

        restaurante.listarPedidosCobrados();

        restaurante.anadirPedido(pedido4);

        restaurante.anadirPedido(pedido5);

        System.out.println("La caja del restaurante es "+restaurante.getCaja());


    }
}
