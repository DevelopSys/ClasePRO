package controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.Cliente;
import model.Pedido;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@AllArgsConstructor
public class Restaurante {

    private int numeroPedidos;
    private int caja;
    private HashMap<Integer, Pedido> listaPedidos;

    public Restaurante() {
        listaPedidos = new HashMap();
        // caja =0
        // numeroPeddos =1;
    }

    public void agregarPedido(Pedido pedido) {
        // cuando el cliente que intenta agregar tiene una cuenta y esta pagada
        // cuando el cliente que intenta agregar no tiene una cuenta
        if (estaCliente(pedido.getCliente().getDni()) == null) {
            numeroPedidos++;
            listaPedidos.put(numeroPedidos, pedido);
        }
    }

    private Cliente estaCliente(String dni) {

        for (Pedido pedido : listaPedidos.values()) {
            if (pedido.getCliente().getDni().equals(dni) && !pedido.isPagado()) {
                return pedido.getCliente();
            }
        }
        return null;
    }

    public void pagarPedidio(String dni) {
        for (Pedido pedido : listaPedidos.values()) {
            if (pedido.getCliente().getDni().equals(dni)) {
                pedido.setPagado(true);
            }
        }
    }

    public void mostrarPedidos(){
        for ( Pedido item : listaPedidos.values() ) {
            item.mostrarDatos();
        }

        for (Integer key: listaPedidos.keySet()) {
            Pedido pedido = listaPedidos.get(key);
            pedido.mostrarProductos();
        }
    }
}
