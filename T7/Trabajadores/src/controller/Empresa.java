package controller;

import model.*;

import java.util.ArrayList;

public class Empresa {

    private int beneficio;
    private ArrayList<Persona> listaPersonas;

    public Empresa(int beneficio) {
        this.beneficio = beneficio;
        listaPersonas = new ArrayList<>();
    }

    public Empresa() {
        listaPersonas = new ArrayList<>();
        // beneficio = 0
    }

    public void registrarTrabajador(Trabajador trabajador) {
        // comprobar si el nss ya existe
        if (trabajador instanceof Jefe) {
            // si intentas meter un jefe, no tiene la empresa un jefe
            if (existeJefe()) {
                System.out.println("No puedes, ya hay un jefe en la empresa");
            } else {
                listaPersonas.add(trabajador);
            }
        } else {
            listaPersonas.add(trabajador);
        }
    }

    public void registraAccionista(Accionista a) {
        listaPersonas.add(a);
    }

    public void repartirBeneficio() {
        for (Persona persona : listaPersonas) {
            if (persona instanceof Beneficiario) {
                ((Beneficiario) persona).repartirBeneficio(beneficio);
            }
        }
    }

    public Trabajador buscarTrabajador(int nss) {
        for (Persona persona : listaPersonas) {
            if (persona.getNumeroSS() == nss && persona instanceof Trabajador) {
                return (Trabajador) persona;
            }
        }
        return null;
    }

    public void despedirTrabajador(int dniJefe, int dniTrabajador) {
        if (buscarTrabajador(dniJefe) instanceof Jefe) {
            if (buscarTrabajador(dniTrabajador) instanceof Asalariado
                    || buscarTrabajador(dniTrabajador) instanceof Autonomo)
                ((Jefe) (buscarTrabajador(dniJefe))).despedir(buscarTrabajador(dniTrabajador));
        }
    }

    private boolean existeJefe() {
        for (Persona persona : listaPersonas) {
            if (persona instanceof Jefe) {
                return true;
            }
        }
        return false;
    }
}
