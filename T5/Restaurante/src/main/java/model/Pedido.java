package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Pedido {

    private Cliente cliente;
    private int cuenta;
    private ArrayList<Producto> listaProductos;
    private boolean pagado;


    public Pedido() {
        this.listaProductos = new ArrayList<>();
    }

    public Pedido(Cliente cliente) {
        // cuenta = 0;
        // pagado = false;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
    }

    // agregarProducto
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
        cuenta += producto.getPrecio();
    }

    // mostrarProductos
    public void mostrarProductos(){
        if (listaProductos.isEmpty()){
            System.out.println("La lista de productos esta vacia");
        } else {
            for (Producto item: listaProductos) {
                item.mostrarDatos();
            }
        }
    }

    public void mostrarDatos(){
        System.out.println("Los datos del pedidio son");
        System.out.println("cliente = " + cliente.getNombre());
        System.out.println("cliente = " + cliente.getDni());
        System.out.println("cuenta = " + cuenta);
        System.out.println("pagado = " + pagado);;
        mostrarProductos();
    }
}
