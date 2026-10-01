import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica nombre y apellidos");
        String nombre = lector.nextLine();
        System.out.println("Indica edad");
        int edad = lector.nextInt();
        System.out.println("N de entrenamientos");
        int entrenos = lector.nextInt();
        System.out.println("Tienes certificado (s/n)");
        String certificado = lector.nextLine();
        System.out.println("Estas en un club (s/n)");
        String club = lector.nextLine();
        lector.close();

        boolean condicion1 = edad>=18 && entrenos >=8 && certificado.equalsIgnoreCase("si");
        boolean condicion2 = edad<18 && club.equalsIgnoreCase("si") && certificado.equalsIgnoreCase("si");
        boolean condifionFinal = condicion1 || condicion2;

        if(condifionFinal){
            System.out.println("Indica en que categoria te apuntas");
            String categoria = lector.nextLine();
            if (categoria.equalsIgnoreCase("profesional") && entrenos<20 && edad<20){
                System.out.println("No te puedes apuntar, te apunto a una inferior");
            } else {
                System.out.println("Participante asignado");
            }
        } else {
            System.out.println("“el participante no cumple con los requisitos");
        }


    }
}
