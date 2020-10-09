import java.util.Scanner;

public class Nomina {

    // declaro variables
    int sueldo = 123;

    // ejecutar algo -- ERROR

    double MiPI = Math.PI;

    public static void main(String[] args) {
        // La factura total sin IVA XX con IVA XX
        // sueldo bruto anual: 30000 e/a
        // 10 pagas
        // 15%

        // su bruto anual: 30000
        // su neto anual: 30000 - (30000 * 0.15)
        // su bruto mensual: 30000 / 10
        // su neto anual: (30000 - (30000 * 0.15)) / 10
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el sueldo anual");
        double sueldo = teclado.nextDouble();
        System.out.println("Introduce numero de pagas");
        int pagas = teclado.nextInt();
        double retenciones = 0.15;

        double sueldoBrutoMes = sueldo / pagas;
        double sueldoNetoAnio = sueldo - (sueldo * retenciones);
        double sueldoNetoMes = sueldoNetoAnio / pagas;

        //System.out.println("El sueldo neto / mes es "+ sueldoNetoMes);
        //System.out.println("El sueldo neto / año es "+ sueldoNetoAnio);

        System.out.printf("El sueldo neto/año es %.3f y el sueldo neto/mes %.2f%n", sueldoNetoAnio, sueldoNetoMes);
        System.out.printf("El sueldo neto/año es %.3f y el sueldo neto/mes %.2f%n", sueldoNetoAnio, sueldoNetoMes);

    }

}
