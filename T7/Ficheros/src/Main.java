import controller.OperacionesFicheros;

public class Main {

    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        // operacionesFicheros.informacionFichero("src/");
        //operacionesFicheros.listarFicheros("src");
        // operacionesFicheros.crearFichero("src/resources/fichero1.txt");
        // operacionesFicheros.crearCarpeta("src/resources/pruebas/datos");
        // operacionesFicheros.crearCarpeta("src/resources/pruebas/analisis");
        // operacionesFicheros.leerFichero("src/resources/lectura.txt");
        operacionesFicheros.leerFicheroLineas("src/resources/lectura.txt");
    }
}
