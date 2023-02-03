package model;

import constantes.DatosEmpresa;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores; // null
    private ArrayList<Jefe> listaJefes; // null

    public Empresa() {
        this.listaTrabajadores = new ArrayList<>();
        this.listaJefes = new ArrayList<>();
    }

    public void aplicarDespido(String dni, Jefe jefe){
        // Trabajador
        Trabajador trabajador = estaTrabajador(dni);
        if (trabajador!=null){
            jefe.despedirTrabajador(trabajador);
        } else {
            System.out.println("No se ha podido despedir porque no se encuentra");
        }

    }

    public void agregarJefe(Jefe jefe){
        this.listaJefes.add(jefe);
    }

    public void agregarTrabajador(Trabajador trabajador){
        // asalariados - autonomos
        // si el dni que me dices no esta en la lista
        if (estaTrabajador(trabajador.getDni())==null){
            this.listaTrabajadores.add(trabajador);
        } else {
            System.out.println("El trabajador se encuentra en la empresa, sus datos son");
            // estaTrabajador(trabajador.getDni())
        }
    }

    public void listarTrabajadores(){
        for ( Trabajador item : listaTrabajadores ) {
            System.out.println(item);
        }
    }

    public void emitirFactura(String cif, String nombre, int cantidad){

        // FACTURA DE LA EMPRESA EMPRESA SL CON CIF 123123123B
        // PARA EL CLIENTE nombre CON CIF cif
        // POR UNA CANTIDAD DE cantidad
        System.out.printf("FACTURA DE LA EMPRESA %s SL CON CIF %s%n", DatosEmpresa.NOMBRE, DatosEmpresa.CIF);
        System.out.printf("PARA EL CLIENTE %s CON CIF %s%n",nombre,cif);
        System.out.printf("POR UNA CANTIDAD DE %d%n",cantidad);

    }

    private Trabajador estaTrabajador(String dni){

        // lo encuentro
        for (Trabajador item : listaTrabajadores) {
            if (item.getDni().equalsIgnoreCase(dni)){
                return item;
            }
        }

        return null;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public ArrayList<Jefe> getListaJefes() {
        return listaJefes;
    }

    public void setListaJefes(ArrayList<Jefe> listaJefes) {
        this.listaJefes = listaJefes;
    }
}
