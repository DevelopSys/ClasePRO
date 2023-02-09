package model;

public class Propietario extends Persona implements Directivo{

    // Propietario()

    public Propietario(){}

    public Propietario(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public void despedirJefe(Jefe jefe){
        if (jefe.isContratado()){
            jefe.setContratado(false);
        }
    }

    @Override
    public int emitirVoto(int voto) {
        return voto;
    }
}
