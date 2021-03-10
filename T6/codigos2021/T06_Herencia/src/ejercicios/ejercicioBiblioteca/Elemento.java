package ejercicios.ejercicioBiblioteca;

public abstract class Elemento {
    protected int id;
    protected String titulo, seccion;
    protected boolean disponible;

    public Elemento(int id, String titulo, String seccion) {
        this.id = id;
        this.titulo = titulo;
        this.seccion = seccion;
        this.disponible = true;
    }

    public Elemento() {
    }

    public void mostarDatos(){
        System.out.println("ID "+id);
        System.out.println("Titulo "+titulo);
        System.out.println("Seccion "+seccion);
        System.out.println("Disponible "+disponible);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
