package ejerciciosfor;

public class Ejercicio14 {

    public static void main(String[] args) {
        String palindromo = "aallaa";
        boolean palindromoCondicion = true;
        for (int i = 0; i < palindromo.length()/2; i++) {
            char letraA = palindromo.charAt(i);
            char letraB = palindromo.charAt(palindromo.length()-1-i);
            // todo comparacion
            if(letraA != letraB){
                palindromoCondicion = false;
                break;
            }
        }

        if (palindromoCondicion){
            System.out.println("la palabra es palindromo");
        } else {
            System.out.println("la palabra no es palindromo");
        }

    }
}
