import controller.APIController;
import model.Product;

import java.util.Scanner;

public class Main {
Scanner scanner;
    public static void main(String[] args) {
        APIController controller = new APIController();
        Scanner scanner = new Scanner(System.in);


        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controller.listarProductos();
                    break;
                case 2:
                    System.out.println("Pon el id del producto");
                    int id = scanner.nextInt();
                    controller.añadirACaja(id);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\n👋 ¡Gracias por usar nuestra tienda! Adiós.\n");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intenta de nuevo.\n");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("🛍️  TIENDA DE PRODUCTOS - MENÚ PRINCIPAL");
        System.out.println("=".repeat(60));
        System.out.println("1. 📋 Listar todos los productos");
        System.out.println("2. 🛒 Añadir producto al carrito");
        System.out.println("3. 👀 Ver mi carrito");
        System.out.println("4. 💳 Procesar compra");
        System.out.println("5. ❌ Salir");
        System.out.println("=".repeat(60));
        System.out.print("Selecciona una opción (1-5): ");
    }

}

