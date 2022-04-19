public class Entrada {

    public static void main(String[] args) {
        // si no pongo nada es T --> OBJECT
        Restaurante restaurante = new Restaurante();
        Restaurante<Restaurante.PedidoComida> restauranteComida = new Restaurante();
        Restaurante<Restaurante.PedidoBebida> restauranteBebida = new Restaurante();
        Restaurante<Pedido> restauranteTodo = new Restaurante();


        Restaurante.PedidoBebida pedidoBebida = restaurante.new PedidoBebida(5,3,Bebidas.Copas);
        Restaurante.PedidoComida pedidoComida = restaurante.new PedidoComida(10,1,Comidas.Menu);

        restauranteComida.registrarPedido(pedidoComida);
        restauranteBebida.registrarPedido(pedidoBebida);

        restauranteTodo.registrarPedido(pedidoBebida);
        restauranteTodo.registrarPedido(pedidoComida);

    }
}
