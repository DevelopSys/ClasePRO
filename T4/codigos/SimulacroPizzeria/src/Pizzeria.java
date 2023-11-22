import java.util.ArrayList;

public class Pizzeria {

    private ArrayList<Object[]> listaPedidos;
    private double caja;
    private int numeroPedidos;


    public Pizzeria(){
        listaPedidos = new ArrayList<>();
        numeroPedidos=0;
        caja=0.0;
    }


    public void agregarPedido(String nombre, int telefono, Object[][] ingredientes){

        double coste = 0.0;
        for (Object[] item : ingredientes) {
            coste += (double) item[1];
        }
        listaPedidos.add(new Object[]{numeroPedidos++,nombre,telefono,ingredientes,
                coste,false});
        System.out.println("Pedido agregado correctamente");
    }

    public void mostrarPedientes(){

        for (Object[] item : listaPedidos) {
            if(!(boolean)item[5]){
                System.out.println("Pedido a nombre de "+item[1]);
                System.out.println("Sus ingredientes son:");
                for ( Object[]ingrediente : (Object[][]) item[3]) {
                    System.out.printf("Nombre: %s precio: %.2f\n",ingrediente[0],ingrediente[1]);
                }
            }
        }
    }

    public void mostrarCaja(){
        System.out.println("El dinero en la caja es "+caja);
    }
    public void servirPedido(int id){

        Object[] item = buscarPedido(id);
        if (item !=null && !(boolean)item[5]){
            item[5] = true;
            caja+= (double)item[4];
        }
    }
    private Object[] buscarPedido(int id){

        for ( Object[] item : listaPedidos ) {
            if (id == (int)item[0]){
                return item;
            }
        }
        System.out.println("El id no se encuentra en la lista de pedidos");
        return null;

    }


}
