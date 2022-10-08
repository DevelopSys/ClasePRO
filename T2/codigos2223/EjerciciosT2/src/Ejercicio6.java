import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);

        final double PRECIO_BEBIDA = 1.25;
        final double PRECIO_BOCADILLO = 2.05;

        System.out.println("Numero de bebidas:");
        int bebidas = lecturaTeclado.nextInt();
        System.out.println("Numero de bocadillos:");
        int bocadillos = lecturaTeclado.nextInt();

        double costeBocadillos = bocadillos * PRECIO_BOCADILLO;
        double costeBebidas = bebidas * PRECIO_BEBIDA;
        double costeTotal = costeBebidas + costeBocadillos;

        System.out.println("Coste de las bebidas: "+(bebidas * PRECIO_BEBIDA));
        System.out.println("Coste de los bocadillos: "+costeBocadillos);
        System.out.println("Coste de la consumición: "+ costeTotal);


    }
}
