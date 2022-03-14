import javax.swing.plaf.PanelUI;

public abstract class Elemento {

    protected String titulo;
    protected int id;
    protected boolean disponible;
    protected Seccion seccion;

    public Elemento(String titulo, int id, Seccion seccion) {
        this.titulo = titulo;
        this.id = id;
        this.seccion = seccion;
        disponible = true;
    }

    public Elemento() {
    }

    public void mostrarDatos(){
        System.out.println(titulo);
        System.out.println(disponible);
        System.out.println(id);
        System.out.println(seccion.name());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
}
