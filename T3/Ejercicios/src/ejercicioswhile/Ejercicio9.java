package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int modulo = 0;
        int base = 16;
        String conversion = "";
        lector.close();

        while (numero >= base) {
            modulo = numero % base;
            numero /= base;
            if (base == 16) {
                switch (modulo) {
                    case 10 -> {
                        conversion = "A" + conversion; // 0000
                    }
                    case 11 -> {
                        conversion = "B" + conversion; // 0000
                    }
                    case 12 -> {
                        conversion = "C" + conversion; // 0000
                    }
                    case 13 -> {
                        conversion = "D" + conversion; // 0000
                    }
                    case 14 -> {
                        conversion = "E" + conversion; // 0000
                    }
                    case 15 -> {
                        conversion = "F" + conversion; // 0000
                    }
                    default -> {
                        conversion = modulo + conversion; // 0000
                    }
                }
            } else {
                conversion = modulo + conversion; // 0000
            }
        }

        // if 16 switch para cambiar el 10-15 por A-F
        conversion = numero + conversion; // 10000


    }
}
