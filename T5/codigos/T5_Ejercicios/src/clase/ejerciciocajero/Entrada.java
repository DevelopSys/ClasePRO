package clase.ejerciciocajero;

import clase.ejerciciocajero.model.Banco;
import clase.ejerciciocajero.model.Cuenta;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        Banco banco1 = new Banco("Santander", "123123");
        Banco banco2 = new Banco("BBVA", "123123");
        banco1.agregarCuenta(new Cuenta(0, "123A", 123, 0.0));
        banco1.agregarCuenta(new Cuenta(0, "234", 234, 0.0));
        banco1.agregarCuenta(new Cuenta(0, "345", 345, 0.0));
        banco1.agregarCuenta(new Cuenta(0, "456", 456, 0.0));
        banco1.agregarCuenta(new Cuenta(0, "567", 567, 0.0));
        banco1.agregarCuenta(new Cuenta(0, "567", 667, 10.0));
        banco1.agregarCuenta(new Cuenta(0, "567", 767, 20.0));

        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        banco1.operar(3, "345", 345, 100, "ingresar");
        banco1.operar(3, "345", 456, 50, "asdfghjkl");
        banco1.listarCliente("567");
        //banco1.getListaCuentas().get(2).mostrarDatos();












        /*Cuenta cuenta = new Cuenta(1,"123A",123,50.0);
        cuenta.ingresarDinero(50.0);
        // 100€
        cuenta.sacarDinero(75.0);
        cuenta.sacarDinero(50.0);
        //cuenta.ingresarDinero(0);
        cuenta.mostrarDatos();*/
    }
}
