import controller.ControllerEj1;
import controller.ControllerEj2;
import controller.ControllerEj3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ControllerEj1 controllerEj1 = new ControllerEj1();
        //controllerEj1.lecturaFichero();
        ControllerEj2 controllerEj2 = new ControllerEj2();
        //controllerEj2.lecturaObjetos();
        ControllerEj3 controllerEj3 = new ControllerEj3();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Que pelicuas quieres ves");
        System.out.println("1 Estrenos");
        System.out.println("2 Proximamente");
        opcion = scanner.nextInt();
        if (opcion==1){
            controllerEj3.leerJSON(1);
        } else if (opcion ==2) {
            controllerEj3.leerJSON(2);
        }


    }
}
