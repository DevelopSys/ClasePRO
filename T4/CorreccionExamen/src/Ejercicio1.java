import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = {"adios","copas","eneko"};
        String palabrasJuego = palabras[(int) (Math.random()*palabras.length)];
        System.out.println(palabrasJuego);
        System.out.println("Comenzamos el juego");
        boolean adivinada = false;
        int acierto =0, aprox = 0, fallos =0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Intento numero "+(i+1));
            System.out.println("Indica la palabra que intenas");
            String palabraUsuario = scanner.next();
            if (palabraUsuario.equals(palabrasJuego)){
                System.out.println("Palabra adiviada");
                adivinada = true;
                acierto = 5;
                aprox =0;
                break;
            } else {

                for (int j = 0; j < 5; j++) {
                    if (palabraUsuario.charAt(i) == palabrasJuego.charAt(i)){
                        acierto++;
                    } else {
                        for (int k = 0; k < palabrasJuego.length(); k++) {
                            if (palabrasJuego.charAt(k) == palabraUsuario.charAt(j)){
                                aprox++;
                            }
                        }
                    }
                    fallos = palabrasJuego.length()-acierto-aprox;

                }

            }
        }

        if (!adivinada){
            System.out.println("Perdistem la palabra era "+palabrasJuego);
        }
    }
}

