package excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Coche {

    public void metodoUno(){
        File file = null;
        try {
            file = new File("");
            FileWriter fw = new FileWriter(file);
        } catch (IOException e){
            System.out.println("Fichero no encontrado");
        } finally {
            file.
        }


    }

    public void metodoDos(boolean acierto) {
        if (acierto){
            System.out.println("Pasado un true");
        } else {
            try {
                throw new MiExcepcion("Error localizado en saldo");
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }
        }
    }

    public void metodoTres() {

    }

    public void metodoCuatro() {

    }
}
