package excepcionsaldo;

import excepcionsaldo.model.Cuenta;
import excepcionsaldo.utils.SaldoInsuficienteException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(200, "1234A");
        System.out.println("Indica que cantidad quieres sacar");
        try {
            int cantidad = scanner.nextInt();
            cuenta.realizarTransaccion(cantidad);
        } catch (InputMismatchException e) {
            System.out.println("Error en el proceso");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
