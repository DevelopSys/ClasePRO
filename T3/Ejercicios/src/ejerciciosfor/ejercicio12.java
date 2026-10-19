package ejerciciosfor;

public class ejercicio12 {
    public static void main(String[] args) {

        // * aristas
        // - interior
        int tamanio = 26;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio-1 || j == 0 || j == tamanio-1) {
                    System.out.print("*\t");
                }else {
                    System.out.print("o\t");
                }
            }
            System.out.println();
        }
    }
}
