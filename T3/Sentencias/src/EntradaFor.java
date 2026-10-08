import java.util.Scanner;

public class EntradaFor {
    public static void main(String[] args) {
        System.out.println("Sentencias FOR");
        /*
        Tabla de multiplicar de un numero
        Scanner lector = new Scanner(System.in);
        System.out.println("De que numero quieres la tabla del 0-10");
        int numero = lector.nextInt();
        if(numero>0){
            System.out.println("Calculado la tabla del "+numero);
            for (int i = 0; i <11; i++) {
                int resultado = numero*i;
                System.out.printf("%d*%d = %d\n",numero,i,resultado);
            }
        } else {
            System.out.println("Dato invalido");
        }
        // pide al usuario un numero e imprime por cosola 8
            // en caso de ser un numero positivo
                // la tabla de multiplicar de dicho numero entre 0 y 10
            // en caso contrario me da error
        // 8*0 =0
        // 8*1 =8
        // 8*2 =16
        // .....
        // 8*10 =80
        */
        /*
        Funcionamiento for
        for (int i = 0; i < 11; i++) {
            // i=2
            System.out.println("Tabla del "+i);
            for (int j = 0; j <11 ; j++) {
                // j=0
                System.out.printf("\t%d*%d = %d\n",i,j,i*j);
            }
        }*/
        /*
        Tabla del 0
        0*0=0
        0*1=0
        0*2=0
        Tabla del 1
        1*0=0
        1*1=0
        1*2=0
        Tabla del 2
        2*0=0
        2*1=0
        2*2=0
        Tabla del 10
        10*0=0
        10*1=0
        10*2=0
         */
        /*for(int i=10;i>0;i--){
            System.out.println("La iteracion es la numero "+(i));
            // incremento
        }

         */
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero del rango");
        int n1 = lector.nextInt();
        System.out.println("Introduce el otro numero del rango");
        int n2 = lector.nextInt();
        // n1 =4  n2=4
        int min = n2; //4
        int max = min; //4
        if (n1 > n2) {
            max = n1;
            min = n2;
        } else if (n2 > n1) {
            max = n2;
            min = n1;
        }

        for (int i = min; i <= max; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d*%d=%d\n", i, j, i * j);
            }
        }

    }
}
