import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String palabraMaestra = "";
        String palabraSecundaria = "";
        System.out.println("Introduce palabra maestra");
        palabraMaestra = lectura.next();
        System.out.println("Palabra maestra "+palabraMaestra);

        // ¿esta contenida?

        // "programacion" --> "programacion" palabraMaestra.equals(palabraSecundaria) --> true
        // "programacion" --> "apro" palabraMaestra.contains(palabraSecundaria) --> true

        //palabraMaestra.contains(palabraSecundaria);
        /*do{
            System.out.println("Introduce palabra secundaria");
            palabraSecundaria = lectura.next();
        }while (!palabraMaestra.contains(palabraSecundaria));

        System.out.println("El numero de letras de la maestra es: "+palabraMaestra.length());*/



        // "propamacion" --> "pa" palabraMaestra.contains(palabraSecundaria) --> true

        // coincide completa
        if (palabraMaestra.equals(palabraSecundaria)) {
            for (int i = palabraMaestra.length()-1 ; i >=0; i--) {
                System.out.println(palabraMaestra.charAt(i));
            }
        }


        // coincide parte
        int contadorAciertos=0;

        for (int i = 0; i < palabraMaestra.length(); i++) {

            if (palabraMaestra.charAt(i) == palabraSecundaria.charAt(contadorAciertos)){
                contadorAciertos++;
                if(contadorAciertos==palabraSecundaria.length()){
                    break;
                }
            } else {
                contadorAciertos=0;
            }


        }






    }
}
