package controller;

import model.Cliente;

import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Cliente> listaClientes;
    private double caja;

    public Restaurante() {
        listaClientes = new ArrayList<>();
    }

    // admitir clientes. Tan solo se podrá admitir un cliente
    // si no existe uno con ese nombre
    public void agregarCliente(Cliente cliente){
        // no pido los datos aqui!!!, esto lo hace la ENTRADA - UI->l controlador es la LOGICA
        // metera al cliente dentro de la lista
        if (estaCliente(cliente.getNombre())!=null){
            System.out.println("Ya esta en el resutaurante");
        } else {
            listaClientes.add(cliente);
            System.out.println("Bienvenido al resultaurante");
        }
    }

    // obtener informacion de todos los clientes que estan en el resustaurante
    // en el caso de tener un cliente sin consumiciones, deberá aparecer el mensaje
    // aun no ha pedido
    public void mostrarClientes(){
        for (Cliente cliente: listaClientes) {
            cliente.mostrarDatos();
        }
    }

    // un cliente puede pedir una una consumicion
    // si en la lista de consumiciones del cliente, ya existe ese producto
    // preguntar si realmente quiere pedirlo. En el caso de decir que si
    // preguntar si quiere agregar mas de uno, e indicar el numero concreto
    private Cliente estaCliente(String nombre){
        for ( Cliente cliente : listaClientes ) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)){
                return cliente;
            }
        }
        return null;
    }


}
