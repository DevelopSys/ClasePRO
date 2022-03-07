public final class Audio extends Elemento implements Ejecutable{

    private int duración;
    private String soporte;

    public Audio() {
        this.duración = duración;
        this.soporte = soporte;
    }

    public Audio(String identificador, String titulo, String autor, String formato, int tamaño, int duración, String soporte) {
        super(identificador, titulo, autor, formato, tamaño);
        this.duración = duración;
        this.soporte = soporte;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }
}
