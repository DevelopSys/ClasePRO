import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("El menu que tenemos es");
        System.out.println("Pizzas");
        System.out.println("Hamburguesas");
        System.out.println("Ensaladas");
        double precioPizzas = 7.5;
        double precioHamburguesas = 5.0;
        double precioEnsaladas = 6.0;
        System.out.println("Cuantas pizzas quieres");
        int nPizzas = lector.nextInt();
        System.out.println("Cuantas hamburg quieres");
        int nHamburguesas = lector.nextInt();
        System.out.println("Cuantas ensa quieres");
        int nEnsaladas = lector.nextInt();
        System.out.println("Tienes cupon");
        String cupon = lector.next();
        double total = nHamburguesas * precioHamburguesas + nPizzas * precioPizzas + nEnsaladas * precioEnsaladas;
        if (cupon.equals("si")) {
            System.out.println("El precio total es de " + total * 0.9);
        } else {
            System.out.println("El precio total es de " + total);
        }
        lector.close();
    }
}
