import java.util.Scanner;

public class FormatoPersonas {

    public static void main(String[] args) {
        /*Nombre y apellidos: Juan Gómez
        Edad: 23
        Altura: 1,79
        Carnet de conducir: false
        Letra dni: a*/
        /*NOMBRE           EDAD  ALTURA CARNET LETRA
        ================ ===== ====== ====== =====
        Juan Gómez       00023   1,79 FALSE      A*/
        Scanner teclado = new Scanner(System.in);
        int edad;
        String nombreApellido;
        double altura;
        String letraDNI;
        boolean carnet;

        System.out.println("Introduce nombre-apellido");
        nombreApellido = teclado.next();
        System.out.println("Introduce edad");
        edad = teclado.nextInt();
        System.out.println("Introduce altura");
        altura = teclado.nextDouble();
        System.out.println("Introduce carnet");
        carnet = teclado.nextBoolean();
        System.out.println("Introduce letra dni");
        letraDNI = teclado.next();

        // string %s
        // letra %c
        // numero sin , %d
        // numero con , %.2f
        // booleano %b
        // salto de linea %n

        System.out.println("NOMBRE\t\t\tEDAD\t\t\tALTURA\t\t\tCARNET\t\t\tLETRA");
        System.out.printf("%s\t\t\t%d\t\t\t%.2f\t\t\t%b\t\t\t%s%n",
                nombreApellido, edad, altura, carnet, letraDNI);

        // . ,




    }

}
