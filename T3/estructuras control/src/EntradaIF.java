public class EntradaIF {

    public static void main(String[] args) {
        int nota = -6;
        // if -> 0-10 -> nota correcta
        String mensaje = null;
        if (nota >= 0 && nota <= 10) {
            System.out.println("La nota es correcta");
            if (nota<5){
                System.out.println("SS");
            } else if (nota<7) {
                System.out.println("AP");
            } else if (nota<9) {
                System.out.println("NT");
            } else if (nota<10) {
                System.out.println("SB");
            } else {
                System.out.println("MH");
            }

        } else {
            System.out.println("La nota no es correcta");
        }
        String palabra1 = "Hola";
        String palabra2 = "Hola que tal";
        // replace
        palabra2 = palabra2.replaceAll(" ","_");
        // "Holaquetal"

        // son iguales equals
        // boolean iguales = palabra1.equals(palabra2);
        // boolean igualesCAP = palabra1.equalsIgnoreCase(palabra2);
        // pasar a mayusculas o a minusculas
        //palabra1 = palabra1.toUpperCase();
        // System.out.println(palabra1);
        // palabra1.toUpperCase();
        // contiene
        // boolean contiene = palabra1.contains("que");
        // cuantas letras hay:
        // palabra1.length();
        // sacar una letra de una palabra
        // palabra1.charAt(0);
        // Sacar todas las letras de una palabra
        // [0,3]
        for (int i = 0; i < palabra2.length(); i++) {
            char letra = palabra2.charAt(i);
            System.out.println(letra);
        }

        System.out.println("Terminando la ejecucion");


    }
}
