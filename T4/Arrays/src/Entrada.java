

public class Entrada {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        // 0 0 0 0 0 0 0 0 0 0 0
        // cuantas posiciones tienes
        // System.out.println("La longitud es "+numeros.length);
        // 0 0 0 7
        // numeros[3] = 7;
        // System.out.println("El numero en la ultima posicion es "+numeros[numeros.length-1]);

        String[] palabras = {"Hola", "Que", "tal", "Estas", "esto", "es", "una", "prueba"};
        // System.out.println("la palabra en la ultima posicion es "+palabras[palabras.length-1]);

        // sacar todas las palabras que estan en el array,
        // imaginar que tengo 4000000000

        // puedo modificar el contenido del array en un for
        /*for (int i = 0; i < palabras.length; i++) {
            System.out.println("La palabra es "+palabras[i]);
        }*/

        // rellenar el array de numeros con aleatorios de entre 0 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }

        // recorrer una coleccion, donde indico princio y final
        /*for (int i = 0; i < numeros.length/2; i++) {
            // los numeros que estan en posicion par

            // los numeros que son pares
            if (numeros[i]%2==0){
                System.out.println(numeros[i]);
            }
        }*/
        for (int item : numeros) {
            if (item % 2 == 0) {
                System.out.println(item);
            }
            if (item == 50){
                break;
            }
        }

    }
}
