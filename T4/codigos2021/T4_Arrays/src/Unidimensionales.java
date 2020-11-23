public class Unidimensionales {

    public static void main(String[] args) {

        int numero = 5;
        double numero2 = 8;
        String palabra = "Lo que sea";
        boolean acierto = false;
        char letra = 'a';

        // tipo[] nombre = {};
        // tipo[] nombre = new tipo[8];
        // tamaño finito
        boolean[] aciertos = {true,false,true,false};
        boolean[] aciertosPosiciones = new boolean[2];
        //int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int[] numerosPosiciones = new int[10];
        String[] palabras = {"Hola","que","tal","estas"};
        String[] palabrasPosiciones = new String[20];
        Object[] cosas = {1,"asd",false,0.0};
        Object numeroObj = 2;

        // acceso a elementos

        int[] numeros = {1,23,4,5,6,7,8,9,7};
        int sumatorio=0;
        numeros[10]=123;
        //System.out.println(numeros[1]);
        /*numeros[2] = 0;
        for (int items:numeros) {
            System.out.println(items);
        }*/
        //numeros = new int[numeros.length];
        /*for (int i=0;i<numeros.length;i++){
            numeros[i]=0;
        }*/
        /*for (int items:numeros) {
            System.out.println(items);
        }*/
        //for (int i=0;i<numeros.length;i++){
            /*if (i%2 != 0){
                System.out.println(numeros[i]);
            }*/
            //sumatorio += numeros[i];
        //}

        /*for (int item:numeros) {
            if (item%2==0){
                System.out.println(item);
            }
        }*/

        /*for (int i=0;i<numeros.length;i++){
            sumatorio += numeros[i];
        }*/

        /*for (int item :numeros) {
            sumatorio += item;
        }*/

        //System.out.println(sumatorio);

        // cuando es tipo primitivo los valores son el mínimo
        // la primera posicion siempre es el 0, longitud (10) -1
        //System.out.println(numeros);
        //System.out.println(numeros[9]);
        //System.out.println(aciertos[1]);
        //numeros.length; --> numero de elementos de la colección
        /*for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }*/
        /*for ( int item : numeros) {
            System.out.println(item);
        }*/
        // obtener la suma de todos los elementos del array


    }
}
