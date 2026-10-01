import java.util.Scanner;

public class Ejercico5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double PRECIO_MOTO = 1.50;
        final double PRECIO_COCHE = 2.50;
        final double PRECIO_FURGO = 4.0;
        System.out.println("Indica matricula");
        String matricula = lector.nextLine();
        System.out.println("Indica tipo (1-2-3)");
        int tipo = lector.nextInt();
        System.out.println("Indica horas");
        int horas = lector.nextInt();
        System.out.println("Abonado (s/n)");
        lector = new Scanner(System.in);
        String abonado = lector.nextLine();
        lector.close();

        if (matricula.length() == 7) {
            System.out.println("Calculamos");
            double precio = 0.0;

            if (tipo == 1) {
                precio = horas * PRECIO_MOTO;
            }
            if (tipo == 2) {
                precio = horas * PRECIO_COCHE;
            }
            if (tipo == 3) {
                precio = horas * PRECIO_FURGO;
            }

            System.out.println("Matricula = " + matricula);
            System.out.println("Tipo = " + tipo);
            System.out.println("Abonado = " + abonado);
            if (abonado.equalsIgnoreCase("si")) {
                System.out.println("Precio normal= " + precio);
                System.out.println("Precio descuento= " + precio * 0.8);
                System.out.println("descuento= " + precio * 0.2);
            } else {
                System.out.println("Precio total= " + precio);
            }

        } else {
            System.out.println("Matricula invalida");
        }
    }
}
