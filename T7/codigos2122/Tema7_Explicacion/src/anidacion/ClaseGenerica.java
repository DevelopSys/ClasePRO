package anidacion;

public class ClaseGenerica {

    private  String nombre;
    private  int numero;
    private  boolean acierto;
    private ClaseStatic claseStatic;

    public ClaseGenerica(String nombre, int numero, boolean acierto, ClaseStatic claseStatic) {
        this.nombre = nombre;
        this.numero = numero;
        this.acierto = acierto;
        this.claseStatic = claseStatic;
    }

    public void metodoGenerico(){
        System.out.println(nombre);
        System.out.println(numero);
        System.out.println(acierto);
        claseStatic.metodoClaseStatic();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    static class ClaseStatic{
        private String nombreStatic;
        private int numeroStatic;
        private boolean aciertoStatic;

        public ClaseStatic(String nombreStatic, int numeroStatic, boolean aciertoStatic) {
            this.nombreStatic = nombreStatic;
            this.numeroStatic = numeroStatic;
            this.aciertoStatic = aciertoStatic;
        }

        public void metodoClaseStatic(){
            System.out.println(nombreStatic);
            System.out.println(numeroStatic);
            System.out.println(aciertoStatic);
        }
    }
}
