package clase.ejerciciocajero.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Banco {

    private String nombre;
    private String cif;
    private ArrayList<Cuenta> listaCuentas;
    private int contador;

    public Banco() {
    }

    public Banco(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.listaCuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        // no puede 2 cuentas con el mismo id--> esta cuenta?
        cuenta.setId(contador);
        if (estaCuenta(cuenta.getId()) == null) {
            listaCuentas.add(cuenta);
            contador++;
            System.out.println("Cuenta agregada con exito");
        } else {
            System.out.println("Cuenta con id ya existente, no se puede agregar");
        }
    }

    private Cuenta estaCuenta(int id) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta.getId() == id) {
                return cuenta;
            }
        }
        return null;
    }

    public void eliminarCuenta(int id, String dni, int pin) {

        // comprobar los datos
        // la cuenta existe????????????
        Cuenta cuenta = estaCuenta(id);
        if (cuenta != null) {
            // el dni y el pin es correcto
            if (cuenta.getDni().equalsIgnoreCase(dni) && cuenta.getPin() == pin){
                listaCuentas.remove(cuenta);
            } else {
                System.out.println("Fallo de autenticacion");
            }
        } else {
            System.out.println("no puedo borrar porque no existe");
        }



        /*if (permitirOperar(id,pin,dni)){
            listaCuentas.remove(estaCuenta(id));
        } else {
            System.out.println("Fallo en el proceso");
        }*/

    }

    public void operar(int id, String dni, int pin, double dinero, String operacion ){
        // existe la cuenta
            // el pin y el dni coinciden
                // operarar
                    // ingresar
                    // sacar
        if (permitirOperar(id,pin,dni)){
            if (operacion.equalsIgnoreCase("ingresar")){
                // metodo ingresar
                estaCuenta(id).ingresarDinero(dinero);
            } else if(operacion.equalsIgnoreCase("sacar")){
                // metodo sacar
                estaCuenta(id).sacarDinero(dinero);
            } else {
                System.out.println("Operacion no contemplada");
            }
        } else {
            System.out.println("Fallo en el proceso");
        }

    }

    public void listarCliente(String dni){
        for (Cuenta cuenta: listaCuentas ) {
            if (cuenta.getDni().equalsIgnoreCase(dni)){
                cuenta.mostrarDatos();
            }
        }
    }

    private boolean permitirOperar(int id, int pin, String dni){

        Cuenta cuenta = estaCuenta(id);
        if (cuenta != null) {
            // el dni y el pin es correcto
            if (cuenta.getDni().equalsIgnoreCase(dni) && cuenta.getPin() == pin){
                return  true;
            }
        }
        return false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
}
