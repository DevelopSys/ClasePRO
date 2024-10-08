import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = scanner.next();
        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();
        System.out.println("Dime nivel salarial");
        int salario = scanner.nextInt();
        System.out.println("Dime tu cumpleaños");
        int diaCumpleanio = scanner.nextInt();
        System.out.println("Dime si conduces");
        boolean conducir = scanner.nextBoolean();

        // <40000 <50 conduce
        boolean condicion1 = salario < 40000 && edad < 50 && conducir;
        // <20000 >45 cumplaños par
        boolean condicion2 = salario < 20000 && edad > 45 && diaCumpleanio % 2 == 0;
        System.out.println("El resultado del analisis del candidato es " + (condicion1 || condicion2));
    }
}
