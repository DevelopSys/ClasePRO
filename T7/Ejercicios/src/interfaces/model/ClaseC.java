package interfaces.model;

public class ClaseC {

    private String nombre;

    public ClaseC(String nombre) {
        this.nombre = nombre;
    }

    public void saludar(String saludo){
        System.out.println("Iniciando el saludo");
        System.out.println(saludo);
    }
}
