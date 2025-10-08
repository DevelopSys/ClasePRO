import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Indica el numero que quieres comprobar");
        int numeroCalcular = lectorTeclado.nextInt();
        if (numeroCalcular<100 || numeroCalcular>999){
            System.out.println("no se puede comprobar");
        } else {
            int unidades = numeroCalcular%10;
            int decenas = (numeroCalcular%100)/10;
            int centenas = numeroCalcular/100;
            boolean armstrong = (Math.pow(unidades,3)+Math.pow(decenas,3)+Math.pow(centenas,3))==numeroCalcular;
        }
    }
}
