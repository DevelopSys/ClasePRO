package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int aleatorio;
        int maximo=-1;
        int numeros=0;
        do {
            aleatorio = (int) (Math.random()*101);
            numeros++;
            /*if(aleatorio>maximo)
                maximo = aleatorio;*/
            maximo = aleatorio>maximo ? aleatorio : maximo;
        }while (aleatorio!=0);
        System.out.println("El maximo de los generados es "+maximo);
    }
}
