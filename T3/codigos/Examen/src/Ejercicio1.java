import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0, operando1 = 0, operando2 = 0, resultado=-1;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Potencia");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Salir");
            System.out.println("Introduce opcion");
            opcion = scanner.nextInt();

            if (opcion > 0 && opcion < 4) {
                System.out.println("Introduce operando 1");
                operando1 = scanner.nextInt();
                System.out.println("Introduce operando 2");
                operando2 = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        resultado = operando1+operando2;
                        break;
                    case 2:
                        resultado = (int) Math.pow(operando1, operando2);
                        break;
                    case 3:
                        resultado = operando1*operando2;
                        break;
                }
            }

            else if (opcion==4){
                System.out.println("Saliendo......");
            } else{
                System.out.println("opcion no contemplada");
            }


        } while (opcion != 4);
    }

}
