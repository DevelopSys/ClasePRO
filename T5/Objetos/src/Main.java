import model.Vehiculo;

import java.lang.invoke.ConstantCallSite;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Vehiculo coche = null;
        int opcion = 0;
        // Menu donde se pida
        // 1. Crear coche -> la marca, modelo, tipo,cc, cv
        // 2. Mostrar los datos del coche
        // 3. Reprogramar cv. pide un numero que se le sumara a los cv actuales
        // 4. Contratar accesorio. Me pide el nombre del accesorio y lo añade
        // 5. Eliminar coche

        do {
            System.out.println("1 Crear coche");
            System.out.println("2 Mostrar coche");
            System.out.println("3 Reprogramar coche");
            System.out.println("4 Contratar accesorio coche");
            System.out.println("5 Eliminar coche");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Dime la marca");
                    String marca = scanner.next();
                    System.out.println("Dime la modelo");
                    String modelo = scanner.next();
                    System.out.println("Dime el tipo");
                    String tipo = scanner.next();
                    System.out.println("Indica cuantos CV");
                    int cv = scanner.nextInt();
                    System.out.println("Indica cuantos CC");
                    int cc = scanner.nextInt();
                    coche = new Vehiculo(marca, modelo, tipo, cc, cv);
                }
                case 2 -> {
                    if (coche != null) {
                        coche.mostrarDatos();
                    } else {
                        System.out.println("Por favor crea un coche primero");
                    }
                }
                case 3 -> {
                    if (coche != null) {
                        System.out.println("Cuantos cv quieres subir");
                        int cv = scanner.nextInt();
                        coche.setCv(coche.getCv()+cv);
                    } else {
                        System.out.println("Por favor crea un coche primero");
                    }
                }
                case 4 -> {
                    if (coche!=null){
                        System.out.println("Dime el nombre del accesorio");
                        String accesorio =scanner.next();
                        coche.getListaAccesorios().add(accesorio);
                    } else {
                        System.out.println("No puedes agregar, no existe coche");
                    }
                }
                case 5 -> {
                    coche = null;
                }

            }
        } while (opcion != 6);


    }
}
