package ejercicios.ejericcioInterfaces;

public final class Imagen extends Elemento{

    private String ISBN;

    public Imagen(int identificador, int tamanio, String titulo, String autor, String formato, String ISBN) {
        super(identificador, tamanio, titulo, autor, formato);
        this.ISBN = ISBN;
    }

    public Imagen(){}

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
