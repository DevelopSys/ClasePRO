package biblioteca.model;

import java.util.ArrayList;

public class Socio extends Persona {


    private ArrayList<Prestable> prestamos;
    private int numeroSocio;

    public Socio() {
    }

    public Socio(String nombre, String apellido, String dni, int numeroSocio) {
        super(nombre, apellido, dni);
        this.numeroSocio = numeroSocio;
        prestamos = new ArrayList();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nº socio: "+numeroSocio);
        System.out.println("Nº elementos prestados: "+prestamos.size());
    }

    // TODO pasar a elemento
    public void mostrarPrestamos(){
        for ( Prestable item : prestamos ) {

        }
    }

    public void agregarPrestamo(Prestable item){
        this.prestamos.add(item);
    }

    public ArrayList getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList prestamos) {
        this.prestamos = prestamos;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
}
