package ejercicio2;

import ejercicio2.controller.APIController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        APIController apiController = new APIController();
        Scanner scanner = new Scanner(System.in);
        int opcion =-1;

        do {
            System.out.println("1. Ver libros");
            System.out.println("2. Ver libro");
            System.out.println("3. Add fav");
            System.out.println("4. Imprortar fav");
            System.out.println("5. Exportar fav");
            System.out.println("6. Ver paginas max");
            System.out.println("7. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    apiController.getAllLibros();
                }case 2 ->{
                    System.out.println("Que libro quieres consultar");
                    int id = scanner.nextInt();
                    apiController.getLibroById(id);
                }case 3 ->{
                    System.out.println("Que libro quieres añadir a fav");
                    int id = scanner.nextInt();
                    apiController.getLibroByIdFav(id);
                }case 5 ->{
                    apiController.exportarFavs();
                }case 4 ->{
                    apiController.importarFavs();
                }case 6 ->{
                    apiController.getMaxPage();
                }
            }
        }while (opcion!=7);
    }
}
