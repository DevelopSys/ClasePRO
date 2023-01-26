import java.util.ArrayList;

public class Pedido {

    private boolean estado; // estado -> false (no cobrado) estado -> true (cobrado)
    private Cliente cliente;
    private  double cuenta;
    private ArrayList<Producto> listaProductos;

    public Pedido() {
    }

    public Pedido(Cliente cliente){
        // estado = false
        // cuenta = 0.0
        listaProductos = new ArrayList<>();
        this.cliente = cliente;
    }


    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
        //this.cuenta+= producto.getPrecio();
    }

    public void listarProductos(){

        if (listaProductos.isEmpty()){
            System.out.println("No hay productos que listar, no has pedido cosas aún");
        } else {
            for ( Producto item : this.listaProductos ) {
                item.mostrarDatos();
            }
        }
    }

    public void calcularCuenta(){
        // captura el precio de cada producto y lo suma en cuenta
        for ( Producto item: listaProductos ) {
            this.cuenta += item.getPrecio();
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
