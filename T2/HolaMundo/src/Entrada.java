public class Entrada {

    // Este metodo es el principal
    // mod_acceso mod_pertenecia retorno nombre(parametros){}
    // esta linea es nueva porque la necesito

    /**
     * @param args
     * @return
     * @version
     * @author
     */
    public static void main(String[] args) {

        // palabras
        String nombreCompleto = "Borja";
        nombreCompleto = "Borja Martin";

        // letras
        char letraDNI = 'a';
        letraDNI = 'b';
        letraDNI = 123;
        // boolean
        boolean acierto = true;
        acierto = false;
        // numeros enteros
        int edad = 41;
        edad = 42;
        // numeros con decimales
        float altura = 1.80f;
        double peso = 70.89;

        System.out.println("Primer programa en JAVA");
        // aqui tengo un error que creo que va por esta cosa
        System.out.print("\t\tEsta es la segunda linea\n");
        System.out.println("Mi nombre es "+nombreCompleto);
        // System.out.println("Mi nombre es Borja Martin");
        // todo tengo que declarar las variabes y reorganizarlas
    }

    /*
    Este comentario me vale para poder escribir un rato
    sin necesidad de poner todo el rato
    cuidado con este tipo de comentarios
     */

}
