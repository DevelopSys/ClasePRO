import java.io.IOException;

public class EntradaFicheros {

    public static void main(String[] args) {
        OperacionesFicheros operaciones = new OperacionesFicheros();
        //operaciones.iniciarFicheros();
        //operaciones.leerDirectorio();

        try {
            operaciones.crearCarpeta();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
