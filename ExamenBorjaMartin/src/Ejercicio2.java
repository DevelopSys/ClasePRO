import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroLoteria = (int) (Math.random() *9000)+1000;
        System.out.println("Indica con que numero juegas");
        int numeroUsuario = lector.nextInt();
        if (numeroUsuario>999 && numeroUsuario<10000){
            // juego
            System.out.println("el aleatorio es "+numeroLoteria);

            int umillarL = numeroLoteria/1000;
            int centenasL = (numeroLoteria%1000)/100;
            int decenasL = ((numeroLoteria%1000)%100)/10;
            int unidadesL = ((numeroLoteria%1000)%100)%10;

            int umillarU = numeroLoteria/1000;
            int centenasU = (numeroLoteria%1000)/100;
            int decenasU = ((numeroLoteria%1000)%100)/10;
            int unidadesU = ((numeroLoteria%1000)%100)%10;

            boolean unidadesIgual = unidadesL == unidadesU;
            boolean decenasIgual = decenasL == decenasU;
            boolean centenasIgual = centenasL == centenasU;
            boolean millarIgual = umillarL == umillarU;

            System.out.println();

        } else {
            System.out.println("Numero no valido, por lo tanto terminamos");
        }
        lector.close();
    }
}
