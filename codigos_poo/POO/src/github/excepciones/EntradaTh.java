package github.excepciones;

public class EntradaTh {

    public static void main(String[] args) {
        LanzarEx lanzarEx = new LanzarEx();
        try {
            lanzarEx.lanzarMiExcepcion();
        } catch (MiExcepcion miExcepcion) {
            System.out.println(miExcepcion.getMessage());
        }
    }
}
