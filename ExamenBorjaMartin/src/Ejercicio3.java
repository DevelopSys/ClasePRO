import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica un numero");
        int numeroUsuario = lector.nextInt();
        if (numeroUsuario>99 && numeroUsuario<1000){
            // calculos
            int centenas = numeroUsuario/100;
            int decenas = (numeroUsuario%100)/10;
            int unidades = (numeroUsuario%10);
            boolean armstrongOK = numeroUsuario == (Math.pow(centenas,3)+Math.pow(decenas,3)+Math.pow(unidades,3));
            if(armstrongOK){
                System.out.println("Es armstrong");
            } else {
                System.out.println("No es armnstring");
            }

        } else {
            System.out.println("Numero no valido, se para el sistema");
        }
        lector.close();
    }
}
