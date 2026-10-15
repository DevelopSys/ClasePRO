import java.util.Scanner;

public class EjercicioBases {

    public static void main(String[] args) {
        System.out.println("Indica un numero en binario");
        Scanner lector = new Scanner(System.in);
        int numeroBinario = lector.nextInt();
        int numeroDecimal =0;
        // 101101
        String binarioString = String.valueOf(numeroBinario);
        for (int i = 0; i < binarioString.length(); i++) {
            String n = String.valueOf(binarioString.charAt(i));
            int nInt = Integer.parseInt(n);
            int conversion = nInt* (int)Math.pow(8, binarioString.length()-1-i);
            numeroDecimal +=conversion;
        }
        System.out.println("el numero pasado a decimal es "+numeroDecimal);
    }
}
