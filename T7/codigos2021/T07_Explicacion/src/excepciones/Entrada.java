package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        Coche coche = new Coche();
        try {
            coche.metodoFallo();
        } catch (NullPointerException e){
            System.out.printf("fallo en ejecución");
        }

        
        /*ArrayList lista = null;
        try{
            System.out.println("lista ya está inicializada");
            int elemento = Integer.valueOf("asdasdas");
            System.out.println(elemento);
            System.out.println(lista.size());
        } catch (NumberFormatException e){
            //System.out.println("El objeto de la lista es nulo");
            //System.out.println(e.getMessage());
            //lista = new ArrayList();
            System.out.println("Catch de ÇNumber");
        } catch (Exception e){

        }  finally {
            try {
                System.out.println(lista.size());

            } catch (NullPointerException e){
                lista = new ArrayList();
            }
        }*/
    }
}
