import java.util.Scanner;

public class Ejercicio14If {

    /*
    Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
    suponer que todos los meses tienen 30 días excepto febrero que tiene 28.
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("India dia");
        int dia = lector.nextInt();
        System.out.println("India mes");
        int mes = lector.nextInt();
        System.out.println("India año");
        int anio = lector.nextInt();
        int ultimoDia = 0;

        // 1/10/2026
        // 2/10/2026
        if (mes == 2) {
            // febrero 28/02/2026
            if (dia == 28) {
                dia = 1;
                mes++;
                //1/03/2026
            } else {
                dia++;
            }
        } else {
            // resto
            if (dia == 30 && mes == 12) {
                dia = 1;
                mes = 1;
                anio++;
            } else if (dia == 30) {
                dia = 1;
                mes++;
            } else {
                dia++;
            }
        }

        System.out.printf("La fecha siguiente a la introducida es %d/%d/%d", dia, mes, anio);
    }
}
