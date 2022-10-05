import java.util.Scanner;

public class EntradaEjercicio2 {

    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Por favor introduce el sueldo del trabajador");
        int sueldoBrutoAnual = lecturaTeclado.nextInt();
        System.out.println("Cuantas pagas tienes");
        final int RETENCIONES = 25;
        int pagas = lecturaTeclado.nextInt();
        double sueldoNetoAnual = sueldoBrutoAnual - ((double)(sueldoBrutoAnual*RETENCIONES))/100.0;
        double brutoMensual = sueldoBrutoAnual / pagas;
        double netoMensual = sueldoNetoAnual / pagas;

        System.out.printf("El sueldo bruto anual del trabajador es %d%n",sueldoBrutoAnual);
        System.out.printf("El sueldo neto anual del trabajador es %.2f%n",sueldoNetoAnual);
        System.out.printf("El sueldo bruto mensual del trabajador es %.2f%n",brutoMensual);
        System.out.printf("El sueldo neto mensual del trabajador es %.2f%n",netoMensual);

    }

}
