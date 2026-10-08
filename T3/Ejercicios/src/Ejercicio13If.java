import java.util.Scanner;

public class Ejercicio13If {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("India dia");
        int dia = lector.nextInt();
        System.out.println("India mes");
        int mes = lector.nextInt();
        System.out.println("India año");
        int anio = lector.nextInt();
        // validos
        // 30 -> a,jn,sp,nv
        // 31 -> e,m,my,jl,ag,oc,dc
        // 28 -> ferbrero
        if (dia <= 28 && mes == 2) {

        } else if (dia <= 30 && (mes == 4 || mes == 5 || mes == 9 || mes == 11)) {

        } else if (dia <= 31 && (mes == 1 || mes == 3)) {

        } else {
            System.out.println("Error de fecha");
        }
    }
}
