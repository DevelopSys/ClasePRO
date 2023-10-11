package ejerciciosfor;

public class Ejercicio5 {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 4;



        if (base == 0 && exponente == 0) {
            System.out.println("No se puede calcular error");
        } else {
            int resultado = 1;
            // 2 * 2 * 2 * 2
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println(resultado);
        }

    }
}
