package interfaces.model;

public class ClaseA extends ClaseC{
    public ClaseA(String nombre) {
        super(nombre);
    }

    @Override
    public void saludar(String saludo) {
        super.saludar(saludo);
        System.out.println("Saludo completo desde la clase A");
    }
}
