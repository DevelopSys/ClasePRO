package ejercicios.ejerciciodos;

import ejercicios.ejericiouno.Persona;
import explicaciones.Coche;

import java.util.Scanner;

public class Entrada {

    static Scanner teclado;

    public static void main(String[] args) {

        Persona p1, p2, p3;


        teclado = new Scanner(System.in);
        String nombre, apellido, dni;
        double peso;
        int edad, altura;
        int contador = 1;

        do {

            nombre, apellido // pedidos con scanner
            p1 = new Persona(nombre,apellido);

            switch (contador) {
                case 1:

                    break;
                case 2:
                    p2 = new Persona(nombre,apellido);
                    break;
                case 3:
                            p3 = new Persona(nombre,apellido);
                    break;
                case 4:
                    p4 = new Persona(nombre,apellido);
                    break;
            }
            contador++;
        } while ();

        System.out.println("Introduce nombre:");
        nombre = teclado.next();
        System.out.println("Introduce apellido:");
        apellido = teclado.next();
        System.out.println("Introduce dni:");
        dni = teclado.next();
        System.out.println("Introduce edad:");
        edad = teclado.nextInt();
        System.out.println("Introduce peso:");
        peso = teclado.nextDouble();
        System.out.println("Introduce altura:");
        altura = teclado.nextInt();

        p1 = new Persona(nombre, apellido, dni, edad, peso, altura);
        p2 = new Persona("Borja", "Martin");
        p3 = new Persona();

        p1.mostrarDatos(); // --> si es void no tengo nada
        p2.mostrarDatos(); // --> si es void no tengo nada
        p3.mostrarDatos(); // --> si es void no tengo nada

        p1.setEdad(20);
        p2.setEdad(25);
        p3.setEdad(30);

        p1.mostrarDatos(); // --> si es void no tengo nada
        p2.mostrarDatos(); // --> si es void no tengo nada
        p3.mostrarDatos(); // --> si es void no tengo nada
        /*
        * System.out.printf("Nombre: %s%n",nombre);
        System.out.printf("Apellido: %s%n",apellido);
        System.out.printf("Dni: %s%n",dni);
        System.out.printf("Edad: %d%n",edad);
        System.out.printf("Altura: %d%n",altura);
        System.out.printf("Peso: %.2f%n",peso);
        * */


    }
}
