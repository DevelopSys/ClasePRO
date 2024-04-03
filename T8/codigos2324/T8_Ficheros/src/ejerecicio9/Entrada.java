package ejerecicio9;

import ejerecicio9.controller.Operaciones;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        System.out.println("Indica cual es el mensaje que quieres cifrar");
        Scanner scanner = new Scanner(System.in);
        String mensaje = scanner.nextLine();
        System.out.println("Indica la clave de cifrado");
        int clave = scanner.nextInt();
        operaciones.cifrar(mensaje,clave);

        System.out.println("----CIFRADO COMPLETO----");

        System.out.println("Introduce clave de descrifrado");
        clave = scanner.nextInt();
        operaciones.descifrar("src/resources/cifrado.txt",clave);
    }
}
