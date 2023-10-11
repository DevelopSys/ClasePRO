package ejerciciosfor;

public class Ejercicio14 {

    public static void main(String[] args) {
        // r(0) a(1) d(2) y(3) r(4) -> 5 -> 2
        String palabra = "radar";
        boolean isPalindromo = false;
        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) == palabra.charAt(palabra.length()-1-i)){
                isPalindromo = true;
            } else {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo){
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra  no es palindromo");
        }

    }
}
