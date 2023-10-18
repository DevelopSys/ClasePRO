package ejercicioswhile;

public class Ejercicio3 {

    public static void main(String[] args) {
        int aleatorio;
        int max=0;
        do{
            aleatorio = (int)(Math.random()*101);
            System.out.println(aleatorio);
            if (aleatorio>max){
                max = aleatorio;
            }
        }while (aleatorio!=0);

        System.out.println("El maximo generado es "+max);
    }
}
