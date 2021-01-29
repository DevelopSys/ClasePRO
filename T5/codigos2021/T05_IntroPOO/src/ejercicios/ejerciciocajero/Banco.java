package ejercicios.ejerciciocajero;

import java.util.ArrayList;

public class Banco {

    private String nombre, CIF;
    private ArrayList<Cuenta> carteraCuentas;

    public Banco(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
        carteraCuentas = new ArrayList();
    }

    public void crearCuenta(String dni, int pin, double saldo) {
        Cuenta cuenta = new Cuenta(dni, pin, saldo);
        carteraCuentas.add(cuenta);
    }

    public void borrarCuenta(String dni, int pin) {

        boolean encontradaCuenta = false;

        for (int i = 0; i < carteraCuentas.size(); i++) {
            if (carteraCuentas.get(i).permitirAcceso(dni, pin)) {
                carteraCuentas.remove(i);
                System.out.println("Borrada correctamente");
                encontradaCuenta = true;
                break;
            }
        }

        if (!encontradaCuenta) {
            System.out.println("Cuenta no encontrada, borrado cancelado");
        }


    }

    public void listarCuentas() {

        if (carteraCuentas.size() > 0) {

            for (Cuenta cuenta : carteraCuentas) {
                System.out.println("Impimiendo cuenta *****");
                cuenta.verResumen(cuenta.getDni(), cuenta.getPin());
            }

            System.out.println("Cuentas impresas");
        }else {
            System.out.println("No hay cuentas para mostrar");
        }


    }

    public void listaCuentasCliente(String dni){

        for ( Cuenta cuenta : carteraCuentas ) {
            if (cuenta.getDni().toLowerCase().equals(dni.toLowerCase())){
                cuenta.verResumen(cuenta.getDni(),cuenta.getPin());
            }
        }

    }

}
