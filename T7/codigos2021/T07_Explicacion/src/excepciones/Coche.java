package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Coche {

    int cv = 150;

    public void metodoFallo() throws NullPointerException {
        ArrayList listaPlazas = null;
        System.out.println("Las plazas del coche son " + listaPlazas.size());
        System.out.println("El coche no tiene plazas");
    }

    public void leerMatriculas()  {
        File file = new File("/");
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerNuevaEx(int numero) throws MyException {
        if (numero<10){
           throw new MyException("Número insuficiente");
        }
    }

}
