package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Setter
@Getter
@NoArgsConstructor

public class Pedido implements Serializable {

    private ArrayList<Producto> listaProductos;
    private Cliente cliente;
    private boolean estado;
    private int cuenta;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
        System.out.println("Producto agregado correctamente");
        cuenta += producto.getPrecio();
    }

    public void mostrarDatos(){
        System.out.println("El precio del pedido es "+cuenta);
        System.out.println("El dni asociado es "+cliente.getDni());
        System.out.println("El estado es "+estado);
        System.out.println("Todos estos son los productos");
        for ( Producto item: listaProductos) {
            item.mostrarDatos();
        }

    }

    public boolean getEstado(){
        return estado;
    }

}
