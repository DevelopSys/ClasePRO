package explicacion.interfaces;

public abstract class Cosmetico {

    protected String quimico;
    protected int edad;

    public Cosmetico(String quimico, int edad) {
        this.quimico = quimico;
        this.edad = edad;
    }

    public void mostrarQuimicos(){
        System.out.println(quimico);
    }
}
