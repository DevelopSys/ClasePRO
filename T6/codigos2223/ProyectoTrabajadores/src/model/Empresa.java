package model;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores; // null
    private ArrayList<Jefe> listaJefes; // null

    public Empresa() {
        this.listaTrabajadores = new ArrayList<>();
        this.listaJefes = new ArrayList<>();
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

    private Trabajador estaTrabajador(String dni){

        // lo encuentro
        for (Trabajador item : listaTrabajadores) {
            if (item.getDni().equalsIgnoreCase(dni)){
                return item;
            }
        }

        return null;
    }


}
