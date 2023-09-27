import java.util.Scanner;

public class EjercicioRetorno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el operando1");
        int op1 = scanner.nextInt();
        System.out.println("Indica el operando2");
        int op2 = scanner.nextInt();

        System.out.println(sumar(op1,op2));
        System.out.println(sumar(18,19));
        System.out.println(sumar(10,10)+sumar(20,10));
        multiplicar(sumar(10,10),sumar(20,10));
    }

    public static void multiplicar(int op1, int op2){
        int resultado = op1*op2;
        System.out.println(resultado);
    }

    public static int sumar(int operando1, int operando2){

        return operando1+operando2;
    }

    // crea un metodo estatico que tenga dos parametros
    // el metodo realizara la suma de los parametros
    // ademas retornara el resultado
    // pide los dos operandos por teclado
    // se mostrara por consola el resultado (desde el main no desde el metodo)
}
