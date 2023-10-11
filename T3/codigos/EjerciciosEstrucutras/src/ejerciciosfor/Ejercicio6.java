package ejerciciosfor;

public class Ejercicio6 {

    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 1000;

        for (int i = numeroUno; i < numeroDos; i++) {
            // pares
            if (i%2==0){
                System.out.println(i);
            }
            // impares
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
