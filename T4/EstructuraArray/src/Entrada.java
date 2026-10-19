public class Entrada {
    public static void main(String[] args) {

        String[] palabras = new String[5];
        // [null , null , null , null , null]
        String[] nombres = new String[]{"Maria", "Marta", "Juan", "Borja"};
        // [ Maria, Marta, Juan, Lucas ]
        // tamaño
        System.out.println("El numero de elementos del arary es " + nombres.length);
        System.out.println("El elemento en la posicion 1 es " + nombres[1]);
        // cambiar - asociar
        nombres[0] = "Lucas";
        // [ Lucas, Marta, Juan, Lucas ]
        nombres[1] = "Celia";
        // [ Lucas, Celia, Juan, Lucas ]

        // sacar todos los nombres
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            System.out.println(nombre);
        }

        /*
        para leer / analizar los elementos y modificarlos
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            if (nombre.length() >= 5) {
                System.out.printf("En nombre en posicion %d es %s\n", i + 1, nombre);
            }
        }*/

        /*
        // solo para leer / analizar los elementos
        for( String item : nombres ){
            System.out.println(item);
        }*/

    }
}
