public class Ejercicio13For {

    public static void main(String[] args) {
        int lado = 5;
        // +++++
        // +++++
        // +++++
        // +++++
        // +++++

        // fila
        for (int i = 0; i < lado; i++) {
            // columna
            for (int j = 0; j < lado; j++) {
                // cuando lo pongo cuando la 1 o 5
                // cuando es 2,3,4 la primera y ultima col

                if (i==0 || i==lado-1){
                    System.out.print("+");
                } else if (i>0 && j<5){
                    if (j==0){
                        System.out.print("+");
                    }
                    if (j==4){
                        System.out.print("+");
                    }
                    if (j>0 || j<4) {
                        System.out.print("-");
                    }
                }



            }
            System.out.println();
        }
    }
}
