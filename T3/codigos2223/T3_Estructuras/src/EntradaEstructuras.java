import java.util.Scanner;

public class EntradaEstructuras {

    public static void main(String[] args) {

        //estructuraIF();
        calcularNota();

    }


    public static void estructuraIF() {
        // IF

        int numeroUno = -1, numeroDos = 20;
        System.out.println("Ejecucion de un if simple");
        // que el numeroUno este entre 0 y 15 y que ademas el n2 sea par
        // [0-15]
        if (numeroUno >= 0 && numeroUno <= 15) {

            System.out.println("El número es positivo y por lo tanto ejecuto");
            // no es accesible desde fuera del bloque
            int numeroTres = 50;
            numeroUno++;
        } else {
            System.out.println("No se cumple la condición");
        }

        System.out.println("Continuacion del programa");
        System.out.println("El valor de numeroUno es: " + numeroUno);


        numeroUno = 22;
        numeroDos = 10;

        if (numeroUno>10){
            System.out.println("El numero es más grande que 10");
        } else if(numeroUno>=0 && numeroUno<=10){
            System.out.println("El numero está entre 0 y 10");
        } else if (numeroUno<0 && numeroUno>-10) {
            System.out.println("El numero es negativo");
        } else {
            // siempre el n será <-10
            System.out.println("El numero es un negativo grande");
        }

        // pedir por consola una nota
        // si la nota es valida = [0-10]
            // 0-4.99 --> examen suspenso
            // 5-6.99 --> examen aprobado
            // 7-8.99 --> examen notable
            // 9-9.99 --> examen sobresaliente
            // 10 --> examen de matricula
        // de no serlo avisa
    }

    public static void calcularNota(){
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Que nota has sacado");
        double nota = lecturaTeclado.nextDouble();

        if (nota>=0 && nota<=10){
            // 0-10
            if (nota<5){
                System.out.println("Examen suspenso");
            } else if (nota<7){
                System.out.println("Examen aprobado");
            } else if (nota<9) {
                System.out.println("Examen notable");
            } else if (nota<10){
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("MH");
            }
        }
        else {
            System.out.println("Nota no valida");
        }

    }

}


