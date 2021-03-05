package ejercicios.ejericcioInterfaces;

public final class Audio extends Elemento implements Ejecutable{

    private int duración;
    private String soporte;

    public Audio(int identificador, int tamanio, String titulo, String autor, String formato, int duración, String soporte) {
        super(identificador, tamanio, titulo, autor, formato);
        this.duración = duración;
        this.soporte = soporte;
    }

    public Audio() {
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
        return true;
    }

    @Override
    public void parar() {
        System.out.println("El elemento se ha parado");
    }

    @Override
    public void reiniciar() {
        System.out.println("El elemento se ha reiniciado");
    }
}
