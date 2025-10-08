public class EntradaForeach {

    public static void main(String[] args) {

        int[] numeros = new int[5]; // [0,0,0,0,0]
        int[] numerosLlenos = {7, 8, 10, 20}; // [7,8,10,20]

        for (int i = 0; i < numerosLlenos.length; i++) {
            System.out.println(numerosLlenos[i]);
        }
        int contador = 0;
        for (int item : numerosLlenos) {
            if (item % 2 == 0) {
                contador++;
                System.out.println(item);
                if (contador==2){
                    break;
                }
            }
        }

    }
}
