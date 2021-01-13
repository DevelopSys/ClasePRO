package explicaciones;
import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Coche golf = new Coche();
        Coche focus = new Coche();
        Coche ibiza = new Coche("Seat", "Ibiza", 100, 125, 0.0);
        Coche leon = new Coche("Seat", "Leon");

        System.out.println("Ejecución desde la clase entrada");

        /*
        // marca = "marca defecto"
        // modelo = "modelo defecto"


        // tipo nombre = valor
        System.out.println("Impresión datos focus");
        //focus.setMarca("Ford");
        //focus.setModelo("Focus");
        focus.setCv(250);
        focus.setKm(0.0);
        focus.setVelocidad(200);
        focus.mostrarDatos();

        System.out.println("Impresión datos golf");
        //golf.setMarca("VW");
        //golf.setModelo("Golf");
        golf.setCv(200);
        golf.setKm(100.0);
        golf.setVelocidad(300);
        golf.mostrarDatos();

        System.out.println("Impresión datos ibiza");
        ibiza.setCv(500);
        ibiza.mostrarDatos();

        System.out.println("Impresión datos leon");
        leon.setCv(250);
        leon.setKm(50);
        leon.mostrarDatos();


        // si quiero acceder solo a la propiedad velocidad

        System.out.printf("Los cv del golf son %d %n", golf.getCv());
        System.out.printf("Los velocidad del golf son %d %n", golf.getVelocidad());
        System.out.printf("Los marca del golf son %s %n", golf.getMarca());
        System.out.printf("Los modelo del golf son %s %n", golf.getModelo());
        System.out.printf("Los km del golf son %.2f %n", golf.getKm());
        System.out.printf("Los cv del focus son %d %n", focus.getCv());

        //acceder a todas las propiedades desde el main

        if (golf.getCv() > focus.getCv()){
            System.out.println("El golf es más potente que el focus");
        } else {
            System.out.println("El focus es más potente que el golf");
        }
        */

        golf.mostrarDatos();
        System.out.println("Por favor introduce la velocidad que quieres acelerar");
        int velocidad = teclado.nextInt();
        // cuando se ejecuta el método, si la velocidad introducida es <=0 el método me de un false,
        // sino el metodo me de un verdadero
        //golf.acelerarVelocidad(velocidad); // retorna true o false
        if (golf.acelerarVelocidad(velocidad)){
            System.out.println("El coche ha acelerado");
        } else {
            System.out.println("El coche ha frenado o no ha acelerado");
        }





    }
}
