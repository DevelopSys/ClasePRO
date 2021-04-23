package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {


        Coche coche = new Coche();
        // CV = 150
        try {
            coche.leerNuevaEx(3);
        } catch (MyException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            coche.cv = e.actuarAnteMiExcepcion(coche.cv);

        } finally {

        }

        try
        {
            coche.leerNuevaEx(8);
        }catch (MyException e){
            coche.cv = e.actuarAnteMiExcepcion(coche.cv);
        } finally {
            System.out.println("Los CV del coche son "+coche.cv);
        }

        /*Coche coche = new Coche();
        try {
            coche.leerMatriculas();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("asdasd");*/



        /*int numeroUno=5;
        int numeroDos=1;
        ArrayList lista = new ArrayList();
        ArrayList listaDos = new ArrayList();
        listaDos.add(2);
        System.out.println("Entrado en el posible error");
        try {
            System.out.println(lista.size());
            System.out.println("siguiente linea a la impresion del error");
            System.out.println(numeroUno/numeroDos);
            System.out.println(listaDos.get(0));
            int numero = Integer.valueOf("asdasd");

        }
        catch (ArithmeticException e){
            System.out.println("No puedo dividir entre cero");
            System.out.println(e.getMessage());
            //e.getStackTrace()
        } catch (NullPointerException e){
            // entra cuando hay un fallo de cualquier tipo (EXCEPTION)
            System.out.println("La lista es nula");
        } catch (IndexOutOfBoundsException e){
            System.out.println("el acceso a la posicion no es posible");
        }
        catch (Exception e){
            System.out.println("Detectado algun fallo");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Linea que siempre se ejecutará");
        }

        System.out.println("Fin del programa");*/

        /*Coche coche = new Coche();
        try {
            coche.metodoFallo();
        } catch (NullPointerException e){
            System.out.printf("fallo en ejecución");
        }*/

        
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
