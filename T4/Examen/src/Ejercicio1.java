import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);


        int opcion;
        int[]numeros=null;

        do {
            System.out.println("1. Indicar tamaño");
            System.out.println("2. Rellenar datos");
            System.out.println("3. Sacar >10 y pares");
            System.out.println("4. Rotar");
            System.out.println("5. Listar");
            System.out.println("Que tarea quieres realizar");
            opcion = lecturaTeclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el tamaño del array");
                    int tamanio = lecturaTeclado.nextInt();
                    if (tamanio<0){
                        System.out.println("Tamaño introducido incorrecto");
                    } else {
                        numeros = new int[tamanio];
                    }
                    break;
                case 2:
                    if (numeros!=null){
                        for (int i = 0; i < numeros.length; i++) {
                                numeros[i] = (int) (Math.random()*101);
                        }
                    } else {
                        System.out.println("Error en el llenado del array");
                    }
                    break;
                case 3:
                    // y si es null?????
                    if (numeros != null){
                        for ( int item : numeros ) {
                            if (item%2==0 && item>10){
                                System.out.println(item);
                            }
                        }
                    } else {
                        System.out.println("Error en recorrer el array");
                    }
                    break;
                case 4:

                    if (numeros!= null){

                        int primeraPosicion = numeros[0];
                        for (int i = 0; i < numeros.length-1; i++) {
                            numeros[i] = numeros[i+1];
                        }
                        numeros[numeros.length-1] = primeraPosicion;


                    }

                    break;
                case 5:
                    if (numeros!=null){
                        for ( int item : numeros ) {
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("Error en el recorrido");
                    }
                    break;

            }
        } while (opcion != 0);


    }

}
