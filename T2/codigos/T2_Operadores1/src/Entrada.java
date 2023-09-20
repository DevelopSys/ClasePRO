public class Entrada {

    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 6;
        /*numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero--;
        numero--;
        numero--;
        numero = -numero;*/
        int suma = numeroUno+numeroDos;
        int resta = numeroUno-numeroDos;
        int multi = numeroUno*numeroDos;
        double division = (double)numeroUno/numeroDos;
        int modulo = numeroUno%numeroDos;
        System.out.printf("El resultado de la suma es %d\n",suma);
        System.out.printf("El resultado de la resta es %d\n",resta);
        System.out.printf("El resultado de la multip es %d\n",multi);
        System.out.printf("El resultado de la division es %.2f\n",division);
        System.out.printf("El resultado de la modulo es %d\n",modulo);

    }
}
