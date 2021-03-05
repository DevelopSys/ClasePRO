package explicacion.interfaces;

public interface EjemploInterfaz {
    final double IVA= 0.2;
    final String NOMBRE_EMPRESA= "CES JPII";

    public default void metodoDefecto(){
        System.out.println("Método por defecto de la interfaz");
    }

    public abstract void metodoUno();
    public abstract int metodoDos();
    public abstract boolean metodoTres();

}
