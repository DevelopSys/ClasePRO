public class Documentacion {

    /*
    * Varias lineas
    * */

    // TODO ejecucion pendiente

    /**
     * Metodo destinado a ejecutar algo
     * @version 1.0
     * @author Borja Martin Herrera
     */
    public void metodoUno(){
        // ejecuciones
    }


    /**
     * Metodo destinado a ejecutar algo con parametros
     * @version 1.0
     * @author Borja Martin Herrera
     * @param numero esto vale para declarar un numero
     * @param palabra esto vale para declarar una palabra
     * @return me devuleve el numero de ejecuciones
     */
    public int metodoDos(String palabra, int numero){
        // ejecuciones
        // devuelve algo
        return 10;
    }

    public static void main(String[] args) {

        System.out.println("Código del examen");
        System.out.printf("La nota que voy a sacar es: %d%n", nota);
        int nota = 10;
        int numeroUno = 10;
        double numeroDos = 12.50;
        boolean aprobado = true;
        boolean suspenso = false;
        char letra = "hola";
        aprobado = "true";

        boolean condicionalUno = (nota > 0 && nota<10) || aprobado == true;
        boolean condicionalDos = (nota == 0 || nota!=10) && suspenso == true;

        System.out.printf("Las condiciones son: " +
                "Condicional uno: %b%n" +
                "Condicional dos: %b%n" +
                "Numero dos: %d%",condicionalUno,condicionalDos,nota);
    }



}
