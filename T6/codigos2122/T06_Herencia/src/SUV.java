public class SUV extends Coche{

    // velocidad, matricula, bastidor, cc, cv
    private boolean traccion;

    public SUV(String matricula, String bastidor, int cv, int cc, boolean traccion) {
        super(matricula, bastidor, cv, cc);
        this.traccion = traccion;
    }

    public SUV() {

    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        int aleatorio = (int) (Math.random()*11) + 10;
        this.velocidad += aleatorio;

    }
}
