package arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        // numero se carga con aleaotrios
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random()*101);
        }

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i],2 );
        }

        for (int i = 0; i < cuadrado.length; i++) {
            cubo[i] = (int) Math.pow(numero[i],3 );
        }


        for (int i = 0; i < numero.length; i++) {
            System.out.printf("Posicion %d, %d\t\t\t%d\t\t\t%d\n",i,
                    numero[i],cuadrado[i],cubo[i]);
        }

    }
}
