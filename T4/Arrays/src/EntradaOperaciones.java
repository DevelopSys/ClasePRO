import java.util.Scanner;

public class EntradaOperaciones {

    public static void main(String[] args) {
        Object[] cosas = {5, "dam", true, 'a', 5.9, 7};
        /*for (int i = 0; i < cosas.length; i++) {
            ((String) cosas[i]).length();
            if (cosas[i] instanceof String){
                System.out.println(cosas[i]);
                System.out.println("La longitud de la palabra es "
                +((String) cosas[i]).length());
            }
        }*/

        // busquedas -> {1,2,3,4,3123,12,31,23,124,234,234}
        // 7 -> recorro y termino cuando encuentro. Lo he encontrado cuando item == elemento
        int[] numeros = {123, 123234, 565, 6543, 3, 4, 567, 54, 323, 456};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres buscar");
        // if (!estaNumero(numeroUsuario,numeros)){
        boolean respuesta;
        do{
            int numeroUsuario = scanner.nextInt();
            respuesta = estaNumero(numeroUsuario,numeros);
        } while (!respuesta);



    }

    public static boolean estaNumero(int numeroBuscar, int[] conjunto) {

        // {4,7,1,9,3}
        // 8

        for (int item : conjunto) {
            if (item == numeroBuscar){
                System.out.println("Numero encontrado");
                return true;
            }
        }

        return false;
    }
}
