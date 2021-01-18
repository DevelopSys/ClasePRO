package ejercicios.ejercicioTrigonometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        /*Triangulo triangulo = new Triangulo(5,5);
        triangulo.calcularArea();
        System.out.println(triangulo.getArea());
        Triangulo triangulo2 = new Triangulo(7,4);
        triangulo2.calcularArea();
        System.out.println(triangulo2.getArea());*/

        Scanner teclado = new Scanner(System.in);
        int opcion, opcionSecundaria = 0;

        do {

            System.out.println("1- Trabajar con triangulos");
            System.out.println("2- Trabajar con circulos");
            System.out.println("3- Trabajar con cuadrados");
            System.out.println("4- Salir");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    int base, altura;
                    System.out.println("Trabajando con triangulos");
                    System.out.println("Introduce base");
                    base = teclado.nextInt();
                    System.out.println("Introduce altura");
                    altura = teclado.nextInt();
                    Triangulo triangulo = new Triangulo(base,altura);
                    System.out.println("Ya está creado el triángulo, que quieres hacer ahora");


                    do{
                        System.out.println("1-Calcular Area");
                        System.out.println("2-Mostrar datos");
                        System.out.println("3-Salir al menu general");
                        opcionSecundaria = teclado.nextInt();
                        switch (opcionSecundaria){
                            case 1:
                                triangulo.calcularArea();
                                break;
                            case 2:
                                //triangulo.calcularArea();
                                triangulo.mostrarDatos();
                                break;
                        }
                    } while (opcionSecundaria!=3);

                    break;
                case 2:
                    System.out.println("Trabajando con circulos");
                    teclado.next();
                    break;
                case 3:
                    System.out.println("Trabajando con cuadrados");
                    teclado.next();
                    break;
            }


        } while (opcion != 4);


    }
}
