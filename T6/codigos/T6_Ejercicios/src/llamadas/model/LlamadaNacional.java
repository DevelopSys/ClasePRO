package llamadas.model;

import llamadas.constantes.Costes;

public class LlamadaNacional extends Llamada {

    private int franja;

    public LlamadaNacional(){

    }

    public LlamadaNacional(int nOrigen, int nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        if (franja<0 || franja>3){
            this.franja = 1;
        }
        this.franja = franja;
        calcularCoste();
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja "+franja);
    }

    @Override
    public void calcularCoste() {
        // DEPENDE DE UNA FRANJA
        switch (franja){
            case 1:
                setCoste(getDuracion()* Costes.COSTE_NACIONAL1);
                break;
            case 2:
                setCoste(getDuracion()* Costes.COSTE_NACIONAL2);
                break;
            case 3:
                setCoste(getDuracion()* Costes.COSTE_NACIONAL3);
                break;
        }
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
}
