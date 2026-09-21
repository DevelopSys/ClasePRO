import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {
        // tipo nombre = valor
        
        Scanner lector = new Scanner(System.in); // Scanner
        System.out.println("Por favor introduce tu nombre");
        String nombre = lector.next();
        System.out.println("Por favor introduce tu 1er apellido");
        String apellido1 = lector.next();
        System.out.println("Por favor introduce tu 2o apellido");
        String apellido2 = lector.next();
        System.out.println("Por favor introduce la edad");
        int edad = lector.nextInt();
        System.out.println("Por favor introduce la altura");
        double altura = lector.nextDouble();

        // System.out.println("Me llamo " + nombre);
        System.out.printf("Me llamo %s y mis apellidos on %s %s, tengo %d años con una alusta de %.2f\n"
                ,nombre, apellido1,apellido2, edad, altura );

    }

}
