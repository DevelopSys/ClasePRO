import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el nombre del p1");
        String nombreParticipante1 = scanner.next();
        System.out.println("Indica el nº de jugadores del p1");
        int jugadoresParticiapnte1 = scanner.nextInt();
        System.out.printf("Indica el presupuesto del p1");
        int presupuestoParticiapnte1 = scanner.nextInt();

        System.out.println("Indica el nombre del p2");
        String nombreParticipante2 = scanner.next();
        System.out.println("Indica el nº de jugadores del p2");
        int jugadoresParticiapnte2 = scanner.nextInt();
        System.out.printf("Indica el presupuesto del p2");
        int presupuestoParticiapnte2 = scanner.nextInt();

        System.out.println("Indica el nombre del p3");
        String nombreParticipante3 = scanner.next();
        System.out.println("Indica el nº de jugadores del p3");
        int jugadoresParticiapnte3 = scanner.nextInt();
        System.out.printf("Indica el presupuesto del p3");
        int presupuestoParticiapnte3 = scanner.nextInt();

        /*
        * “1. El primer participante tiene 11 jugadores: (true o false)”
“2. El segundo participante tiene jugadores pares: (true o false)”
“3. El tercer participante tiene presupuesto positivo: (true o false)”
“4. La liga está preparada para empezar: (true o false)”
        * */

        boolean comprobacion1 = jugadoresParticiapnte1 == 11;
        boolean comprobacion2 = jugadoresParticiapnte2 % 2 == 0;
        boolean comprobacion3 = presupuestoParticiapnte3 >= 0;
        boolean comprobacionTotal = jugadoresParticiapnte1 == 11 && jugadoresParticiapnte2 == 11 && jugadoresParticiapnte3 == 11
                && presupuestoParticiapnte1 >= 0 && presupuestoParticiapnte2 >= 0 && presupuestoParticiapnte3 >= 0;

        System.out.println("El primer participante tiene 11 jugadores: "+comprobacion1);
        System.out.println("El segundo participante tiene jugadores pares: "+comprobacion2);
        System.out.println("El terer participante tiene presupuesto positivo: "+comprobacion3);
        System.out.println("La liga puede empezar: "+comprobacionTotal);
    }
}
