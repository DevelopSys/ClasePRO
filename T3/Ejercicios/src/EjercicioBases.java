import java.util.Scanner;

public class EjercicioBases {

    public static void main(String[] args) {
        System.out.println("Indica un numero en hexadecimial");
        Scanner lector = new Scanner(System.in);
        String hexadecimal = lector.nextLine();
        lector.close();
        int numeroDecimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char letra = hexadecimal.charAt(i);
            int numeroConvesion = 0;
            switch (letra) {
                case 'A' -> numeroConvesion = 10;
                case 'B' -> numeroConvesion = 11;
                case 'C' -> numeroConvesion = 12;
                case 'D' -> numeroConvesion = 13;
                case 'E' -> numeroConvesion = 14;
                case 'F' -> numeroConvesion = 15;
                default -> numeroConvesion = Integer.parseInt(String.valueOf(letra));
            }
            numeroDecimal += numeroConvesion * Math.pow(16,hexadecimal.length()-1-i);
        }
        System.out.println("El numero en decimal es "+numeroDecimal);
        /*int numeroBinario = lector.nextInt();
        int numeroDecimal =0;
        // 101101
        String binarioString = String.valueOf(numeroBinario);
        for (int i = 0; i < binarioString.length(); i++) {
            String n = String.valueOf(binarioString.charAt(i));
            int nInt = Integer.parseInt(n);
            int conversion = nInt* (int)Math.pow(8, binarioString.length()-1-i);
            numeroDecimal +=conversion;
        }
        System.out.println("el numero pasado a decimal es "+numeroDecimal);*/
    }
}
