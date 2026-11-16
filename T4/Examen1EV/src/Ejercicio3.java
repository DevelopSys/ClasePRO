import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos jugadores tiene el torneo");
        int nJugadores = scanner.nextInt();
        String[] jugadores = new String[nJugadores];
        int[] puntuacion = new int[nJugadores];
        for (int i = 0; i < nJugadores; i++) {
            System.out.println("Indica el nombre del jugador " + (i + 1));
            jugadores[i] = scanner.next();
            puntuacion[i] = (int) (Math.random() * 10) + 1;
        }

        int mayorPuntuacion = puntuacion[0];
        int posicionMayor = 0;
        int menorPuntuacion = puntuacion[0];
        int posicionMenor = 0;
        int sumatorio = 0;
        /*for ( int item: puntuacion ) {
            /*if(item>mayorPuntuacion){
                mayorPuntuacion = item;
            }
            mayorPuntuacion = item>mayorPuntuacion ? item : mayorPuntuacion;
            menorPuntuacion = item<menorPuntuacion ? item : menorPuntuacion;
        }*/
        for (int i = 0; i < puntuacion.length; i++) {
            sumatorio += puntuacion[i];
            mayorPuntuacion = puntuacion[i] > mayorPuntuacion ? puntuacion[i] : mayorPuntuacion;
            posicionMayor = puntuacion[i] > mayorPuntuacion ? i : posicionMayor;
            menorPuntuacion = puntuacion[i] < menorPuntuacion ? puntuacion[i] : menorPuntuacion;
            posicionMenor = puntuacion[i] < menorPuntuacion ? i : posicionMenor;
        }

        System.out.println("El que tienes mas puntos es " + jugadores[posicionMayor]);
        System.out.println("El que tienes menos puntos es " + jugadores[posicionMenor]);
        System.out.println("La media de puntos es de " + sumatorio / jugadores.length);
    }
}
