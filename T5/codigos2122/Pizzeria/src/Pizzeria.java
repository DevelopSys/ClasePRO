import java.util.ArrayList;

public class Pizzeria {

    private ArrayList<Pizza> listaPizzas;
    private double caja;

    public Pizzeria(){
        // caja = 0
        listaPizzas = new ArrayList<>();
    }

    public void agregarPedido(Pizza pizza){
        this.listaPizzas.add(pizza);
    }
}
