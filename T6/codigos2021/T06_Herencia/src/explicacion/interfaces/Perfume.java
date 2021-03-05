package explicacion.interfaces;

public class Perfume extends Cosmetico implements Producto {

    private int nivelOlor;

    public Perfume(String quimico, int edad, int nivelOlor) {
        super(quimico, edad);
        this.nivelOlor = nivelOlor;
    }

    public void mostrarOlor(){
        System.out.println(nivelOlor);
    }

    @Override
    public void registrar() {

    }

    @Override
    public void vender() {

    }

    @Override
    public boolean verExistencias() {
        return false;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Metodo llamado desde producto perfume");
    }
}
