package model;

import java.util.ArrayList;

public final class Socio extends Persona{

    private int numeroSocio;
    private ArrayList<String> prestamos;

    public Socio() {
        prestamos = new ArrayList<>();
    }

    public Socio(String nombre, String apellido, String dni, int numeroSocio) {
        super(nombre, apellido, dni);
        this.numeroSocio = numeroSocio;
    }

    // TODO agregar prestamo
    public void agregarPrestamo(){

    }

    // TODO devolver prestamo
    public void devolverPrestamo(){

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero socio: " +numeroSocio);
        // TODO mostrar prestemos
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public ArrayList<String> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<String> prestamos) {
        this.prestamos = prestamos;
    }
}
