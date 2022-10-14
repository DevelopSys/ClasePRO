import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        double precioCoche;
        int plazos;
        double coutaMes;

        System.out.println("Cuando vale el coche que te vas a comprar");
        precioCoche = lecturaTeclado.nextDouble();
        System.out.println("En cuantos plazos lo vas a pagar");
        plazos = lecturaTeclado.nextInt();
        coutaMes = precioCoche/plazos;

        System.out.printf("Vas a pagar el coche de %.2f€ en %d meses, " +
                "con un total de %.2f€ cada plazo (sin tener en cuenta los intereses)%n"
                ,precioCoche,plazos,coutaMes);

        final double INTERES_FIJO = 3.5;
        double interesVariable = INTERES_FIJO ;
        // Ejercicio4
        double calculoInteres = precioCoche * (interesVariable/100);
        System.out.printf("El interés pagado (%.2f) en el primer mes es de %.2f%n",interesVariable,calculoInteres);

        interesVariable += INTERES_FIJO;
        precioCoche -= coutaMes;
        calculoInteres = precioCoche * (interesVariable/100);

        System.out.printf("El interés pagado (%.2f) en el segundo mes es de %.2f%n",interesVariable,calculoInteres);

        interesVariable += INTERES_FIJO;
        precioCoche -= coutaMes;
        calculoInteres = precioCoche * (interesVariable/100);

        System.out.printf("El interés pagado (%.2f) en el tercer mes es de %.2f%n",interesVariable,calculoInteres);

        interesVariable += INTERES_FIJO;
        precioCoche -= coutaMes;
        calculoInteres = precioCoche * (interesVariable/100);

        System.out.printf("El interés pagado (%.2f) en el cuarto mes es de %.2f%n",interesVariable,calculoInteres);

        interesVariable += INTERES_FIJO;
        precioCoche -= coutaMes;
        calculoInteres = precioCoche * (interesVariable/100);

        System.out.printf("El interés pagado (%.2f) en el quinto mes es de %.2f%n",interesVariable,calculoInteres);

    }
}
