import java.util.Scanner;

public class Ejercicio1 {

    // variables
    // metodos
    public static void main(String[] args) {
        /*System.out.println("Iniciando el simulacro del examen");
        // dato
        int numero = 9;
        // nombreMetodo(numero,"Borja");
        // nombreMetodo(4,"Cosa");
        // nombreMetodo(9,"dato");
        // nombreMetodo(7,"casa");
        // nombreMetodo(2,"jugar");
        int resultadoTotal = (int)metodoRetorno(numero) *10; //12
        System.out.println(resultadoTotal);

        metodoRetorno(90); // 180.0
        metodoRetorno(3); // 6.0*/
        // nombre, apellido, edad, altura, peso, sexo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre = scanner.next();
        System.out.println("Introduce apellido");
        String apellido = scanner.next();
        System.out.println("Introduce edad");
        int edad = scanner.nextInt();
        System.out.println("Introduce altura");
        float altura = scanner.nextFloat();
        System.out.println("Introduce peso");
        float peso = scanner.nextFloat();
        System.out.println("Introduce sexo");
        // char sexo = scanner.next().charAt(0); // char
        String sexo = scanner.next();
        float imc = calculoIMC(peso,altura);
        System.out.printf("Hola %s tu IMC " +
                "teniendo en cuenta tu altura de %.2fm y " +
                "tu peso de %.2fkg, tiene un valor de %.2f\n",
                nombre, altura, peso,imc
                );
    }

    public static void metodo(){

    }

    public static float calculoIMC(float peso, float altura){
        return (float) (peso / Math.pow(altura,2));
    }

    public static double metodoRetorno(int operando){
        System.out.println("Ejecutando cosas con retorno");
        return operando*2;
    }
    public static void nombreMetodo(int parametro1, String parametro2) {
        System.out.println("Ejecutando el primer ejercicio");
        System.out.println("El numero que te han pasado es "+parametro1);
        System.out.println("La palabra que te han pasado es "+parametro2);
    }

}
