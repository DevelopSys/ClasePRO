import java.util.Scanner;

public class Bar {

    /*
    bebidas a 1,25€ y los bocadillos a 2,05€
    ENTRADA
    Número de bebidas: 3
    Número de bocadillos: 5

    SALIDA
    Coste de las bebidas: 3.75
    Coste de los bocadillos: 10.25
    Coste consumición: 14.0

    24500

    1d - 24h
    1h - 60m
    1m - 60s

    segundos -- minutos  121 s / 60 2 resultado (%)resto 1  121/60 = 2 121%60 = 1

    */


    /**
     * Metodo de entrada
     * Programa que ejecuta la factura de un bar
     * @author Borja Martin
     * @version 1.0
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*double facturaTotal, facturaBocadillos, facturaBebidas;
        int numeroBebidas, numeroBocadillos;
        final double precioBebida=1.25, precioBocadillo= 2.05;

        System.out.println("Cuantas bebidas queréis:");
        numeroBebidas = teclado.nextInt();
        System.out.println("Cuantos bocadillos queréis:");
        numeroBocadillos = teclado.nextInt();

        facturaBebidas = (numeroBebidas*precioBebida);
        facturaBocadillos = (numeroBocadillos*precioBocadillo);
        facturaTotal = facturaBebidas+facturaBocadillos;
        System.out.printf("El precio de los bocadillos es: %.2f%n",facturaBocadillos);
        System.out.printf("El precio de los bebidas es: %.2f%n",facturaBebidas);
        System.out.printf("El precio total de la cuenta es: %.2f%n",facturaTotal);*/

        int segundos = teclado.nextInt();

        int h = segundos / 3600;

        segundos = segundos % 3600;

        int m = segundos / 60;

        int s = segundos % 60;

        System.out.printf("La conversión es %d horas %d minutos %d segundos", h, m, s);

    }




}
