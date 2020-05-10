package clases.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.agregarSaldo(100);
        int dineroSacado = 0;
        try {

            cuentaCorriente.sacarSaldo(20456);
        } catch (SalsoInsuficienteEx salsoInsuficienteEx) {
            System.out.println(salsoInsuficienteEx.getMessage());
            System.out.println("saldo al sacar 0");
            dineroSacado = cuentaCorriente.getSaldo();
            cuentaCorriente.setSaldo(0);

        } finally {
            System.out.println("operación terminada");
            System.out.println(cuentaCorriente.getSaldo());
            System.out.println("El dinero sacado es: "+dineroSacado);
        }
    }
}
