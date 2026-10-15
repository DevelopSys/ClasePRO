package ejerciciosfor;

public class Ejercicio4 {

    public static void main(String[] args) {
        for (int i = 4; i <=9 ; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 0; j < 11; j++) {
                System.out.println("\t"+i+" *"+ j+" = "+i*j);
            }
        }
    }
}
