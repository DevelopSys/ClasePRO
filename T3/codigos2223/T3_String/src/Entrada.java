public class Entrada {

    public static void main(String[] args) {
        //evaluacionPalabras();
        //ejercicioPalindromo();
        operacionPalabras();

    }

    private static void operacionPalabras() {
        String palabra = "Esto es un ejemplo con espacios y acentóós";
        palabra = palabra.replaceAll("ó","o");
        palabra = palabra.replaceAll(" ","");
        palabra = palabra.toLowerCase();
        System.out.println(palabra);
    }

    private static void ejercicioPalindromo() {
        String palabra = "radar";
        String palabraInversa = "";

        /*for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraInversa = palabraInversa + palabra.charAt(i);
        }
        if (palabra.equals(palabraInversa)){
            System.out.println("Palindromo");
        } else {
            System.out.println("No palindromo");
        }*/


         // Alli ves Sevilla
        boolean isPalindromo = false;
        for (int i = 0; i < palabra.length()/2; i++) {
            //System.out.print(palabra.charAt(i));
            char letra = palabra.charAt(i);
            char letraEspejo = palabra.charAt((palabra.length()-1)-i);
            if (letra == letraEspejo){
                isPalindromo = true;
            }
            else {
                isPalindromo = false;
                break;
            }
            // palabra.charAt(0) vs palabra.charAt(4); i =0
            // palabra.charAt(1) vs palabra.charAt(3); i =1
        }
        if (isPalindromo){
            System.out.println("Es palindromo");
        }


    }

    private static void evaluacionPalabras() {
        // p a l a b r a
        String palabra = "palabras de prueba para programacion";
        char letra = palabra.charAt(4); // letra en la posicion indicada
        palabra.length(); // cuantas letras hay
        //System.out.println(letra);

        // sacar todas las letras una a una???
        for (int i = palabra.length()-1; i >= 0; i--) {
            char letraPalabra = palabra.charAt(i);
            System.out.print(letraPalabra);
        }

        // oro - p
        // radar - p
        // prueba
        // UNA PALABRA ES PALIDROMO???
    }
}
