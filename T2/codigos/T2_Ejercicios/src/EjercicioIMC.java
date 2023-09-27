import java.util.Scanner;

public class EjercicioIMC {

    int numero = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu altura (en m)");
        double altura = scanner.nextDouble();
        System.out.println("Dime tu peso");
        double peso = scanner.nextDouble();
        double imc = calcularIMC(altura,peso);
        boolean enPeso = imc<23.9;
        System.out.printf("El IMC calculado es %.2f \n",imc);
        System.out.println("Estas en peso "+enPeso);


    }
    public static double calcularIMC(double altura, double peso){
        double imc = peso / Math.pow(altura,2);
        return imc;
    }


}
