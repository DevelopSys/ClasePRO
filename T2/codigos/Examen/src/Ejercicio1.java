import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = scanner.next();
        System.out.println("Introduce el apellidp");
        String apellido = scanner.next();
        System.out.println("Introduce la edad");
        int edad = scanner.nextInt();
        System.out.println("Introduce el sexo (M/F)");
        char sexo = scanner.next().charAt(0);
        System.out.println("Introduce altura");
        double altura = scanner.nextDouble();
        System.out.println("Introduce peso");
        double peso = scanner.nextDouble();
        double imc = new Ejercicio1().calcularIMC(peso,altura);
        System.out.printf("Hola %s tu IMC teniendo en cuenta tu " +
                "altura de %dcm y tu peso de %.1fkg, tienen valor de %.2f\n",nombre,(int)(altura*100),peso,imc);
        // “Hola Borja tu IMC teniendo en cuenta tu altura de 174cm y tu peso de 68kg, tiene
        //un valor de 19,54”
    }

    public double calcularIMC(double peso, double altura){
        double imc = peso / Math.pow(altura,2);
        return imc;
    }

}
