import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Triangulo triangulo = new Triangulo(4,7);
        // triangulo.mostarDatos();
        // b=4 a=7 area=4*7/2
        // triangulo.calcularArea();
        // b=4 a=7 area=4*7/2
        // Circulo circulo = new Circulo(6);
        // circulo.mostrarDatos();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Trabajo con ciruclos");
            System.out.println("2. Trabajo con triangulos");
            System.out.println("3. Trabajo con cuadrados");
            System.out.println("Que opcion quieres hacer");
            opcion =scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Indica el radio del ciruclo");
                    int radio = scanner.nextInt();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Los datos del circulo son:");
                    circulo.mostrarDatos();
                }
                case 2->{
                    System.out.println("Indica base");
                    int base = scanner.nextInt();
                    System.out.println("Indica altura");
                    int altura= scanner.nextInt();
                    Triangulo triangulo = new Triangulo(base,altura);
                    System.out.println("Los datos del circulo son:");
                    triangulo.mostrarDatos();
                }
                case 3->{
                    System.out.println("Indica base");
                    int base = scanner.nextInt();
                    System.out.println("Indica altura");
                    int altura= scanner.nextInt();
                    Cuadrado cuadrado = new Cuadrado(base,altura);
                    System.out.println("Los datos del cuadrado son:");
                    cuadrado.mostrarDatos();
                }
            }
        } while (opcion != 4);
    }
}
