import java.util.Scanner;

public class Ejercicio7 {


    /*
    Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado
    (de no ser positivo, se establecerá a 100) y se mostrará el resumen de los lanzamientos.
    Se mostraán cuantas veces ha salido cada número. (Dado)
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica cuantas veces vas a lanzar el dado");
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        int veces = lector.nextInt();
        if (veces <= 0) {
            veces = 100;
        }

        // veces = veces <= 0 ? 100 : veces;
        // 40
        lector.close();
        for (int i = 0; i < veces; i++) {
            int numero = (int) (Math.random() * 6) + 1;
            n1 = numero == 1 ? n1+=1 : n1;
            n2 = numero == 2 ? n2+=1 : n2;
            n3 = numero == 3 ? n3+=1 : n3;
            n4 = numero == 4 ? n4+=1 : n4;
            n5 = numero == 5 ? n5+=1 : n5;
            n6 = numero == 6 ? n6+=1 : n6;
        }

        System.out.println("EL numero de veces que ha salidao el 1 es " + n1);
        System.out.println("EL numero de veces que ha salidao el 2 es " + n2);
        System.out.println("EL numero de veces que ha salidao el 3 es " + n3);
        System.out.println("EL numero de veces que ha salidao el 4 es " + n4);
        System.out.println("EL numero de veces que ha salidao el 5 es " + n5);
        System.out.println("EL numero de veces que ha salidao el 6 es " + n6);


    }
}
