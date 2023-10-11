package ejerciciosfor;

public class Ejercicio4 {

    public static void main(String[] args) {
        // 1-10
        int numeroUno = 3;
        int numeroDos = 7;
        for (int i = numeroUno; i <= numeroDos; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j = 0; j <= 10; j++) {
                System.out.printf("\t%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
