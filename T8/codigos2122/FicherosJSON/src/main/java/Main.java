import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ciclo;
        int curso;

        /*System.out.println("Que ciclo quieres mirar");
        ciclo = scanner.next();
        System.out.println("Que curso quieres mirar");
        curso = scanner.nextInt();
        */


        JSONController controller = new JSONController();
        //controller.leerFicheroJSON();
        //controller.leerJSONAsignturas(ciclo,curso);
        //controller.lecturaJSONAPI(100, "male");
        controller.lectruaUsars();

    }
}
