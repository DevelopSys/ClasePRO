import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Indica tu nombre");
        String nombre = lectorTeclado.next();
        System.out.println("1. Hamburguesa");
        System.out.println("2. Pizza");
        System.out.println("3. Ensalada");
        System.out.println("Que quieres pedir");
        int opcion = lectorTeclado.nextInt();
        double precioTotal = 0.0;
        String menu = "";
        switch (opcion) {
            case 1 -> {
                menu = "Hamburguesa";
                precioTotal = 6.5;
            }
            case 2 -> {
                menu = "Pizza";
                precioTotal = 7.0;
            }
            case 3 -> {
                menu = "Ensalada";
                precioTotal = 5.0;
            }
        }
        System.out.println("Tienes cupon");
        boolean cupon = lectorTeclado.nextBoolean();
        if (cupon){
            precioTotal = precioTotal - precioTotal*0.1;
        }

        System.out.printf("Cliente: %s, Menu: %s , Precio: %.2f\n",nombre,menu,precioTotal);
    }
}
