public final class Imagen extends Elemento implements Ejecutable{

    private String ISBN;

    public Imagen() {

    }

    public Imagen(String identificador, String titulo, String autor, String formato, int tamaño, String ISBN) {
        super(identificador, titulo, autor, formato, tamaño);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean ejecutar() {
        ISBN = "asdasdasdasd";
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }
}
