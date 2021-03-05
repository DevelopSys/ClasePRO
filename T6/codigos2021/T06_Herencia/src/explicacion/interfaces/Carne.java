package explicacion.interfaces;

public final class Carne extends Alimento implements Producto{

    private String origen;

    public Carne(int calorias, int grasas, String origen) {
        super(calorias, grasas);
        this.origen = origen;
    }

    public void certificarOrigen(){
        System.out.println(origen);
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
        System.out.println("Metodo llamado desde producto carne");
    }
}
