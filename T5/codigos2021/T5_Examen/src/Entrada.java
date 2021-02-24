import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //Ingrediente cebolla = new Ingrediente("cebolla",0.70);
        //cebolla.
        /*
        Pizza pizzaMargarita = new Pizza(1, "Borja");
        pizzaMargarita.agregarIngrediente(new Ingrediente("cebolla", 0.70));
        pizzaMargarita.agregarIngrediente(new Ingrediente("queso", 1));
        pizzaMargarita.agregarIngrediente(new Ingrediente("pollo", 2));

        Pizza pizzaHawaiana = new Pizza(2, "Pedro");
        pizzaHawaiana.agregarIngrediente(new Ingrediente("piña", 2));

        Pizza pizza4Quesos= new Pizza(3, "Luis");
        pizza4Quesos.agregarIngrediente(new Ingrediente("queso", 7));

        //pizzaMargarita.setServida(true);
        //pizzaMargarita.verDatos();

        Pizzeria pizzaHut = new Pizzeria();
        pizzaHut.anadirPedido(pizzaMargarita);
        pizzaHut.servirPedido(1);
        pizzaHut.anadirPedido(pizzaHawaiana);
        pizzaHut.anadirPedido(pizza4Quesos);
        pizzaHut.mostrarPendientes();
        pizzaHut.verEstado(1);*/

        Scanner teclado = new Scanner(System.in);
        Pizzeria pizzeria = new Pizzeria();
        int opcion = 0;
        String nombrePedidio;
        int numeroIngredientes;
        do {

            System.out.println("1-Realizar pedido");
            System.out.println("1-Servir pedido");
            System.out.println("1-Ver pedidos pedientes");
            System.out.println("1-Ver caja");
            System.out.println("Introduce opción: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Dime nombre");
                    nombrePedidio = teclado.next();
                    System.out.println("Dime numero ingredientes");
                    numeroIngredientes = teclado.nextInt();
                    Pizza pizza = new Pizza(1,nombrePedidio);
                    for (int i = 0; i < numeroIngredientes; i++) {
                        String nombre;
                        double costeIngrediente;
                        System.out.println("Dime nombre de ingrediente");
                        nombre = teclado.next();
                        System.out.println("Dime coste ingrediente");
                        costeIngrediente = teclado.nextDouble();
                        Ingrediente ingrediente = new Ingrediente(nombre,costeIngrediente);
                        pizza.agregarIngrediente(ingrediente);
                    }
                    pizzeria.anadirPedido(pizza);

                    break;
                case 2:
                    pizzeria.mostrarPendientes();
                    break;
            }

        }while (opcion!=5);


    }
}
