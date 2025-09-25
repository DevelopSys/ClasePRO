import java.awt.geom.Arc2D;

public class Entrada {
    // Este metodo es el principal
    // mod_acceso mod_pertenecia retorno nombre(parametros){}
    // esta linea es nueva porque la necesito
    String cosaComun = "Esta cosa es comun a los dos metodos";

    /**
     * @param args
     * @return
     * @version
     * @author
     */
    public static void main(String[] args) {
        // palabras
        /*
        Object elemento = false;
        String nombreCompleto = "Borja";

        nombreCompleto = "Borja Martin";

        final String NOMBRE_CLASE = "PROGRMACION";


        // letras
        Character letraCompleja = 'R';
        char letraDNI = 'a';
        letraDNI = 'b';
        letraDNI = 123;
        // boolean
        Boolean aciertoComplejo = false;
        boolean acierto = true;
        acierto = false;

        // numeros enteros
        Integer edadComplejo = 8;
        int edad = 41;
        edad = 42;

        // numeros con decimales
        Float alturaCompleja = 1.90f;
        float altura = 1.80f;

        Double pesoComplejo = 2.98;
        double peso = 70.89;
        peso = 45.98;


        System.out.println("Primer programa en JAVA");
        // aqui tengo un error que creo que va por esta cosa
        System.out.print("\t\tEsta es la segunda linea\n");
        System.out.println("Mi nombre es "+nombreCompleto);
        // System.out.println("Mi nombre es Borja Martin");
        // todo tengo que declarar las variabes y reorganizarlas
        */
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 41;
        float altura = 1.71123f;

        // Mi nombre es Borja Martin tengo 41 años y mido 1.71123 cm
        System.out.println("Mi nombre es " + nombre
                + " " + apellido + " tengo " + edad + " años y mido " + altura + " cm");

        // %s
        // %s
        // %d
        // %f
        System.out.printf("Mi nombre es %s %s y tengo %d años. Mido %.2f cm\n",
        nombre,apellido,edad,altura);


        // System.out.println(cosaComun);
        // System.out.println(Integer.MAX_VALUE);
    }

    public void metodoUno() {
        String dato = "Dato para poder acceder a el";
        System.out.println(dato);
        System.out.println(cosaComun);
    }

    public void metodoDos() {
        int nVeces = 5;
        System.out.println(cosaComun);
        System.out.println("El numero de veces es " + nVeces);
    }

    /*
    Este comentario me vale para poder escribir un rato
    sin necesidad de poner todo el rato
    cuidado con este tipo de comentarios
     */

}
