package interfaces.model;

public class ClaseD  extends ClaseC implements ClaseE{
    public ClaseD(String nombre) {
        super(nombre);
    }

    @Override
    public void saludar(String saludo) {
        super.saludar(saludo);
        System.out.println("Completando saludo desde clase D");
    }

    @Override
    public void despedir() {
        System.out.println("Hasta luego");
    }
}
