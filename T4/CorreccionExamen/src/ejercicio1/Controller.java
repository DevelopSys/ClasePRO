package ejercicio1;

import java.util.Scanner;

public class Controller {

    private String[] palabras;
    private String palabraJuego;
    private String palabraJugador;
    private int intentos = 5;
    private Scanner scanner;

    public Controller() {
        palabras = new String[]{"prueb", "datos", "cosas"};
        scanner = new Scanner(System.in);
        palabraJuego = palabras[(int) (Math.random() * 3)];
    }

    public void empezarJuego() {

        boolean aciertoTotal;
        do {
            aciertoTotal = false;
            int aciertos = 0;
            int acercamientos = 0;
            int fallos = 0;
            System.out.println("Por favor introduce una palabra");
            palabraJugador = scanner.next();
            for (int i = 0; i < palabraJuego.length(); i++) {
                if (palabraJuego.equals(palabraJugador)) {
                    aciertos = 5;
                    aciertoTotal = true;
                } else if (palabraJuego.charAt(i) == palabraJugador.charAt(i)) {
                    aciertos++;
                } else if (palabraJuego.contains(String.valueOf(palabraJugador.charAt(i)))) {
                    acercamientos++;
                } else {
                    fallos++;
                }
            }
            System.out.println("Los datos de este intento son");
            System.out.println("aciertos: " + aciertos);
            System.out.println("acercamientos: " + acercamientos);
            System.out.println("fallos: " + fallos);
            intentos++;
        } while (intentos > 0 || !aciertoTotal);
        // todo palabra acertada

    }
}
