import model.Cliente;
import model.Pedido;
import model.Producto;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("1234A","Borja");
        Producto producto1 = new Producto("Bebida",3);
        Producto producto2 = new Producto("Comida",5);
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.mostrarProductos();
        // System.out.println(producto);
    }
}
