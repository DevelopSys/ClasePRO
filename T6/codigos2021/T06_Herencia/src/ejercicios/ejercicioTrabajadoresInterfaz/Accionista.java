package ejercicios.ejercicioTrabajadoresInterfaz;

public final class Accionista extends Directivo implements Responsable{


    public Accionista(){}
    public Accionista(String dni, String nombre, String apellido, int beneficio) {
        super(dni, nombre, apellido, beneficio);
    }

    @Override
    public double emitirVoto(int numero) {
        return 0.5 * numero;
    }
}
