package interfaces.model;

public class ClaseB extends ClaseC implements ClaseE{
    public ClaseB(String nombre) {
        super(nombre);
    }

    @Override
    public void saludar(String saludo) {
        super.saludar(saludo);
        System.out.println("Saludo completado desde clase B");
    }

    @Override
    public void despedir() {
        System.out.println("Esta es la forma de despedir desde la clase B");
        System.out.println("Terminando despedida");
    }
}
