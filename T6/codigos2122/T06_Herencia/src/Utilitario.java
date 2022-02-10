public class Utilitario extends Coche{

    private int plazas;

    public Utilitario(String matricula, String bastidor, int cv, int cc, int plazas) {
        super(matricula, bastidor, cv, cc);
        this.plazas = plazas;
    }

    public Utilitario() {

    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
