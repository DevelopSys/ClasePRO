package model;

public class LlamadaNacional extends Llamada{

    private char destino;

    public LlamadaNacional() {
        this.cobrar();
    }

    public LlamadaNacional(long nOrigen, long nDestino, double duracion, char destino){
        super(nOrigen,nDestino,duracion);
        this.destino = destino;
        this.cobrar();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja "+this.destino);
    }

    @Override
    public void cobrar() {
        switch (this.destino){
            case 'A':
                setCoste(getDuracion()*0.4);
                break;
            case 'B':
                setCoste(getDuracion()*0.5);
                break;
            case 'C':
                setCoste(getDuracion()*0.6);
                break;
        }
    }
}
