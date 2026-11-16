import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Temperaturas {
    // realiza un gestor de temperaturas.
    // Para ello el sistema mediante un menú permitirá:
    /*
    1 - introducir una temperatura. add
    2 - mostrar las temperaturas: mostrar todas las temperaturas de la lista. get
    3 - ordenar las temperaturas: ordenar de mas a menos. sort *******
    4 - Buscar coincidentes: el sistema pide un numero, muestra el nº de coincidencias. foreach + if
    5 - mostrar max / min: sort + getLast + getFirst
    6 - mostrar media: foreach + acumulador + / size
    7 - limpiar datos (eliminar negativos):  for + if + remove
    8 - salir
    todo se realiza con metodos + variables de clase
     */

    public static ArrayList<Double> temperaturas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {

            System.out.println("1. Añadir");
            System.out.println("2. Mostrar");
            System.out.println("3. Ordenar");
            System.out.println("4. Buscar");
            System.out.println("5. Extremos");
            System.out.println("6. Media");
            System.out.println("7. Limpiar");
            System.out.println("8. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica la temperatura a registrar");
                    double temperatura = scanner.nextDouble();
                    anadirTemperatura(temperatura);
                }
                case 2 -> {
                    temperaturas.forEach(item -> System.out.println(item));
                }
                case 3 -> {
                    /*temperaturas.sort(new Comparator<Double>() {
                        @Override
                        public int compare(Double o1, Double o2) {
                            if (o1 < o2)
                                return 1;
                            return -1;
                        }
                    });*/
                    Collections.sort(temperaturas);
                    // Collections.reverse(temperaturas);
                }
                case 4 -> {
                    System.out.println("Indica la temperatura a buscar");
                    double temp = scanner.nextDouble();
                    bucarTemperatura(temp);
                }
                case 5 -> {
                    extremos();
                }
                case 6 -> {
                    calcularMedia();
                }
                case 7 -> {
                    /*for (int i = 0; i < temperaturas.size(); i++) {
                        if(temperaturas.get(i)<0){
                            temperaturas.remove(i);
                        }
                    }

                    for (Double item: temperaturas) {
                        if (item<0){
                            temperaturas.remove(item);
                        }
                    }*/

                    // temperaturas.removeIf(aDouble -> aDouble<0);
                    temperaturas = (ArrayList<Double>) temperaturas.stream().filter(item -> item >= 0).toList();


                }
                case 8 -> System.out.println("Saliendo");
                default -> System.out.println("No contemplado");
            }
        } while (opcion != 9);
        System.out.println("1");
    }

    private static void calcularMedia() {
        double sumatorio = 0;
        /*for (Double item: temperaturas) {
            sumatorio+=item;
        }
        System.out.println("La media es de "+sumatorio/temperaturas.size());*/
        System.out.println("La media es de " +
                temperaturas.stream().mapToDouble(value -> value).average());
    }

    public static void extremos() {
        Collections.sort(temperaturas);
        System.out.println("El max es " + temperaturas.getFirst());
        System.out.println("El min es " + temperaturas.getLast());
    }

    public static void anadirTemperatura(double temp) {
        // scanner
        temperaturas.add(temp);
        System.out.println("Temperatura registrada correctamente");
    }

    public static void bucarTemperatura(double temp) {
        int veces = 0;
        /*for (double item : temperaturas) {
            /*if (item == temp){
                veces++;
            }
            veces = item == temp ? veces + 1 : veces;
        }
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) == temp) {
                veces = temperaturas.get(i) == temp ? veces + 1 : veces;
            }
        }*/
        veces = (int) temperaturas.stream().filter((item) -> item == temp).count();
        System.out.println("El numero de veces que aparece la temp es de " + veces);
    }

}
