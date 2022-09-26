/* Esto es un comentario que me va a ocupar
 * varias línas porque la expliación es algo
 * extensa */

public class Entrada {

    // ámbito clase
    public static String miNombreClase = "BorjaClase";

    // método para ver características de ámbitos
    // esto es la segunda linea del comentario
    /* Esto es un comentario que me va a ocupar
    * varias línas porque la expliación es algo
    * extensa */
    public static void metodoInicial(){
        // tipo_acceso tipo_de_la_variable nombre_de_variable = valor_variable
        // String guarda palabras ""
        System.out.println("Ejecutando método inicial");
        String nombre = "Borja";
        System.out.println(nombre);
        System.out.println(miNombreClase);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // ámbito de bloque o método
        String miNombre = "Borja";
        miNombre = "BorjaM";
        miNombre = "BorjaMH";
        System.out.println("Hola Mundo");
        System.out.println(miNombre);
        System.out.println(miNombreClase);

        // ejecutar
        metodoInicial();

    }



}
