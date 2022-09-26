public class EntradaVariables {

    public static void main(String[] args) {
        System.out.println("Tipos de variable");
        // palabras -> String siempre ""
        // si no tiene valor asignado es null
        // variable compleja
        String nombre = "Borja";
        String apellido = "null";
        // letra -> char se ponen entre ''
        // si no tiene valor de -1
        // variable primitiva
        char grupoSang = 'A';
        // números -> int
        // byte , short
        // no le doy valor es 0
        // variable primitiva
        int edad = 0;
        // numeros con decimales y grandes -> double y float
        // si no tiene valor es 0.0
        // variable primitiva
        double peso = 68.5;
        // verdadero / false --> true false
        // boolean si no le doy valor será false
        // variable primitiva
        boolean aprobado = true;

        System.out.println(nombre.length());
        System.out.println(apellido.length());
        System.out.println(edad);
        System.out.println(grupoSang);
        System.out.println(peso);
        System.out.println(aprobado);


        realizarSaludo();
    }

    /* Crear un metodo que se llame salurar y crear variables que guarden
       con vuestro nombre, apellido edad y salga por consola el saludo:

       "HOLA BORJA MARTIN, TIENES 38 AÑOS y ESTAS EN LA CLASE DE PROGRAMACION"
    * */

    public static void realizarSaludo() {

        String nombre = "Borja", apellido = "Martin";
        int edad = 38;
        System.out.println("Hola eres "+nombre+" "+apellido+", tienes "+edad+" años y estas en clase de programacion");
    }
}
