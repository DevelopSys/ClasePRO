package ejercicioswitch;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero = 6;
        switch (numero%2){
            case 0:
                System.out.println("Numero par");
                break;
            default:
                System.out.println("Impar");
        }
    }
}
