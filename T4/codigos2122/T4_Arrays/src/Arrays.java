public class Arrays {
    public static void main(String[] args) {
        // array de numeros
        int[] numeros = new int[10];
        boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double[] decimales = new double[2];
        int[] numerosDos = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // tipo[]cosas = guardar diferentes tipos (int string boolean)
        Object[] cositas = {1,"hola", numerosDos};
        cositas[2][0]


        int longitudArray = numerosDos.length;
        //System.out.println(longitudArray);


        for (int i = 0; i < numerosDos.length; i++) {
            System.out.println(numerosDos[i]);
        }

        numerosDos[7] = 88;

        System.out.println("Modifico alguna posición");

        for (int i = 0; i < numerosDos.length; i++) {
            System.out.println(numerosDos[i]);
        }


        // meter en un array de 15 posiciones, 15 numeros aleatorios entre 0 - 50
        int[] numerosAleatorios = new int[15];

        for (int i = 0; i < 15; i++) {
            numerosAleatorios[i] = (int) (Math.random()*50);
        }

        // una vez generados los numeros, indicar cuantos pares
        // e impares hay en la coleccion
        int numerosPares=0, numeroImpares=0;
        for (int i = 0; i < 15; i++) {
            if (numerosAleatorios[i] %2 == 0){
                numerosPares++;
            } else {
                numeroImpares++;
            }
        }

        System.out.println(numerosAleatorios[0]);



    }
}
