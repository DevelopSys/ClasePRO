import controller.Gestor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));
        Gestor gestor = new Gestor();
        int opcion;
        try {


            do {

                System.out.println("1- Codificar");
                System.out.println("2- Decodificar");
                System.out.println("3- BIN ASCII to Text");
                System.out.println("4- Text to BIN ASCII");
                System.out.println("4- Salir");
                System.out.println("Indica la opcion");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Indica cual es el mensaje a codificar");
                        String mensaje = bufferedReader.readLine();
                        System.out.println("Indica la fase de cifrado");
                        int fase = scanner.nextInt();
                        gestor.codificar(mensaje, fase);
                    }
                    case 2 -> {
                        System.out.println("Indica cual es la fase de descifrado");
                        int fase = scanner.nextInt();
                        gestor.decodificar(fase);
                    }
                    case 3 -> {
                        gestor.desencritpar();
                    }
                    case 4 -> {
                        System.out.println("Indica cual es el mensaje a codificar");
                        String mensaje = bufferedReader.readLine();
                        gestor.encritar(mensaje);
                    }
                }
            } while (opcion != 5);
        } catch (Exception e) {
            System.out.println("Error en el flujo");
        }
    }
}
