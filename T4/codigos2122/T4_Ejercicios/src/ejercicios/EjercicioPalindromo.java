package ejercicios;

public class EjercicioPalindromo {

    public static void main(String[] args) {
        String frase = "Alli ve Sevilla";
        boolean isPalindromo = false;
        frase = frase.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < frase.length() / 2; i++) {
            //System.out.println(frase.charAt(i));

            if (frase.charAt(i) == frase.charAt(frase.length() - 1 - i)) {
                isPalindromo = true;

            } else {
                isPalindromo = false;
                break;
            }
        }

        if (isPalindromo){
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }
    }
}
