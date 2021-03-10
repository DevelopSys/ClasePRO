package ejercicios.ejercicioTrabajadoresInterfaz;

public final class Director extends Directivo implements Responsable {

    public Director(){}
    public Director(String dni, String nombre, String apellido, int beneficio) {
        super(dni, nombre, apellido, beneficio);
    }

    @Override
    public double emitirVoto(int numero) {
        return 0.75 *numero;
    }
}
