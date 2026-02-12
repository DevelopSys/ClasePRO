import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {

    // crear tantos metodos como operaciones necesite
    // obtiene como imput dos operandos
    // da como resultado un numero

    // gestiona el arrayList de resultados
    private ArrayList<int[]> resultados;

    // poner a cada metodo lo que puede fallar

    public Operaciones() {
        resultados = new ArrayList<>();
    }

    public int agregarResultados(int[] resultados) {
        System.out.println("Los resultados son ");
        mostrarDatos(resultados);
        this.resultados.add(resultados);
        System.out.println("Quieres repetir operenacions (1-SI 2-NO)");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }

    public void mostrarDatos(int[] result) {
        System.out.println("Suma " + result[0]);
        System.out.println("Resta " + result[1]);
        System.out.println("Multi " + result[2]);
        System.out.println("Div " + result[3]);
    }

    public void buscarResultado(int posicion) {

        int[] resultadoBusqueda = null;
        try {
            resultadoBusqueda = resultados.get(posicion);
        } catch (IndexOutOfBoundsException e) {
            resultadoBusqueda = resultados.getLast();
        } finally {
            mostrarDatos(resultadoBusqueda);
        }


    }

    public void mostrarResultados() {
        /*
        for (int[] item: resultados) {
            mostrarDatos(item);
        }

         */
        resultados.forEach(this::mostrarDatos);
    }

    public int sumar(int op1, int op2) {
        return op1 + op2;
    }

    public int resta(int op1, int op2) {

        int resta = 0;
        try {
            resta = op1 - op2;
            if (resta < 0) {
                // exception
                throw new ResultadoExeption("El resultado de la operacion es negativo " + resta);
            }
        } catch (NullPointerException e) {
            resta = 0;
            System.out.println(e.getMessage());
        }
        return resta;
    }

    public int division(int op1, int op2) throws ArithmeticException {
        return op1 / op2;
    }

    public int multiplicacion(int op1, int op2) {
        return op1 * op2;
    }
}
