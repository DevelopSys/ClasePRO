package github.excepciones;

import java.io.FileNotFoundException;

public class Entrada {
    public static void main(String[] args)  {
        String palabra = null;
        String[] palabras = new String[]{"uno","dos","tres"};
        try{
            System.out.println(palabra.length());
            int division = 4/0;
            for(int i=0;i<=3;i++){
                System.out.println(palabras[i]);
            }
        } catch (NullPointerException e){
            System.out.println("objeto nulo");
        } catch (ArithmeticException e){
            System.out.println("operación incorrecta");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("recorrido incorrecto");
        }
        finally {
            System.out.println("Siempre ejecutado");
        }
    }
}
