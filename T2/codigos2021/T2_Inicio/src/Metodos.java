import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {

        //primerMetodo();
        //segundoMetodo();
        //Scanner teclado = new Scanner(System.in);
        //String palabra = new String("asdasda");
        //new Metodos().segundoMetodo();
        //new Metodos().primerMetodo();
        //int suma = new Metodos().tercerMetodo() + 8;
        System.out.println("Metodos");
        new Metodos().primerMetodo();
        System.out.println("Otra llamada a método");
        new Metodos().segundoMetodo();

    }

    public void primerMetodo(){
        System.out.println("Ejecución desde metodo Uno");
    }

    public void segundoMetodo(){
        System.out.println("Ejecución desde metodo Dos");
    }

    public int tercerMetodo(){
        System.out.println("ejecutado metodo tres");
        //System.out.println(suma);
        return 10;
    }

    public boolean cuartoMetodo(){
        System.out.println("ejecutado metodo tres");
        //System.out.println(suma);
        return true;
    }



}
