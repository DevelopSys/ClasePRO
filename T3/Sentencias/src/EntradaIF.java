import java.util.Scanner;

public class EntradaIF {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica la nota que has sacado");
        String nombre = "Borja";
        int nota = lector.nextInt();
        if (nota < 0 || nota > 10) {
            String apellido = "Martin";
            System.out.println("La nota que has introducido no es valida");
            System.out.println(apellido);

        } else {
            int edad = 76;
            System.out.println(edad);
            if (nota <= 1) {

                System.out.println("Suspenso muy suspenso");
            } else if (nota < 5) {
                System.out.println("Suspenso justo");
            } else if (nota < 7) {
                System.out.println("Aprobado justo");
            } else if (nota < 9) {
                System.out.println("Notabla");
            } else if (nota < 10) {
                System.out.println("Sobresaliente");
            } else {
                System.out.println("Perfecto");
            }


        }

        // System.out.println(edad);
        lector.close();
    }
}
