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
            ((Socio) p).setNumeroSocio(numeroSocios++);
        }else {
            listaPersonas.add(p);
        }
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
}
