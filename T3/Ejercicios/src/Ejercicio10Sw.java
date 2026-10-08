import java.util.Scanner;

public class Ejercicio10Sw {


    /*
    Crea un programa que permita al usuario ingresar un código de producto
    (como una cadena de caracteres) y,
    utilizando una sentencia switch, muestre el nombre del
    producto y su precio correspondiente
     */

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce codigo");
        String codigo = lector.nextLine();
        String producto = null;
        double precio = 0.0;
        switch (codigo) {
            case "1A" -> {
                producto = "Bebida";
                precio = 2.5;
            }
            case "1B" -> {
                producto = "Bocata";
                precio = 2.75;
            }

            case "1C" -> {
                producto = "Cerveza";
                precio = 2.25;
            }
            case "1D" -> {
                producto = "Menu";
                precio = 5.25;
            }
        }

        switch (codigo) {
            case "1A":
                producto = "Bebida";
                precio = 2.5;
                break;

            case "1B":
                producto = "Bocata";
                precio = 2.75;
                break;

            case "1C":
                producto = "Cerveza";
                precio = 2.25;
                break;

            case "1D":
                producto = "Menu";
                precio = 5.25;

        }

        System.out.printf("El producto es %s y su precio es %.2f", producto, precio);
    }
}
