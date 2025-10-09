import java.util.Scanner;

public class EntradaMetodos {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        String palabra = "Ejemplo";
        OperacionesMatematicas operaciones = new OperacionesMatematicas();
        operaciones.realizarSaludo("Borja");
        System.out.println("Porfavor, introduce op1");
        int op1 = lectorTeclado.nextInt();
        System.out.println("Porfavor, introduce op2");
        int op2 = lectorTeclado.nextInt();
        // En caso de sumar y que el resultado sea par, poner el mensaje de suma correcta
        // en caso de sumar y que el resultado sea impar, poner el mensaje de suma incorrecta

        operaciones.realizarSuma(-8,9);
        /*if (operaciones.numerosValidos(op1,op2)){
            System.out.println("Los numeros son validos");
        } else {
            System.out.println("Los numeros no son validos");
        }*/

        /*if (operaciones.realizarSuma(op1,op2)%2==0){
            System.out.println("La suma ha sido par");// 13
        } else {
            System.out.println("La suma ha sido impar");
        }*/


        // El ejercicio de la calculadora sacarlo a una clase,
        // cada metodo de operacion toma como parametros 2 numeros
        // retorna un valor
        // Antes de realizar cada operacion, es necesario evaluar
        // si los numeros son validos
            // los numeros son validos > 0
        // El menu tan solo pide numeros y muestra resultados

    }
}
