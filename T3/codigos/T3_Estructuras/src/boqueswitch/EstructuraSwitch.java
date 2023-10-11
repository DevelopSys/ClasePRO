package boqueswitch;

public class EstructuraSwitch {

    public static void main(String[] args) {
        int numero = 3;
        String palabra;
        switch (numero) {
            case 1:
                palabra = "palabra 1";
                System.out.println("El valor del numero es 1");
                break;
            case 2:
                palabra = "palabra 2";
                System.out.println("El valor del numero es 2");
                break;
            case 3:
                palabra = "palabra 3";
                System.out.println("El valor del numero es 3");
                break;
            default:
                palabra = "palabra sin";
                System.out.println("El valor del numero es no esta contemplado");
        }
        //System.out.println(palabra);

        System.out.println("La palabra resultantate es; "+palabra);
        System.out.println("Ejecutado fuera del switch numerico");
        System.out.println("Ejecutando switch de string");
        char letra;
        switch (palabra) {

            case "palabra 1":
                letra = 'A';
                break;
            case "palabra 2":
                letra = 'B';
                break;
            case "palabra 3":
                letra = 'C';
                break;
            default:
                letra = 'D';
        }

        System.out.println("La letra resultantate es; "+letra);
        System.out.println("Ejecutando fuera del bloque switch palabra");
        System.out.println("Ejecutando del bloque switch letra");

        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
        }


    }
}
