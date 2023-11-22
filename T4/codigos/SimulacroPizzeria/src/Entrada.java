import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Object[][] listaIngredientes = new Object[][]{
                {"Queso", 1.0}, {"Jamon", 2.0}, {"Aceitunas", 0.5},
                {"Tomate", 0.2}, {"Champiñones", 0.7}
        };

        do {
            System.out.println("1. Añadir pedido");
            System.out.println("2. Servir pedido");
            System.out.println("3. Mostrar pendientes");
            System.out.println("4. Mostrar caja");
            System.out.println("Que quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que nombre es el del pedidio");
                    String nombre = scanner.next();
                    System.out.println("Que telefono es el del pedidio");
                    int telefono = scanner.nextInt();
                    int numeroIngredientes;
                    do {
                        System.out.println("Cuantos ingredientes tiene el pedidio");
                        numeroIngredientes = scanner.nextInt();
                    } while (numeroIngredientes <= 1);

                    for (int i = 0; i < listaIngredientes.length; i++) {
                        System.out.printf("%d %s %.2f\n",(i+1)
                                ,listaIngredientes[i][0], listaIngredientes[i][1]);
                    }
                    Object[][] misIngrendientes= new Object[numeroIngredientes][2];
                    for (int i = 0; i < numeroIngredientes; i++) {
                        System.out.println("Que ingrediente de la lista quieres");
                        int ingrediente= scanner.nextInt();
                        misIngrendientes[i] = listaIngredientes[ingrediente-1];

                    }

                    pizzeria.agregarPedido(nombre,telefono,misIngrendientes);

                    break;

                case 2:

                    System.out.println("Que id quieres servir");
                    int id = scanner.nextInt();
                    pizzeria.servirPedido(id);

                    break;

                case 3:
                    pizzeria.mostrarPedientes();
                case 4:
                    pizzeria.mostrarCaja();
            }

        } while (opcion != 5);


    }
}
