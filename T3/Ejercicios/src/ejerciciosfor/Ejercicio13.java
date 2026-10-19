package ejerciciosfor;

public class Ejercicio13 {


    public static void main(String[] args) {
        String palabra = "programacion";
        for (int i = palabra.length(); i >=0 ; i--) {
            char letra = palabra.charAt(i);
            System.out.println(letra);
        }

    }
}
