public class Entrada {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("1234A","Restaurante CES JP");
        Cliente cliente1 = new Cliente("Borja","Martin","1234A");
        Cliente cliente2 = new Cliente("Juan","Gomez","2345A");
        Cliente cliente3 = new Cliente("Pedro","Herrera","3456A");
        Pedido pedido1 = new Pedido(cliente1);
        Pedido pedido2 = new Pedido(cliente2);
        Pedido pedido3 = new Pedido(cliente3);

        // creo productos
        Producto cocacola = new Producto("Cocacola",2);
        Producto cerveza = new Producto("Cerveza",1);


        // añado productos a pedidos
        pedido1.agregarProducto(cocacola);
        pedido1.agregarProducto(cerveza);
        pedido1.agregarProducto(new Producto("Bocadillo",3));

        pedido2.agregarProducto(cerveza);
        pedido2.agregarProducto(new Producto("Bocadillo",3));

        pedido3.agregarProducto(cerveza);
        pedido3.agregarProducto(cocacola);

        // añado pedidos a restaurante
        restaurante.agregarPedido(pedido1);
        restaurante.agregarPedido(pedido2);
        restaurante.agregarPedido(pedido3);

        // cobro pedidos
        restaurante.cobrarPedido("1234A");
        restaurante.cobrarPedido("2345A");

        // listar pedidos
        restaurante.listarPedidos();

        // listo los pedidos cobrados
        System.out.println("Cobrados:");
        restaurante.listarCobrados();



        Pedido pedido4 = new Pedido(cliente3);
        Pedido pedido5 = new Pedido(cliente1);

        restaurante.agregarPedido(pedido4);
        restaurante.agregarPedido(pedido5);

        System.out.println("Lo ganado por el restaurante es: "+restaurante.getCaja());


    }
}
