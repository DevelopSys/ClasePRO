public class Ejercicio6 {

    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 2;
        int numero3 = 6;
        int numero4 = 0;

        if (condicionNumero(numero1)
                && condicionNumero(numero2)
                && condicionNumero(numero3)
                && condicionNumero(numero4)) {

            double inversoUno = 0.0, inversoDos = 0.0, inversoTres = 0.0, inversoCuatro = 0.0;


            inversoUno = calculoInverso(numero1);
            inversoDos = calculoInverso(numero2);
            inversoTres = calculoInverso(numero3);
            inversoCuatro = calculoInverso(numero4);

            System.out.printf("La suma de los inversos de %.2f + %.2f +%.2f +%.2f = %.2f%n",
                    inversoUno, inversoDos, inversoTres, inversoCuatro, inversoUno + inversoDos + inversoTres + inversoCuatro);


        } else {
            System.out.println("Alguno no está en rango");
        }
    }

    private static double calculoInverso(int numero) {
        if (numero != 0) {
            return (double) 1 / numero;
        } else {
            return 0.0;
        }
    }

    private static boolean condicionNumero(int numero) {
        return numero >= -100 && numero < 100;
    }


}
