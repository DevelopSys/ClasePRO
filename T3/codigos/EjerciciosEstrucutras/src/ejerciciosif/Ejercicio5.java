package ejerciciosif;

public class Ejercicio5 {

    public static void main(String[] args) {
        int numero = 1221;
        int millares1 = numero/1000; // 3
        int resto = numero%1000;
        int centenas1 = resto/100; // 4;
        System.out.println(millares1);
        System.out.println(centenas1);
        resto = resto%100;
        int decenas1 = resto/10; // 4;
        System.out.println(decenas1);
        int unidades1 = resto%10; // 4;
        System.out.println(unidades1);
        System.out.println();
        String numeroPalabra = String.valueOf(numero); // 3452

        if (numero >= 1000 && numero <= 9999) {

            int millares = numero/1000; // 3
            int centenas = (numero%1000)/100; // 4;

            if (numeroPalabra.charAt(0) == numeroPalabra.charAt(3)
                    && numeroPalabra.charAt(1) == numeroPalabra.charAt(2)) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        } else {
            System.out.println("Numero fuera del rango");
        }
    }
}
