import java.util.ArrayList;
import java.util.Scanner;

public class EntradaCoches {

    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Object[]> coches;

    public static void main(String[] args) {

        int opcion = 0;

        coches = new ArrayList();
        do {
            System.out.println("1- Agregar");
            System.out.println("2- Listar");
            System.out.println("3- Buscar");
            System.out.println("4- Eliminar");
            System.out.println("5- Costes");
            System.out.println("6- Vaciar");
            System.out.println("7- Salir");
            System.out.println("Introduce opción");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    agregarCoche();
                    break;
                case 2:
                    listarCoches();
                    break;
                case 3:
                    System.out.println("Qué matricula quieres buscar");
                    String matriculaBuscar = teclado.next();
                    buscarCoche(matriculaBuscar);
                    break;
                case 4:
                    System.out.println("Qué matricula quieres borrar");
                    String matriculaBorrar = teclado.next();
                    borrarCoche(matriculaBorrar);
                    break;
                case 5:
                    System.out.printf("El coste acumulado es: %.2f %n",calcularCostes());
                    System.out.printf("El coste medio es: %.2f %n",calcularCostes()/coches.size());

                    // imprimir coste
                    break;
                case 6:
                    if (coches.isEmpty()) {
                        System.out.println("La lista está vacía");
                    }else {
                        coches.clear();
                        System.out.println("Lista borrada");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Introduce opción valida");
                    break;
            }

        } while (opcion != 7);

    }

    public static double calcularCostes(){

        double costes=0.0;

        for (Object[] elemento:coches) {
            double costeIndividual = (double) elemento[2];
            costes+=costeIndividual;
        }

        return costes;
    }

    public static void borrarCoche(String matriculaBorrar) {
        Object[] borrado=null;
        for (int i = 0; i < coches.size(); i++) {

            Object[] elemento = coches.get(i);
            if (elemento[3].equals(matriculaBorrar)) {
                borrado = coches.remove(i);
                break;
            }
        }

        if (borrado!=null){
            System.out.println("Coche borrado correctamente");
        } else {
            System.out.println("Coche no encontrado");
        }

        // System.out.println("coche no encontrado");

    }

    public static void listarCoches() {
        if (!coches.isEmpty()){
            for (Object[] elemento : coches) {
                for (Object item : elemento) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("la lista está vacia");
        }

    }

    public static void agregarCoche() {


        System.out.println("intro modelo");
        String modelo = teclado.next();
        System.out.println("intro cv");
        int cv = teclado.nextInt();
        System.out.println("intro coste");
        double coste = teclado.nextDouble();
        System.out.println("intro matricula");
        String matricula = teclado.next();
        Object[] unCoche = {modelo, cv, coste, matricula};
        //coches.add(unCoche);

        boolean existe = false;
        int encontrados = 0;

        for (Object[] elemento : coches) {
            if (elemento[3].equals(matricula)) {
                // modifico valor de exite
                encontrados++;
                //existe = true;
                break;
            }
        }
        // hay alguno?
        if (encontrados > 0) {
            System.out.println("el coche ya existe, no puedo");
        } else {
            coches.add(unCoche);
        }
    }

    public static void buscarCoche(String matricula) {

        for (Object[] elemento : coches) {
            if (elemento[3].equals(matricula)) {
                for (Object item : elemento) {
                    System.out.print(item + " ");
                }
                System.out.println();
                break;
            }

        }

    }
}
