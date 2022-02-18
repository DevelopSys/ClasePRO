public class LlamadaNacional extends Llamada{

    private int franja;

    public LlamadaNacional(long nOrigen, long nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
        calcularCoste();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja: "+franja);
    }

    @Override
    protected void calcularCoste() {
        switch (franja){
            case 1:
                this.coste = this.duracion *0.20;
                break;
            case  2:
                this.coste = this.duracion *0.25;
                break;
            case 3:
                this.coste = this.duracion *0.30;
                break;
            default:
                this.coste = 10000;
        }
    }
}
