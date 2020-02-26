package correccion_enum;

import java.util.ArrayList;

public class Socio extends Persona{

    int numeroSocio;
    ArrayList<Prestable> prestamos;

    public Socio(String nombre, String apellido, String dni, int numeroSocio) {
        super(nombre, apellido, dni);
        this.numeroSocio = numeroSocio;
        prestamos= new ArrayList<>();
    }


    public ArrayList<Prestable> getPrestamos() {
        return prestamos;
    }
}
