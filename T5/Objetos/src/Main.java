import model.Coche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String nombre = "App Coches";
        Scanner scanner = new Scanner(System.in);

        /*
        Coche ford = new Coche("Ford","Focus",200);
        // marca=Ford modelo=Focus cv=2000 precio=0.0
        Coche seat = new Coche(); // marca=null modelo=null cv=0 precio=1000.0
        Coche vw = new Coche(); // marca=null modelo=null cv=0 precio=1000.0
        */

        /*
        Coche mercedes = new Coche("Mercedes","C300",400,20000.0);
        // marca=mercees modelo=c300 cv=200 precio=20000.0
        Coche audi = new Coche("Audi","a5",199,30000.0);
        // marca=audi modelo=a5 cv=200 precio=30000.0

        // velocidad = 0
        System.out.println("A que velocidad quires acelerar");
        int velocidad = scanner.nextInt();
        mercedes.acelerar(velocidad);
        mercedes.mostrarFichaTecnica();
        System.out.println("Nueva aceleracion");
        mercedes.acelerar(20);
        mercedes.mostrarFichaTecnica();
        mercedes.frenar(30);
        mercedes.mostrarFichaTecnica();

         */

        /*
        REALIZAR UNA CARRERA DE 2 COCHES. Para ello el sistema pedirá:

        1. Los datos de cada uno de los participantes
        2. Las vueltas de las que consta la carrera
            Cada vuelta los coches
                acelerar 2 veces un random entre 10 y 30
                frenan 1 vez un random entre 10 - 20
                Mostrando la velocidad y km de cada coche en cada vuelta
                Thread.sleep

        3. Comenzar la carrera
            En cada vuelta se mostrará la calificacion:
                Mostrando la velocidad de cada coche y los km

        4. Muestra el ganador de la carrera -> aquel que mas km tenga

         */
        /*
        // scanner.next();
        int i = 0;
        while (true){
            i++;
            Thread.sleep(2000);
            System.out.println("Ejecutando "+i);
            if(i== 10){
                break;
            }
        }

         */

    }
}
