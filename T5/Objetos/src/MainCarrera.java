import model.Coche;

import java.util.Scanner;

public class MainCarrera {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Coche participante1 = null; // null
        Coche participante2 = null; // null
        for (int i = 0; i < 2; i++) {
            System.out.println("Indica la marca del participante " + (i + 1));
            String marca = scanner.next();
            System.out.println("Indica la modelo del participante " + (i + 1));
            String modelo = scanner.next();
            System.out.println("Indica los cv del participante " + (i + 1));
            int cv = scanner.nextInt();
            if (i == 0) {
                participante1 = new Coche(marca, modelo, cv);
            } else {
                participante2 = new Coche(marca, modelo, cv);
            }
        }
        System.out.println("Cuantas vueltas tiene la carrera");
        int vueltas = scanner.nextInt();
        System.out.println("Cuantos km tiene la carrera");
        int kmCarrera = scanner.nextInt();
        // la carrera inicialmente tiene x vueltas, pero no termina
        // hasta que uno de los porticipantes tenga como minimo el n de km del circuito
        /*
        for (int i = 0; i < vueltas; i++) {
            System.out.println("Vuelta " + (i + 1));
            participante1.acelerar((int) (Math.random() * 41) + 10);
            participante1.acelerar((int) (Math.random() * 41) + 10);
            participante1.frenar((int) (Math.random() * 11) + 10);
            participante2.acelerar((int) (Math.random() * 41) + 10);
            participante2.acelerar((int) (Math.random() * 41) + 10);
            participante2.frenar((int) (Math.random() * 11) + 10);
            System.out.println("Datos de la vuelta");
            System.out.printf("El coche1 velocidad: %d km: %d%n",participante1.getVelocidad(), participante1.getKm());
            System.out.printf("El coche2 velocidad: %d km: %d%n",participante2.getVelocidad(), participante2.getKm());
            Thread.sleep(3000);
        }*/
        int numeroVuelta = 1;
        do {
            System.out.println("Vuelta " + (numeroVuelta));
            participante1.acelerar((int) (Math.random() * 41) + 10);
            participante1.acelerar((int) (Math.random() * 41) + 10);
            participante1.frenar((int) (Math.random() * 11) + 10);
            participante2.acelerar((int) (Math.random() * 41) + 10);
            participante2.acelerar((int) (Math.random() * 41) + 10);
            participante2.frenar((int) (Math.random() * 11) + 10);
            System.out.println("Datos de la vuelta");
            System.out.printf("El coche1 velocidad: %d km: %d%n", participante1.getVelocidad(), participante1.getKm());
            System.out.printf("El coche2 velocidad: %d km: %d%n", participante2.getVelocidad(), participante2.getKm());
            numeroVuelta++;
            Thread.sleep(3000);
            if(numeroVuelta>vueltas){
                System.out.println("Vuelta extra");
            }
        }while (participante1.getKm()<kmCarrera && participante2.getKm() < kmCarrera);

        Coche ganador = participante1.getKm() > participante2.getKm() ? participante1 : participante2;
        System.out.println("Los datos del ganador son " + ganador.getModelo());

        /*
        if(participante1.getKm()>participante2.getKm()){
            System.out.printf("Ganador el p1");
        } else {
            System.out.printf("Ganador el p2");
        }*/

    }
}
