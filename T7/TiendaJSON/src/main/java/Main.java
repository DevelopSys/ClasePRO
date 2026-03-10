import controller.APIController;
import controller.Tienda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // APIController controller = new APIController();
        // controller.getAll();
        // controller.getAPI();
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Ver productos");
            System.out.println("2. Buscar producto");
            System.out.println("3. Comprar producto");
            System.out.println("4. terminar compra");
            System.out.println("5. Exportar carrito");
            System.out.println("6. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1->{
                    tienda.mostrarTodos();
                }
                case 2-> {
                    System.out.println("Que producto quieres buscar");
                    int id = scanner.nextInt();
                    tienda.buscarProducto(id);
                }
                case 3-> {
                    System.out.println("Que producto quieres comprar");
                    int id = scanner.nextInt();
                    tienda.addCarrito(id);
                }
                case 4->{
                    tienda.realizarCompra();
                }
                case 5->{
                    tienda.exportarCarrito();
                }
                case 6->{
                    tienda.cerrarTienda();
                    System.out.println("Saliendo de la tienda......1");
                }
            }
        } while (opcion!=6);
    }
}
