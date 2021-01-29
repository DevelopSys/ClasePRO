package ejercicios.ejerciciocajero;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        /*Cuenta cuenta1 = new Cuenta("1234A",1234,10.0); // IBAN = aleat PIN = 1234 DNI = 1234A SALDO = 10
        Cuenta cuenta2 = new Cuenta("2345A",2345,200.0); // IBAN = alaet
        cuenta1.verResumen("1234A",1234);
        cuenta1.ingresarDinero(10,"1234A",1234); // saldo = 20
        cuenta1.verResumen("1234A",1234);
        cuenta1.sacarDinero(11,"1234A",1234); // saldo = 9
        cuenta1.verResumen("1234A",1234);
        cuenta2.verResumen("2345A", 2345);*/

        /*Banco bbva = new Banco("BBVA","12345A"); // nombre = BBVA // CIF = 12345A // carteraCuentas = <Cuenta("1234A",123,100) - Cuenta("2345B",321,10) Cuenta("2345B",3123,10) Cuenta("2345B",321,10) Cuenta("2345B",321,10) Cuenta("2345B",321,10) Cuenta("2345B",321,10)>
        Banco santander = new Banco("Santander","23456B");  // nombre = Santander // CIF = 23456B // carteraCuentas = <>

        bbva.crearCuenta("123",123,100);
        bbva.crearCuenta("123",123,24234);
        bbva.crearCuenta("345",123,534534);
        bbva.crearCuenta("456",123,6456456);
        bbva.crearCuenta("123",123,5677);
        santander.crearCuenta("546",234,1231212312);

        //bbva.listarCuentas();

        bbva.listarCuentas();

        System.out.println("Ahora las del sandanter");

        santander.listarCuentas();

        //bbva.borrarCuenta("5674",123);

        //bbva.listarCuentas();
        //santander.listarCuentas();*/

        Scanner teclado = new Scanner(System.in);
        int opcion=0, opcion2=0;

        Banco santander = new Banco("santander","12345A");
        Banco bbva = new Banco("BBVA","12345A");

        do {
            System.out.println("1BBVA");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    do{
                        System.out.println("BBVA");
                        System.out.println("Crear");
                        System.out.println("Eliminar");
                        System.out.println("Sacar");
                        System.out.println("Meter");
                        opcion2 = teclado.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println("Crear cuenta");
                                break;
                        }
                    }while(opcion2 !=4);

                    break;
                case 2:
                    break;
            }

        }while(opcion!=3);



    }
}
