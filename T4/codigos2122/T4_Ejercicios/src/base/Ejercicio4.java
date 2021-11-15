package base;

public class Ejercicio4 {

    // Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
    // Carga el array numero con valores aleatorios entre 0 y 100.
    //
    //En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    //En el array cubo se deben almacenar los cubos de los valores que hay en numero.

    public static void main(String[] args) {
        int numero[] = new int[20];
        int cubo[] = new int[20];
        int cuadrado[] = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() *101);

        }
         // relleno el cuadrado
        for (int i = 0; i < numero.length ; i++) {
            cuadrado[i] = (int) Math.pow(numero[i],2);
        }

        // relleno el cubo
        for (int i = 0; i < numero.length ; i++) {
           cubo[i] = (int) Math.pow(numero[i],3);
        }

        // sacar en columnas

        for (int i = 0; i < numero.length; i++) {

            System.out.printf("%d \t %d \t %d%n",numero[i],cuadrado[i],cubo[i]);

        }

    }
}
