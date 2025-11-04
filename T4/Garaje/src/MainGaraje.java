import controller.Garaje;

import java.util.Scanner;

public class MainGaraje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // listaCoches=new Object[5][6] acumulado=0.0
        Garaje garaje = new Garaje();

        int opcion;
        do {

            System.out.println("Menu para gestionar coches");
            System.out.println("1- Agregar coche al garaje");
            System.out.println("2- Listar coches del garaje");
            System.out.println("3- Buscar coche");
            System.out.println("4- Arreglar coche");
            System.out.println("5- Ver caja");
            System.out.println("Que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("PROCEDEMOS A AGREGAR COCHE");
                    System.out.println("Dime la matricula del coche");
                    String matricula = scanner.next();
                    System.out.println("Dime la marca del coche");
                    String marca = scanner.next();
                    System.out.println("Dime el modelo");
                    String modelo = scanner.next();
                    System.out.println("Dime los CV");
                    int cv = scanner.nextInt();
                    System.out.println("Dime el tipo de averia");
                    String averia = scanner.next();
                    garaje.admitirCoche(matricula, marca, modelo, cv, averia);
                }
                case 2 -> {
                    garaje.listarCoches();
                }
                case 3 -> {
                    System.out.println("Dime la matricula que quieres buscar");
                    String matricula = scanner.next();
                    garaje.obtenerInformacion(matricula);
                }
                case 4->{
                    System.out.println("Que coche quieres arreglar");
                    String matricula = scanner.next();
                    garaje.areglarCoche(matricula);
                }
            }
        } while (opcion != 4);


    }
}
