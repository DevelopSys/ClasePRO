package ejercicios_base.ejercicio2;

import ejercicios_base.ejercicio1.Persona;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = lecturaTeclado.next();
        System.out.println("Introduce apellido");
        String apellido = lecturaTeclado.next();
        System.out.println("Introduce dni");
        String dni = lecturaTeclado.next();
        System.out.println("Introduce edad");
        int edad = lecturaTeclado.nextInt();
        System.out.println("Introduce peso");
        double peso = lecturaTeclado.nextDouble();
        System.out.println("Introduce altura");
        int altura = lecturaTeclado.nextInt();
        Persona persona = new Persona(nombre, apellido, dni,edad, altura, peso);

        Persona personaMano = new Persona("Borja","Martin");
        Persona personaSola = new Persona();

        System.out.println("Persona con scanner");
        persona.mostrarDatos();
        System.out.println("Persona a mano");
        personaMano.mostrarDatos();
        System.out.println("Persona sin nada");
        personaSola.mostrarDatos();

        persona.setEdad(20);
        personaMano.setEdad(20);
        personaSola.setEdad(20);


        System.out.println("Persona con scanner");
        persona.mostrarDatos();
        System.out.println("Persona a mano");
        personaMano.mostrarDatos();
        System.out.println("Persona sin nada");
        personaSola.mostrarDatos();

    }

}


