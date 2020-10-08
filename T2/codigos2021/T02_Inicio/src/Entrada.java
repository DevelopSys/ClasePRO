import java.util.Scanner;

public class Entrada {

    // variables --> propiedades, datos
    // metodos --> funcionalidad al programa
    public static void main(String[] args) {

        // PRIMITIVAS --> guardan datos simples (su tipo se escribe en minúsculas)
        // tipo nombre = valor;
        // {0,1} --> 11111111

        // numeros sin decimal
        byte numeroByte = -126;
        short numeroShort = 1;
        int numeroInt = 1;
        long numeroLong = 1;

        // numero con decimal
        double numeroDouble = 2.5;
        float numeroFloat = 2.5f;

        // booleana --> falso o verdadero
        boolean valorVerdadero = true;
        boolean valorFalso = false;

        // letra --> con comilla simple ''
        char letra = 'a';

        // COMPLEJAS

        // palabas --> con comilla doble ""
        String miNombre = "Borja Martin";

        // VARIABLE CONSTANTE

        final String EMPRESA = "CES JPII";

        //System.out.println(numeroByte);
        //System.out.print(numeroByte);
        // Numero Byte: XXXXX Valor minimo: XXXXXX Valor máximo: XXXXXXX

        /*
         *
         * */
        //System.out.println("Número Byte:\t" + numeroByte+"\tloquesea");
        //System.out.println("Número Short:\t" + numeroShort);
        System.out.println("Número byte: " + numeroByte + "\tValor mínimo: "
                + Byte.MIN_VALUE + "\tValor máximo: " + Byte.MAX_VALUE);

        System.out.println("Número short: " + numeroShort + "\t\tValor mínimo: "
                + Short.MIN_VALUE + "\tValor máximo: " + Short.MAX_VALUE);

        System.out.println("Número integer: " + numeroInt + "\tValor mínimo: "
                + Integer.MIN_VALUE + "\tValor máximo: " + Integer.MAX_VALUE);

        System.out.println(valorVerdadero);
        System.out.println(valorFalso);
        System.out.println(letra);
        System.out.println(miNombre);


        Scanner teclado = new Scanner(System.in);
        String lectura = teclado.next();
        System.out.println(lectura);
        /*
        * Introduce tu nombre
        * Borja
        * Introduce tu apellido
        * Martin
        * Introduce tu edad
        * 18
        * Hola Borja Martin tu edad es 18
        * */




    }
}



