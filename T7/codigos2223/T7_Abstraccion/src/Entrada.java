import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        /*ClaseB claseB = new ClaseB();
        ClaseC claseC = new ClaseC();
        ClaseA claseA1 = new ClaseA() {
            @Override
            public void metodoSinDefinir() {
                System.out.println("Mensaje lanzado desde la clase A_1");
            }
        };

        ClaseA claseA2 = new ClaseA() {
            @Override
            public void metodoSinDefinir() {
                System.out.println("Mensaje lanzado desde la clase A_2");
            }
        };


        ArrayList<ClaseA> objetos = new ArrayList<>();

        objetos.add(claseB);
        objetos.add(claseC);
        objetos.add(claseA1);
        objetos.add(claseA2);

        for ( ClaseA item: objetos ) {
            item.metodoSinDefinir();
        }*/

        ClaseD claseD = new ClaseD();
        claseD.agregarClase(new ClaseC());
        claseD.agregarClase(new ClaseC());
        claseD.agregarClase(new ClaseB());
        claseD.agregarClase(new ClaseB());
        claseD.agregarClase(new ClaseB());
        claseD.agregarClase(new ClaseA() {
            @Override
            public void metodoSinDefinir() {
                System.out.println("Ejemplo de ejecucion anonima");
            }
        });
        claseD.agregarClase(new ClaseA() {
            @Override
            public void metodoSinDefinir() {
                System.out.println("Ejemplo de ejecucion anonima diferente");
            }
        });
        claseD.ejecutarMetodoInterfaz(new EjemploInterfaz() {
            @Override
            public void onElementoInterfaz() {
                System.out.println("Esta interfaz se comporta de esta forma");
            }
        });

        claseD.ejecutarMetodoInterfaz(new EjemploInterfaz() {
            @Override
            public void onElementoInterfaz() {
                System.out.println("Introduce un numero");
                int numero = new Scanner(System.in).nextInt();
                System.out.println("El numero introducido es "+numero);
            }
        });
    }
}
