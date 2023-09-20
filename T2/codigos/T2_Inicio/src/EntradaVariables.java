public class EntradaVariables {

    int numero = 0;
    String apellido = "Martin";

    public void metodoImprimir() {
        String correo = "borja.martin@cesjuanpablo.es";
        System.out.println(numero);
        System.out.println(apellido);
        System.out.println(correo);
        int cosa;
    }

    public void cambiarValores() {
        numero = 80;
        apellido = "Herrera";
        String correo = "otro@gmail.com";

    }


    public static void main(String[] args) {
        // no mutables
        final String CIF = "B1234567";
        // mutables
        String nombre = "Borja";
        //System.out.println(nombre);
        nombre = "Luis";
        nombre = "Jose";
        System.out.println(nombre);
        // CIF = "V1234567890";
        System.out.println(CIF);

        // numeros - entero (sin comas)
        byte numeroByte = 123;
        Byte numeroByteComplejo = 123;


        short numeroShort = 12345;

        int numeroInt = 678906789;
        long numeroLong = 234567890;

        // numeros - reales (con comas)
        float numeroFloat = 123123.0f;
        double numeroDouble = 234567890.6f;

        // boolean - (true / false)
        boolean valorTrue = true;
        boolean valorFalse = false;
        Boolean valorBoolComplejo = false;

        // letas - solo una letra -> 'a' "a"
        char letra = 'a';
        Character letraCompleja = 'b';
        // palabras - " "
        String valorPalabra = "Esto es una frase";


        System.out.printf("%s: el valor max %d el min es %d\n", "Byte", Byte.MAX_VALUE, Byte.MIN_VALUE);
        double ejemploDouble = 12345.234567;
        System.out.printf("Double: el valor del double es %.2f\n", ejemploDouble);

        System.out.println("El valor del byte es " + numeroByte);
        System.out.println("El valor del short es " + numeroShort);
        System.out.println("El valor del int es " + numeroInt);
        System.out.println("El valor del long es " + numeroLong);
        System.out.println("El valor del float es " + numeroFloat);
        System.out.println("El valor del double es " + numeroDouble);
        System.out.println("El valor del boolean es " + valorTrue);
        System.out.println("El valor del char es " + letra);
        System.out.println("El valor de la frase es " + valorPalabra);


    }
}
