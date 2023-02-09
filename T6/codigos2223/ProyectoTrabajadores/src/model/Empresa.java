package model;

import constantes.DatosEmpresa;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> listaPersonasEmpresa;
    private int numeroVotos;

    public Empresa() {
        this.listaPersonasEmpresa = new ArrayList<>();
    }

    public void aplicarDespido(String dni, Jefe jefe){
        // Trabajador
        Persona trabajador = estaPersona(dni);
        if (trabajador!=null){
            jefe.despedirTrabajador((Trabajador) trabajador);
            listaPersonasEmpresa.remove(trabajador);
        } else {
            System.out.println("No se ha podido despedir porque no se encuentra");
        }
    }
    public void aplicarDespido(String dni, Propietario propietario){
        // Trabajador
        Persona trabajador = estaPersona(dni);
        if (trabajador!=null){
            propietario.despedirJefe((Jefe) trabajador);
            listaPersonasEmpresa.remove(trabajador);

        } else {
            System.out.println("No se ha podido despedir porque no se encuentra");
        }
    }

    public void realizarVotacion(){

        for ( Persona persona : listaPersonasEmpresa ) {
            // solo podrán votar jefes, propietarios, accionistas -->
            // falla cuando cuando recorres un Asalariado o un Autonomo
            if (persona instanceof Directivo){

                System.out.println("Voto registrado");
                numeroVotos +=((Directivo)persona).emitirVoto((int)(Math.random()*10+1));
            }
        }

        System.out.println("El resultado de la votacion es "+numeroVotos);
        // todos los directivos (jefes / accionistas / propietarios) de la
        // empresa votan un numero aleatorio entre 1-10
        // cada vez que un direcitivo vote, "voto registrado"

        // una vez todos han realizado voto mostrar por pantalla el
        // resultado de la votacion

        // antes de la votacion, meter en la empresa
        // 3 trabajadores, 2 jefes, 2 accionistas, 2 propietarios
    }

    public void agregarPersona(Persona trabajador){
        // asalariados - autonomos
        // si el dni que me dices no esta en la lista
        if (estaPersona(trabajador.getDni())==null){
            this.listaPersonasEmpresa.add(trabajador);
        } else {
            System.out.println("El trabajador se encuentra en la empresa, sus datos son");
            // estaTrabajador(trabajador.getDni())
        }
    }
    public void listarPersonas(){
        for ( Persona item : listaPersonasEmpresa ) {
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
    private Persona estaPersona(String dni){

        // lo encuentro
        for (Persona item : listaPersonasEmpresa) {
            if (item.getDni().equalsIgnoreCase(dni)){
                return item;
            }
        }

        return null;
    }

    public ArrayList<Persona> getListaPersonasEmpresa() {
        return listaPersonasEmpresa;
    }
    public void setListaPersonasEmpresa(ArrayList<Persona> listaPersonasEmpresa) {
        this.listaPersonasEmpresa = listaPersonasEmpresa;
    }
    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
}
