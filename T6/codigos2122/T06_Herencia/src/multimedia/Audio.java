package multimedia;

import javax.swing.*;

public final class Audio extends Elemento {

    private int duracion;
    private String soporte;

    public Audio(String id, String titulo, String autor, String tamanio, String formato, int duracion, String soporte) {
        super(id, titulo, autor, tamanio, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public void metodoAudio(){}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion "+duracion);
        System.out.println("Soporte "+soporte);

    }
}
