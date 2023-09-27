import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce la edad");
        int edad= scanner.nextInt();
        System.out.println("Intoduce nivel de estudios");
        int estudios= scanner.nextInt();
        System.out.println("Intoduce ingresos");
        int ingresos= scanner.nextInt();
        boolean condicion = edad>40&&(estudios>=5&&estudios<8)&&ingresos>1500;
        System.out.println("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: "+condicion);
    }
}
