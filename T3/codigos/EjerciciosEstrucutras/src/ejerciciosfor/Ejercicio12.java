package ejerciciosfor;

public class Ejercicio12 {

    public static void main(String[] args) {
        String palabra = "programacion";
        // h(0) o(1) l(2) a(3) -> 4
        for (int i = palabra.length()-1; i >=0 ; i--) {
            System.out.print(palabra.charAt(i));
        }
    }
}
