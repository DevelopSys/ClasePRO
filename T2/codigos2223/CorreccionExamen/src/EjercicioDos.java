import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);

        String nombreJ1, nombreJ2, nombreJ3;
        int plantillaJ1, plantillaJ2, plantillaJ3;
        int presupuestoJ1, presupuestoJ2, presupuestoJ3;


        nombreJ1 = peticionNombre();
        plantillaJ1 = peticionJugadores();
        presupuestoJ1 = peticionPresupuesto();

        nombreJ2 = peticionNombre();
        plantillaJ2 = peticionJugadores();
        presupuestoJ2 = peticionPresupuesto();

        nombreJ3 = peticionNombre();
        plantillaJ3 = peticionJugadores();
        presupuestoJ3 = peticionPresupuesto();

        /*
        * “1. El primer participantes tiene 11 jugadores: (true o false)”
“2. El segundo participantes tiene jugadores pares: (true o false)”
“3. El tercer participante tiene presupuesto positivo: (true o false)”
“4. La liga está preparada para empezar: (true o false)”
        * */

        boolean condicionUno = plantillaJ1==11;
        boolean condicionDos = plantillaJ2%2 == 0 ;
        boolean condicionTres = presupuestoJ3 >= 0 ;
        boolean condicionCuatro = plantillaJ1==11 && presupuestoJ1>=0 && plantillaJ2==11
                && presupuestoJ2>=0 && plantillaJ3==11 && presupuestoJ3>=0;
        System.out.printf("El primer participante tiene 11 jugadores:%b%n",condicionUno);
        System.out.printf("El segundo participantes tiene jugadores pares:%b%n",condicionDos);
        System.out.printf("El tercer participante tiene presupuesto positivo:%b%n",condicionTres);
        System.out.printf("La liga está preparada para empezar:%b%n",condicionCuatro);

    }

    public static String peticionNombre() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = lecturaTeclado.next();
        return nombre;
    }

    public static int peticionJugadores() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce numero jugadores");
        int numeroJ = lecturaTeclado.nextInt();
        return numeroJ;
    }

    public static int peticionPresupuesto() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce numero de presupuesto");
        int presupuestoJ = lecturaTeclado.nextInt();
        return presupuestoJ;
    }
}
