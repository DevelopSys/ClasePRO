import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Object[]> calificaciones = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Añadir nota");
            System.out.println("2. Ver asignaturas y notas");
            System.out.println("3. Ver notas");
            System.out.println("4. Ver media");
            System.out.println("5. Ver suspensas");
            System.out.println("6. Aplicar correccion");
            System.out.println("7. Modificar nota");
            System.out.println("8. Ordenar las notas de mas a menos");
            System.out.println("9. Salir");
            System.out.println("Que opcion queres realizar");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Indica el nombre de la asignatura");
                    String asignatura = scanner.next();

                    if (buscarAsignatura(asignatura) != null) {
                        System.out.println("No se pueden meter notas duplicadas");
                    } else {
                        System.out.println("Indica la calificacion");
                        double calificacion = scanner.nextDouble();
                        Object[] notaCompleta = new Object[]{asignatura, calificacion};
                        calificaciones.add(notaCompleta);
                    }
                }
                case 2 -> {
                    verNotasAsignaturas();
                }
                case 3 -> {
                    verNotas();
                }
                case 4 -> {
                    verMedia();
                }
                case 5 -> {
                    verSuspensos();
                }
                case 6 -> {
                    aplicarCorreccion();
                }
                case 7 -> {
                    System.out.println("Que asignatura queres modificar");
                    String nombre = scanner.next();
                    System.out.println("Que nota queres modificar");
                    double nota = scanner.nextDouble();
                    modificarNota(nombre, nota);
                }
                case 8 -> {
                }
                case 9 -> System.out.println("Saliendo.....");
            }
        } while (opcion != 9);

    }

    private static void modificarNota(String nombre, double nota) {
        // que asignatura
        // esta asignatura
            // pedir nota y cambiarla
            // error
        Object[] modificar = buscarAsignatura(nombre);
        if(modificar!=null){
            modificar[1] = nota;
        } else {
            System.out.println("No se encuentra en la lista1");
        }

    }

    private static void aplicarCorreccion() {

        /*for (Object[] item : calificaciones) {
            if ((double) item[1] < 5) {
                item[1] = (double) item[1] + 1;
            }
        }*/

        /*calificaciones.forEach(item->{
            if((double)item[1]<5){
                item[1] = (double)item[1]+1;
            }
        });*/

        calificaciones = (ArrayList<Object[]>) calificaciones.stream().map(item -> {
            if ((double) item[1] < 5) {
                item[1] = (double) item[1] + 1;
            }
            return item;
        }).toList();

    }

    private static void verSuspensos() {
        /*for (Object[] item : calificaciones) {
            if ((double) item[1] < 5) {
                System.out.println("Suspenso");
                System.out.printf("Asignatura: %s Nota: %.1f\n",
                        item[0].toString(), (double) item[1]);
            }
        }*/
        /*for (int i = 0; i < calificaciones.size(); i++) {
            Object[] item = calificaciones.get(i);
            if ((double) item[1] < 5) {
                System.out.println("Suspenso");
                System.out.printf("Asignatura: %s Nota: %.1f\n",
                        item[0].toString(), (double) item[1]);
            }
        }*/
        calificaciones.stream().
                filter(item -> (double) item[1] < 5)
                .forEach(item -> System.out.printf("Asignatura: %s Nota: %.1f\n",
                        item[0].toString(), (double) item[1]));
    }

    public static Object[] buscarAsignatura(String nombre) {
        for (Object[] item : calificaciones) {
            if (item[0].toString().equalsIgnoreCase(nombre)) {
                return item;
            }
        }
        return null;
    }

    public static void verNotasAsignaturas() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay nada que mostrar");
        } else {
            /*for (Object[] item : calificaciones) {
                System.out.printf("Asignatura: %s Nota: %.1f\n",
                        item[0].toString(), (double) item[1]);
            }*/
            calificaciones.forEach(item -> System.out.printf("Asignatura: %s Nota: %.1f\n",
                    item[0].toString(), (double) item[1]));
        }
    }

    public static void verNotas() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay nada que mostrar");
        } else {
            /*for (Object[] item : calificaciones) {
                System.out.printf("Asignatura: %s Nota: %.1f\n",
                        item[0].toString(), (double) item[1]);
            }*/
            calificaciones.forEach(item -> System.out.printf("Nota: %.1f\n",
                    (double) item[1]));
        }
    }

    public static void verMedia() {
        double sumatorio = 0;
        for (Object[] item : calificaciones) {
            sumatorio += (double) item[1];
        }
        System.out.println("La media es " + sumatorio / calificaciones.size());

        /*calificaciones.stream()
                .map(item->(double)item[1])
                .mapToDouble(value -> value).average();

        calificaciones.stream()
                .mapToDouble(item->(double)item[1]).average().getAsDouble();*/
    }


}
