package ejercicioTrigonometria;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //Cuadrado cuadrado = new Cuadrado(5,7);
        //System.out.println("El area del cuadrado es "+cuadrado.getArea());
        //System.out.println("El perimetro del cuadrado es "+cuadrado.getPerimetro());
        // b * a = 35

        Scanner teclado = new Scanner(System.in);
        int opcionPrimera=0, opcionSecundaria=0, base=0, altura=0, radio=0;

        do {

            System.out.println("1. Cuadrados");
            System.out.println("2. Triangulos");
            System.out.println("3. Circulos");
            opcionPrimera = teclado.nextInt();

            switch (opcionPrimera){
                case 1:
                    System.out.println("Trabajo con cuadrados");
                    System.out.println("Dime la base");
                    base = teclado.nextInt();
                    System.out.println("Dime la altura");
                    altura = teclado.nextInt();
                    Cuadrado cuadrado = new Cuadrado(base,altura);
                    System.out.println("Que quieres hacer");
                    System.out.println("1. Calcular area");
                    System.out.println("2. Mostrar datos");
                    opcionSecundaria = teclado.nextInt();
                    switch (opcionSecundaria){
                        case 1:
                            System.out.println(cuadrado.calcularArea());
                            break;
                        case 2:
                            cuadrado.mostrarDatos();
                            break;
                    }

                    System.out.println("Pulsa cualquier tecla+enter para continuar");
                    teclado.next();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        }while (opcionPrimera!=4);


    }
}
