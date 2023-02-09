package model;

public class Accionista extends Persona implements Directivo{

    private int acciones;

    public Accionista() {
    }

    public Accionista(String nombre, String apellido, String dni, int acciones) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
    }

    public void comprarAcciones(){
        int accionesComprar = (int)(Math.random() *20 +1);
        acciones+=accionesComprar;

    }

    @Override
    public int emitirVoto(int voto) {
        return (int)(voto*0.25);
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
}
