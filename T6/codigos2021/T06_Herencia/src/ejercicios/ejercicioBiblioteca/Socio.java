package ejercicios.ejercicioBiblioteca;

import java.util.ArrayList;

public final class Socio extends Persona{

    private int numeroSocio;
    // TODO pendiente tipar el arraylist
    private ArrayList<Elemento> listaElementosPrestamos;

    public Socio(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.numeroSocio = (int) (Math.random() *1000);
        this.listaElementosPrestamos = new ArrayList();
    }

    public Socio() {
        this.listaElementosPrestamos = new ArrayList();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nº Socio: "+numeroSocio);
        // TODO mostrar datos de los elementos alquilados
        for ( Elemento itemElemento : listaElementosPrestamos ) {
            itemElemento.mostarDatos();
        }
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public ArrayList getListaElementosPrestamos() {
        return listaElementosPrestamos;
    }

    public void setListaElementosPrestamos(ArrayList listaElementosPrestamos) {
        this.listaElementosPrestamos = listaElementosPrestamos;
    }
}
