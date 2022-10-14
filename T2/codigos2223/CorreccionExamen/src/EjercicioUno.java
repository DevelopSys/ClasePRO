import java.util.Scanner;

public class EjercicioUno {


    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido;
        int edad, altura;
        double peso, IMC;
        char sexo;

        System.out.println("Por favor introduce tu nombre");
        nombre = lecturaTeclado.next();
        System.out.println("Por favor introduce tu apellido");
        apellido = lecturaTeclado.next();
        System.out.println("Por favor introduce tu edad");
        edad = lecturaTeclado.nextInt();
        System.out.println("Por favor introduce tu altura");
        altura = lecturaTeclado.nextInt();

        System.out.println("Por favor introduce tu peso");
        peso = lecturaTeclado.nextDouble();
        System.out.println("Por favor introduce tu sexo (M/F)");
        sexo = lecturaTeclado.next().charAt(0);
        IMC = calculoIMC(peso,(double) altura/100); // calcularIMC() -->  valor del retorno
        System.out.printf("Hola Borja tu IMC teniendo en cuenta tu altura de %dcm y tu peso de %.2fkg, tiene\n" +
                "un valor de %.2f%n",altura,peso,IMC);

    }

    public static double calculoIMC(double peso, double altura){

        double IMC = peso / (altura*altura);
        //return IMC;
        //return peso / Math.pow(altura,2);
        return peso / (altura*altura);
    }

}
