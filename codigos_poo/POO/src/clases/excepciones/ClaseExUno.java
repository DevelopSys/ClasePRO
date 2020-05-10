package clases.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClaseExUno {

    public int realizarDivision(int op1,int op2){
        int division;
        try{
            division = op1/op2;
        } catch (ArithmeticException e){
            division =0;
        }
        return division;
    }

    public void leerFichero(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            fileReader = null;
            fileReader.read();
        } catch (IOException e) {
            System.out.println("fichero no encontrado");
        } catch (RuntimeException e){
            System.out.println("Algo es nulo");
        }
    }

    public void lanzarMiExcep(int numero) throws Exception {
        if (numero<0){
            throw new Exception("Excepcion lanzada por el programador");
        }
        System.out.println(numero);
    }

    public void lanzarMiExcepPerso(int numero) throws MiExcepcion {
        if (numero<0){
            throw new MiExcepcion("Excepcion lanzada por el programador");
        }
        System.out.println(numero);
    }


}
