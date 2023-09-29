import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la altura del tr");
        int altura = scanner.nextInt();
        System.out.println("Dime la base del tr");
        int lado1 = scanner.nextInt();
        System.out.println("Dime el lado 2 del tr");
        int lado2 = scanner.nextInt();
        System.out.println("Dime el lado 3 del tr");
        int lado3 = scanner.nextInt();
        System.out.printf("El area del trian con base %d y altura %d es %.3f\n",
                lado1, altura, calcularAreaTriangulo(lado1, altura));
        boolean esEquilatero = lado1 == lado2 && lado2 == lado3;
        boolean esIsosceles = (lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado1 != lado3)
                || (lado1 == lado3 && lado1 != lado2);
        System.out.println("Es isosceles: " + esIsosceles);
        System.out.println("Es equilatero: " + esEquilatero);
        System.out.println("Indica el radio del circulo");
        int radio = scanner.nextInt();
        System.out.printf("El area del ciruculo cuyo radio es %d es de %.3f\n", radio, calcularAreaCirculo(radio));
    }

    public static double calcularAreaTriangulo(int base, int altura) {
        return (double) (base * altura) / 2;
    }

    public static double calcularAreaCirculo(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
