import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // interactua con el usuario -> VISTA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = scanner.next();
        System.out.println("Apellido:");
        String apellido = scanner.next();
        System.out.println("DNI:");
        String dni = scanner.next();
        System.out.println("Edad:");
        int edad = scanner.nextInt();
        System.out.println("Altura:");
        double altura = scanner.nextDouble();
        System.out.println("Peso:");
        double peso = scanner.nextDouble();
        System.out.println("Genero: (M/F)");
        char genero = scanner.next().toLowerCase().charAt(0);
        Persona persona1 = new Persona(nombre, apellido, dni, edad, altura, peso, genero);
        // Persona persona2 = new Persona("Borja","Martin");
        // Persona persona3 = new Persona();

        persona1.mostrarDatos();
        double IMC = persona1.calcularIMC();
        System.out.println("El IMC es " + IMC);
        switch (genero) {
            case 'M':
                if (IMC < 18) {
                    System.out.println("Estado fisico por debajo de lo normal");
                } else if (IMC < 25) {
                    System.out.println("Estado normal");
                } else if (IMC < 30) {
                    System.out.println("Estado en peligro");
                } else {
                    System.out.println("Mal estado fisico");
                }
                break;
            case 'F':
                if (IMC < 14) {
                    System.out.println("Estado fisico por debajo de lo normal");
                } else if (IMC < 29) {
                    System.out.println("Estado normal");
                } else if (IMC < 35) {
                    System.out.println("Estado en peligro");
                } else {
                    System.out.println("Mal estado fisico");
                }
                break;
        }


        // persona2.mostrarDatos();
        // persona3.mostrarDatos();
    }
}
