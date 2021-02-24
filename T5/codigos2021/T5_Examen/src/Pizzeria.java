import java.util.ArrayList;

public final class Pizzeria {

    private ArrayList<Pizza> pedidos;
    private double caja;

    public Pizzeria() {
        this.pedidos = new ArrayList<>();
    }

    public void anadirPedido(Pizza pizza){
        this.pedidos.add(pizza);
    }

    public Pizza existePizza(int id){
        for ( Pizza pizza: pedidos) {
            if (pizza.getId() == id && !pizza.isServida()){
               return pizza;
            }
        }
        System.out.println("La pizza no existe");
        return null;
    }

    public void verEstado(int id){

        if(existePizza(id) !=null){
            existePizza(id).verDatos();
        }
    }

    public void servirPedido(int id){

        //System.out.println(existePizza(id).getNombre());
        Pizza pizza = existePizza(id);
        if(pizza!=null){
            pizza.setServida(true);
            this.caja += pizza.getPrecio();
        }
    }

    public ArrayList<Pizza> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pizza> pedidos) {
        this.pedidos = pedidos;
    }

    public void mostrarPendientes(){
        for ( Pizza pizza : pedidos) {
            if (!pizza.isServida()){
                pizza.verDatos();
            }
        }
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
