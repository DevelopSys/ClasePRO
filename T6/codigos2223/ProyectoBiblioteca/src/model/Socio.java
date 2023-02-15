package model;

import java.util.ArrayList;

public final class Socio extends Persona{

    private int numeroSocio;
    private ArrayList<Prestable> prestamos;

    public Socio() {
        prestamos = new ArrayList<>();
    }

    public Socio(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.prestamos = new ArrayList<>();
    }


    public void agregarPrestamo(Prestable prestable){
        this.prestamos.add(prestable);
    }

    public void mostrarPrestamos(){
        for ( Prestable item: prestamos ) {
            ((Elemento)item).mostrarDatos();
        }
    }

    public void devolverPrestamo(Prestable prestable){
        prestamos.remove(prestable);
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

    public ArrayList<Prestable> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestable> prestamos) {
        this.prestamos = prestamos;
    }
}
