import java.util.ArrayList;

public class Restaurante {

    private double caja;
    private String NIF;
    private String nombre;
    private ArrayList<Pedido> listaPedidos;

    public Restaurante() {
    }

    public Restaurante(String NIF,String nombre){
        // caja = 0
        listaPedidos = new ArrayList<>();
        this.NIF = NIF;
        this.nombre = nombre;
    }


    public void listarCobrados(){
        for (Pedido item: listaPedidos) {
            if (item.isEstado()){
                System.out.println("Nombre cliente: "+item.getCliente().getNombre());
                System.out.println("DNI cliente: "+item.getCliente().getDni());
                System.out.println("Productos asociados");
                item.listarProductos();
            }
        }
    }
    public void listarPedidos(){
        for (  Pedido item : listaPedidos ) {
            System.out.println("Nombre cliente: "+item.getCliente().getNombre());
            System.out.println("DNI cliente: "+item.getCliente().getDni());
            System.out.println("Productos asociados");
            item.listarProductos();
        }
    }
    public void agregarPedido(Pedido pedido){

        /* meter el pedido en la lista --> listaPedidos.add(pedido)
         siempre y cuando no tenga otro pedido en la lista con el
         mismo dni que el cliente del pedidio que intento add
         --> busca en la lista de pedidos y compara dnis
         (item con el dni del pedido por param)
         */

        if (estaPedido(pedido.getCliente().getDni())){
            System.out.println("No se puede agregar, ya hay una cuenta activa");
        } else {
            listaPedidos.add(pedido);
        }

    }

    public void cobrarPedido(String dni){

        /* buscar el pedido en la lista --> recorro la lista y comparo dni
            - cuando lo encuentro: cobrear el pedido
                - cambiar su estado
                - calcula cuanto valen sus productos
                - añado a la caja lo anterior
        */

        for ( Pedido item : listaPedidos ) {
            if (item.getCliente().getDni().equalsIgnoreCase(dni) && !item.isEstado()){
                item.calcularCuenta();
                caja += item.getCuenta();
                item.setEstado(true);
            }
        }



    }
    private boolean estaPedido(String dni){
        boolean esta = false;
        for ( Pedido item : listaPedidos ) {
            if (item.getCliente().getDni().equalsIgnoreCase(dni)
            && !item.isEstado()){
               // retorno true --> esta en la lista
               return true;
            }
        }
        return esta;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
