import model.Coche;

import java.sql.SQLException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) throws SQLException {
        Dudas dudas = new Dudas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = scanner.next();
        System.out.println("Introduce el precio");
        int precio = scanner.nextInt();
        dudas.duda2(nombre, precio);

        dudas.duda3(new Coche("asd","asd","asd"));
    }


}
