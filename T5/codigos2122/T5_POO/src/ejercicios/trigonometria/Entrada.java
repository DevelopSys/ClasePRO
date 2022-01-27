package ejercicios.trigonometria;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        /*Triangulo triangulo = new Triangulo(2,4);
        triangulo.calcularArea();
        System.out.println("El area es: "+triangulo.getArea());

        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        circulo.calcularDiametro();
        System.out.println("El area es: "+circulo.getArea());
        System.out.println("El diametro es: "+circulo.getDiametro());*/

        Scanner lecturaTeclado = new Scanner(System.in);
        int opcion =0;

        do{
            System.out.println("1. Triangulos");
            System.out.println("2. Circulos");
            System.out.println("3. Rectangulos");
            System.out.println("Que opcion quieres trabajar");
            opcion = lecturaTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce base");
                    int base = lecturaTeclado.nextInt();
                    System.out.println("Introduce altura");
                    int altura = lecturaTeclado.nextInt();
                    Triangulo triangulo = new Triangulo(base,altura);
                    do {
                        System.out.println("1. Calcular area");
                        System.out.println("2. mostrar datos");
                        System.out.println("0. Volver");
                        opcion = lecturaTeclado.nextInt();

                        switch (opcion){
                            case 1:
                                triangulo.calcularArea();
                                break;
                            case 2:
                                triangulo.mostrarDatos();
                                break;
                        }
                    }while (opcion!=0);

                    System.out.println("Pulsa enter para continuar");
                    lecturaTeclado.next();
                    break;
                case 2:
                    System.out.println("Pulsa enter para continuar");
                    lecturaTeclado.next();
                    break;
                case 3:
                    System.out.println("Pulsa enter para continuar");
                    lecturaTeclado.next();
                    break;
            }

        }while (opcion!=4);

    }
}
