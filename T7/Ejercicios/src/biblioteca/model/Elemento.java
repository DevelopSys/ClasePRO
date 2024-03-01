package biblioteca.model;

public abstract class Elemento {

    private String titulo, seccion;
    private int id;
    private boolean estado;

    public Elemento(String titulo, String seccion, int id) {
        this.titulo = titulo;
        this.seccion = seccion;
        this.id = id;
        // estado = false
    }

    public Elemento() {
    }

    public void mostrarDatos(){
        System.out.println("ID "+id);
        System.out.println("Titulo "+titulo);
        System.out.println("Seccion "+seccion);
        System.out.println("Estado "+estado);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
