import java.util.Scanner;

public class Lecturas {

    static String valriableGlobal = "asdadas";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = teclado.next();
        System.out.println("Introduce tu apellido");
        String apellido = teclado.next();
        System.out.println("Introduce la edad");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + " " +apellido
                +" tienes "+edad + " años");

        System.out.println(valriableGlobal);
    }

    public void metodoMio(){
        System.out.println(valriableGlobal);

    }

}


