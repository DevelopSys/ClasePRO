import model.Coche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre = "App Coches";


        /*
        Coche ford = new Coche("Ford","Focus",200);
        // marca=Ford modelo=Focus cv=2000 precio=0.0
        Coche seat = new Coche(); // marca=null modelo=null cv=0 precio=1000.0
        Coche vw = new Coche(); // marca=null modelo=null cv=0 precio=1000.0
        */

        Coche mercedes = new Coche("Mercedes","C300",400,20000.0);
        // marca=mercees modelo=c300 cv=200 precio=20000.0
        Coche audi = new Coche("Audi","a5",200,30000.0);
        // marca=audi modelo=a5 cv=200 precio=30000.0

        System.out.println("Ficha del audi");
        audi.mostrarFichaTecnica();
        System.out.println("Ficha del mercedes");
        mercedes.mostrarFichaTecnica();

    }
}
