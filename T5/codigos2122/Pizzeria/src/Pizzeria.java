import java.util.ArrayList;

public class Pizzeria {

    private int contador =0;
    private ArrayList<Pizza> listaPizzas;
    private double caja;

    public Pizzeria(){
        // caja = 0
        listaPizzas = new ArrayList<>();
    }

    public void agregarPedido(Pizza pizza){

        pizza.setId(contador);
        this.listaPizzas.add(pizza);
        contador++;
    }

    public void servirPizza(int id){
        for ( Pizza pizza : listaPizzas ) {
            if (pizza.getId() == id){
                pizza.setEstado(true);
                pizza.calcularPrecio();
                caja += pizza.getPrecio();
            }
        }
    }

    public void verPedientes(){
        for ( Pizza pizza : listaPizzas ) {
            if (!pizza.isEstado()){
                pizza.verDatos();
            }
        }
    }

    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
