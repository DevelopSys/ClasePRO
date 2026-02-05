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
        System.out.println("Suma " + resultados[0]);
        System.out.println("Resta " + resultados[1]);
        System.out.println("Multi " + resultados[2]);
        System.out.println("Div " + resultados[3]);
        this.resultados.add(resultados);
        System.out.println("Quieres repetir operenacions (1-SI 2-NO)");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }

    public int sumar(int op1, int op2) {
        return op1 + op2;
    }

    public int resta(int op1, int op2) {
        return op1 - op2;
    }

    public int division(int op1, int op2) throws ArithmeticException {
        return op1 / op2;
    }

    public int multiplicacion(int op1, int op2) {
        return op1 * op2;
    }
}
