import java.util.Scanner;

public class EntradaEjercicio4 {

    public static void main(String[] args) {

        // EntradaEjercicio4 nombre = new EntradaEjercicio4();
        String linea1 = new EntradaEjercicio4().pedirDatos();
        String linea2 = new EntradaEjercicio4().pedirDatos();
        System.out.printf("NOMBRE\t\t\t\tEDAD\t\tALTURA\t\tCARNET\t\tLETRA%n");
        System.out.printf("%s",linea1);
        System.out.printf("%s",linea2);
        /*System.out.printf("%s\t\t\t\t%d\t\t\t%.2f\t\t%b\t\t%c%n",nombre+" "+apellido,edad,altura,carnet,letra);
        System.out.printf("%s\t\t\t\t%d\t\t\t%.2f\t\t%b\t\t%c%n",nombre1+" "+apellido1,edad1,altura1,carnet1,letra1);*/

    }

    public String pedirDatos(){
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = lecturaTeclado.next();
        System.out.println("Dime tu apellido");
        String apellido = lecturaTeclado.next();
        System.out.println("Que edad tienes");
        int edad = lecturaTeclado.nextInt();
        System.out.printf("Dime tu altura");
        double altura = lecturaTeclado.nextDouble();
        System.out.printf("Tienes carnet");
        boolean carnet = lecturaTeclado.nextBoolean();
        System.out.printf("Dime la letra de tu gSang");
        char letra = lecturaTeclado.next().charAt(0);
        //System.out.printf("%s\t\t\t\t%d\t\t\t%.2f\t\t%b\t\t%c%n",nombre+" "+apellido,edad,altura,carnet,letra);
        return String.format("%s\t\t\t\t%d\t\t\t%.2f\t\t%b\t\t%c%n",nombre+" "+apellido,edad,altura,carnet,letra);
    }


}
