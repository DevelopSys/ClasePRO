package ejerciciosif;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero = 200;

        if (numero%20==0){
            if (numero>=-100 && numero<=100){
                System.out.println("El numero es multiplo y esta en rango");
            } else {
                System.out.println("El numero es multiplo y no esta en rango");
            }
        } else {
            if (numero>=-100 && numero<=100){
                System.out.println("El numero no es multiplo y esta en rango");
            } else {
                System.out.println("El numero no es multiplo y no esta en rango");
            }
        }
    }
}
