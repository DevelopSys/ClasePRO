import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
        double notaExamen, notaFinal, notaSacar;

        // 1er 7(40%) 2o(60%) = 9,5
        // 7*0,40 = 2,8
        // X * 0,60 = 6,7 -- 6,7 / 0,60
        // nota final = 9,5
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen");
        notaExamen = teclado.nextDouble();
        System.out.println("Que nota quiere sacar");
        notaFinal = teclado.nextDouble();
        notaSacar = (notaFinal - (notaExamen * 0.40))/0.60;
        //System.out.print(notaSacar);
        System.out.printf("La nota que debes sacar es: %.2f%n",notaSacar);
    }

}
