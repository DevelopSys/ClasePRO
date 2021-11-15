package base;

public class Ejercicio6 {

    // Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.
    // Una vez hecho esto realizará las siguientes operaciones:
    //modificar todos los 6 por 8
    //modificar todos los 7 por 15
    //modificar todos los 20 por 10
    // Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.
    public static void main(String[] args) {
        int [] aletorios = new int[20];
        int sumaModificaciones = 0;


        // rellenar
        for (int i = 0; i < aletorios.length; i++) {
            //int aleatorio = (int) (Math.random() *11);
            aletorios[i] = (int) (Math.random() *31);
        }

        // evaluar
        for (int i = 0; i < aletorios.length; i++) {

            if (aletorios[i] == 6){
               aletorios[i] = 8;
               sumaModificaciones++;
           } else if (aletorios[i]== 7){
               aletorios[i] = 15;
               sumaModificaciones++;
           } else if (aletorios[i]== 20){
               aletorios[i] = 10;
               sumaModificaciones++;
           }
        }

        System.out.printf("El numero de modificaciones es: %d%n",sumaModificaciones);


    }



}
