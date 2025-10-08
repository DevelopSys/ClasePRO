import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Juego de la loteria");
        // 0- 0.999999999999
        // 1000-9999
        int numeroLoteria = (int) ((Math.random()*9000)+1000);
        System.out.println("Que numero es el que juegas");
        int numeroPropio = lectorTeclado.nextInt();

        if (numeroPropio<1000 || numeroLoteria>9999){
            System.out.println("no puedes jugar, numero incorrecto");
        } else {
            // 1234
            int unidadesL = ((numeroLoteria%1000)%100)%10;
            int decenasL = ((numeroLoteria%1000)%100)/10;
            int centenasL = (numeroLoteria%1000)/100;
            int millaresL = numeroLoteria/1000;

            int unidadesP = ((numeroPropio%1000)%100)%10;
            int decenasP = ((numeroPropio%1000)%100)/10;
            int centenasP = (numeroPropio%1000)/100;
            int millaresP = numeroPropio/1000;

            boolean unidadesB = unidadesL==unidadesP;
            boolean decenasB = decenasL==unidadesL;
            boolean centenasB = decenasL==centenasP;
            boolean millaresB = millaresL==millaresP;
            boolean completoB = numeroLoteria == numeroPropio;
        }

    }
}
