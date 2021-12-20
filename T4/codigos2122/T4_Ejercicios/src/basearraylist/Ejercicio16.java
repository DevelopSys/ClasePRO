package basearraylist;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Object[]> listaGaraje = new ArrayList();

        do {

            System.out.println("Bienvenido al garaje");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Calcular costes");
            System.out.println("5. Borrar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");

            opcion = lecturaTeclado.nextInt();

            switch (opcion) {
                case 1:
                    if (listaGaraje.size() < 5) {
                        System.out.println("Que marca tiene el coche");
                        String marca = lecturaTeclado.next();
                        System.out.println("Que modelo tiene el coche");
                        String modelo = lecturaTeclado.next();
                        System.out.println("Que matricula tiene el coche");
                        String matricula = lecturaTeclado.next();
                        System.out.println("Que coste tiene el coche");
                        int coste = lecturaTeclado.nextInt();
                        Object[] coche = new Object[]{marca, modelo, matricula, coste};

                        boolean encontrado = false;
                        for ( Object[] item: listaGaraje) {
                            if (item[2].toString().equalsIgnoreCase(matricula)){
                               encontrado = true;
                               break;
                            }
                        }


                        if (!encontrado){
                            listaGaraje.add(coche);
                            System.out.println("Coche recepcionado");
                        } else {
                            System.out.println("No se ha podido añadir");
                        }

                    } else {
                        System.out.println("No hay espacio disponible");
                    }

                    break;

                case 2:

                    if (listaGaraje.size() > 0) {
                        for (Object[] coche : listaGaraje) {
                            System.out.println("Marca: " + coche[0]
                                    + "\tModelo: " + coche[1]
                                    + "\tMatricula: " + coche[2]
                                    + "\tCoste: " + coche[3]);
                        }
                    } else {
                        System.out.println("No hay coches en el garaje");
                    }

                    break;
                case 3:
                    System.out.println("Que matrícula quieres buscar");
                    String matricula = lecturaTeclado.next();
                    boolean encontrado = false;

                    for (Object[] coche : listaGaraje) {

                        if (coche[2].toString().equalsIgnoreCase(matricula)) {
                            encontrado = true;
                            System.out.println("Marca: " + coche[0]
                                    + "\tModelo: " + coche[1]
                                    + "\tMatricula: " + coche[2]
                                    + "\tCoste: " + coche[3]);

                            //break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El coche no está en el garaje");
                    }

                    break;
                case 4:

                    int costeAcumulado = 0;
                    for (Object[] coche : listaGaraje) {
                        costeAcumulado += (int) coche[3];
                    }

                    System.out.println("Tu coste acumulado es de " + costeAcumulado);
                    break;
                case 5:
                    System.out.println("Que matrícula quieres buscar");
                    matricula = lecturaTeclado.next();
                    encontrado = false;

                    for (int i = 0; i < listaGaraje.size(); i++) {
                        if (listaGaraje.get(i)[2].toString().equalsIgnoreCase(matricula)) {

                            encontrado = true;
                            System.out.println("Coche borrado con matricula "+listaGaraje.remove(i)[2]);

                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Coche no encotrado en la lista");
                    }

                    break;
                case 6:
                    listaGaraje.clear();
                    System.out.println("Lista vaciada");
                    break;
            }

            // TODO: me queda por hacer el caso uno

        } while (opcion != 7);

    }

}


