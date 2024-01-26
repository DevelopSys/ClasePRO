package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Restaurante implements Serializable {

    private double caja;
    private String nombre, nif;
    private ArrayList<Pedido> listaPedidos;

    public Restaurante(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
        listaPedidos = new ArrayList<>();
    }

    public void listarPedidos() {
        for (Pedido item : listaPedidos) {
            item.mostrarDatos();
        }
    }

    public void listarPedidosCobrados() {
        for (Pedido item : listaPedidos) {
            if (item.getEstado()){
                item.mostrarDatos();
            }
        }
    }

    public void cobrarPedido(String dni) {
        Pedido pedidoCobrar = buscarPedido(dni);
        if (pedidoCobrar != null) {
            if (!pedidoCobrar.getEstado()){
                caja += pedidoCobrar.getCuenta();
                pedidoCobrar.setEstado(true);
            } else {
                System.out.println("El pedido ya esta cobrado");
            }

        } else {
            System.out.println("Este cliente no tiene pedido en el restaurante");
        }
    }

    private Pedido buscarPedido(String dni) {

        for (Pedido item : listaPedidos) {
            if (item.getCliente().getDni().equalsIgnoreCase(dni)) {
                return item;
            }
        }

        return null;
    }



    public void anadirPedido(Pedido pedido){
        Pedido pedidoEncontrado = buscarPedido(pedido.getCliente().getDni());
        if (pedidoEncontrado == null || pedidoEncontrado.getEstado() ){
            listaPedidos.add(pedido);
            System.out.println("Añadido correctemente");
        } else {
            System.out.println("El pedido no se puede agregar");
        }
    }
}
