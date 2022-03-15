import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Elemento> listaElementos;
    private int numeroSocios = 0;

    public Biblioteca() {
        listaElementos = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public void addPersona(Persona p){
        if (p instanceof Socio){
            numeroSocios = numeroSocios +1;
            ((Socio) p).setNumeroSocio(numeroSocios);
        }
            listaPersonas.add(p);

    }
    public void addAlquilable(Prestable prestable){
        this.listaElementos.add((Elemento) prestable);
    }

    public void realizarPrestamo(Socio socio, Prestable prestable){
        if (((Elemento)prestable).isDisponible()){
            socio.getListaPrestamos().add(prestable);
            prestable.prestar();
        }
    }

    public void realizarDevolucion(Socio socio, Prestable prestable){
        socio.getListaPrestamos().remove(prestable);
        prestable.devolver();
    }

    public void listarPersonas(){
        for ( Persona item: listaPersonas ) {
            item.mostrarDatos();
        }
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public int getNumeroSocios() {
        return numeroSocios;
    }

    public void setNumeroSocios(int numeroSocios) {
        this.numeroSocios = numeroSocios;
    }
}
