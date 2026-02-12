import controller.OperacionesFicheros;

public class Main {

    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        // operacionesFicheros.informacionFichero("src/");
        operacionesFicheros.listarFicheros("src");

    }
}
