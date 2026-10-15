package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int record = 100000000;
        String jugar;
        do {
            int aleatorio = (int) (Math.random() * 21); // 6
            System.out.println("Generado "+aleatorio);
            int numeroUsuario;
            int intentos = 0;
            do {
                intentos++;
                System.out.println("Indica numero");
                numeroUsuario = lector.nextInt();
                if (numeroUsuario != aleatorio) {
                    System.out.println("Numero incorrecto");
                }
            } while (aleatorio != numeroUsuario);
            if (intentos<record){
                System.out.println("El record lo has superado, enhorabuena");
                record = intentos;
            }
            System.out.println("Numero acertado en un numero de aciertos de " + intentos);
            System.out.println("Quieres volver a jugar");
            lector = new Scanner(System.in);
            jugar = lector.nextLine();
        } while (jugar.equals("si"));
    }
}