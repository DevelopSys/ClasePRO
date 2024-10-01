public class Entrada {

    // variables
    // metodos
    public static void main(String[] args) {
        System.out.println("Iniciando el simulacro del examen");
        // dato
        int numero = 9;
        // nombreMetodo(numero,"Borja");
        // nombreMetodo(4,"Cosa");
        // nombreMetodo(9,"dato");
        // nombreMetodo(7,"casa");
        // nombreMetodo(2,"jugar");
        int resultadoTotal = (int)metodoRetorno(numero) *10; //12
        System.out.println(resultadoTotal);
    }

    public static double metodoRetorno(int operando){
        System.out.println("Ejecutando cosas con retorno");
        return operando*2;
    }
    public static void nombreMetodo(int parametro1, String parametro2) {
        System.out.println("Ejecutando el primer ejercicio");
        System.out.println("El numero que te han pasado es "+parametro1);
        System.out.println("La palabra que te han pasado es "+parametro2);
    }

}
