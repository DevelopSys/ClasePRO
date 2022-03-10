public final class Directivo extends Persona implements Comision {

    private int capital;

    public Directivo() {
    }

    public Directivo(String dni, String nombre, String apellido, int capital) {
        super(dni, nombre, apellido);
        this.capital = capital;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital: "+capital);
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11)/2;
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficio) {
        System.out.println("El beneficio obtenido es: "+beneficio*0.20);
    }
}
