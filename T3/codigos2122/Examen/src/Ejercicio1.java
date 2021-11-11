import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        int opcionSeleccionada =0;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Potencia");
            System.out.println("3. Multiplicar");
            System.out.println("0. Salir");
            System.out.println("Introduce la opción");
            opcionSeleccionada = lecturaTeclado.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    int operandoUno, operandoDos;
                    System.out.println("Intro operando 1:");
                    operandoUno = lecturaTeclado.nextInt();
                    System.out.println("Intro operando 2:");
                    operandoDos = lecturaTeclado.nextInt();

                    int suma = operandoUno+operandoDos;
                    System.out.printf("La suma es: %d%n ",operandoUno+operandoDos);

                    break;

                case 2:
                    int base, exponente;
                    System.out.println("Intro base:");
                    base = lecturaTeclado.nextInt();
                    System.out.println("Intro exponente:");
                    exponente = lecturaTeclado.nextInt();

                    int potencia = (int)Math.pow(base,exponente);
                    System.out.printf("La potencia es: %d%n ", potencia);
                    break;

                case 3:

                    for (int i = 0; i < 11; i++) {
                        System.out.printf("La tabla del %d%n",i);
                        for (int j = 0; j < 11; j++) {

                            System.out.printf("%d * %d = %d%n", i,j, i*j);
                        }

                    }

                    break;
            }

        } while (opcionSeleccionada!=0);

    }
}
