import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        // tipo nombreUno = valor
        // tipo nombreUno;
        // final tipo NOMBRE = valor
        // final tipo NOMBRE;

        /*System.out.println("Primera salida por consola");
        System.out.println("El primer dato es "+4);
        System.out.println("El primer dato es "+4+" el segundo dato es "+6);
        System.out.printf("El %s dato es %d el segundo dato es %d y un numero con coma es %.2f%n","primer",4,6, 4.543);*/

        byte varByte = 123;
        //Byte varByteCompleja = 123;
        short varShort = 2345;
        int varInt = 1234;
        long varLong = 1234;

        // decimales con comas
        double varDouble = 1234.00;
        float varFloat = 12345f;

        boolean acierto = false;
        char letra;

        String palabra = "ejemplo";

        /*Scanner teclado = new Scanner(System.in);
        varInt = teclado.nextInt();
        palabra = teclado.next();
        letra = teclado.next().charAt(0);

        System.out.printf("La primera lectura es un numero: %d%n" +
                "La segunda lectura es una palabra: %s%n" +
                "La tercera lectura es una letra: %c%n", varInt, palabra, letra);*/


        // operaciones aritmeticas + - * / % --> numero
        int suma = 1+3;
        int resta = 1-5;
        double multiplicacion = 4*7.56;
        double division = (double) 14/ (double)3;
        double numeroDec = 34567.43;

        System.out.println(numeroDec);
        System.out.printf("%.2f%n",division);
        System.out.println(multiplicacion);
        System.out.println(division);

        // unarias ++, -- --> numero

        int numeroIncremento = 6;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        numeroIncremento++;
        // 15
        numeroIncremento = numeroIncremento *2;
        numeroIncremento--;
        numeroIncremento--;
        numeroIncremento--;
        numeroIncremento--;
        numeroIncremento--;
        System.out.println(numeroIncremento);

        // aritmetico y asignacion --> numero
         int numeroCombinado = 67;
         //numeroCombinado = numeroCombinado +10;
        numeroCombinado += 10;
        // 77
        numeroCombinado -= 10;
        // 67
        numeroCombinado *= 10;
        // 670
        numeroCombinado /= 10;
        // 67
        numeroCombinado %= 10;
        // 7

        // relaciones < <= > >= == != --> boolean

        int numeroCumpleUno=40, numeroCumpleDos=40;
        String palabraCompararUno="asD", palabraComprarDos = "asd";
        boolean cumple = numeroCumpleUno >= numeroCumpleDos;
        cumple = numeroCumpleUno<=numeroCumpleDos;
        cumple = numeroCumpleUno != numeroCumpleDos;
        cumple = palabraCompararUno.equalsIgnoreCase(palabraComprarDos);

        // logicas AND(&&)--> false si una de las condiciones es falsa OR(||) verdadero si una de las condiciones es verdadera

        // op1  op2 AND (y) --> false --> RESULTADO FALSE
        // op1  op2 OR (o) --> true --> RESULTADO TRUE

        cumple = numeroCumpleUno>0 && (numeroCumpleDos!= 40 && false);


    }

}
