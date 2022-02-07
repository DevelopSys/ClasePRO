import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        ArrayList<Ingrediente> listaIngrendientesMargarita
                = new ArrayList<>();
        listaIngrendientesMargarita.add(new Ingrediente("Jamon",1));
        listaIngrendientesMargarita.add(new Ingrediente("Queso",1.20));
        listaIngrendientesMargarita.add(new Ingrediente("Champiñon",2.20));
        Pizza margarita1 = new Pizza("Borja",listaIngrendientesMargarita);
        Pizza margarita2 = new Pizza("Juan",listaIngrendientesMargarita);
        Pizza margarita3 = new Pizza("Juan",listaIngrendientesMargarita);
        Pizza margarita4 = new Pizza("Juan",listaIngrendientesMargarita);
        Pizza margarita5 = new Pizza("Juan",listaIngrendientesMargarita);
        pizzeria.agregarPedido(margarita1);
        pizzeria.agregarPedido(margarita2);
        pizzeria.agregarPedido(margarita3);
        pizzeria.agregarPedido(margarita4);
        pizzeria.agregarPedido(margarita5);

        pizzeria.servirPizza(1);
        pizzeria.servirPizza(2);
        //pizzeria.servirPizza(1);
        pizzeria.verPedientes();

        System.out.println(pizzeria.getCaja());
    }
}
