package ejercicio2;

import java.util.Scanner;

public class Controller {

    private int[] numerosBonoloto, numerosJugador;
    private int aciertos;
    private Scanner scanner;

    public Controller() {
        scanner = new Scanner(System.in);
        numerosBonoloto = new int[6];
        for (int i = 0; i < 6; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() * 50);
            } while (estaNumero(aleatorio));
            numerosBonoloto[i] = aleatorio;
        }
        numerosJugador = new int[6];
    }

    public void empezarJuego() {
        int aciertos =0;
        for (int i = 0; i < 6; i++) {
            int numeroJugador;
            do {
                System.out.println("Indica el numero de tu jugada");
                numeroJugador = scanner.nextInt();
            } while (numeroJugador < 0 || numeroJugador >= 50);
            numerosJugador[i] = scanner.nextInt();
        }

        for (int itemBonoloto:numerosBonoloto) {
            for (int itemJugador: numerosJugador) {
                if (itemJugador==itemBonoloto){
                    aciertos++;
                }
            }
        }

        System.out.println("Los aciertos de tu jugada son "+aciertos);
    }

    private boolean estaNumero(int numero) {
        for (int item : numerosBonoloto) {
            if (item == numero) {
                return true;
            }
        }
        return false;
    }
}
