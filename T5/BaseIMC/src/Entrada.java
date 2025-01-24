import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // interactua con el usuario -> VISTA
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre:");
        String  nombre = scanner.next();
        System.out.println("Apellido:");
        String  apellido= scanner.next();
        System.out.println("DNI:");
        String  dni = scanner.next();
        System.out.println("Edad:");
        int  edad = scanner.nextInt();
        System.out.println("Altura:");
        double altura = scanner.nextDouble();
        System.out.println("Peso:");
        double peso = scanner.nextDouble();
        Persona persona1 = new Persona(nombre,apellido,dni,edad,altura,peso);
        Persona persona2 = new Persona("Borja","Martin");
        Persona persona3 = new Persona();

        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();
    }
}
