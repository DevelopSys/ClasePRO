public class Entrada {

    // variables --> propiedades, datos
    // metodos --> funcionalidad al programa
    public static void main(String[] args) {

        // PRIMITIVAS --> guardan datos simples (su tipo se escribe en minúsculas)
        // tipo nombre = valor;
        // {0,1} --> 11111111

        // numeros sin decimal
        byte numeroByte = 1;
        short numeroShort =1;
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

        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println(numeroDouble);
        System.out.println(numeroFloat);
        System.out.println(valorVerdadero);
        System.out.println(valorFalso);
        System.out.println(letra);
        System.out.println(miNombre);
        miNombre = "BMH";
        System.out.println(miNombre);

        miNombre = "Borja Martin Herrera";

    }
}



