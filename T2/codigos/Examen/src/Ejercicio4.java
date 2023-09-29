import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int precio = 30000;
        int plazos = 6;
        final int cuotaMes = precio/plazos;
        double interes = 3.5;


        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f\n",interes,precio*(interes/100));
        interes+=3.5;
        precio-=cuotaMes;
        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f\n",interes,precio*(interes/100));
        interes+=3.5;
        precio-=cuotaMes;
        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f\n",interes,precio*(interes/100));
        interes+=3.5;
        precio-=cuotaMes;
        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f\n",interes,precio*(interes/100));
        interes+=3.5;
        precio-=cuotaMes;
        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f\n",interes,precio*(interes/100));
        interes+=3.5;
        precio-=cuotaMes;
        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f\n",interes,precio*(interes/100));



    }
}
