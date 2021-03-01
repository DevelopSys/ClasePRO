package ejercicios.ejerciciosMultimedia;

public final class Libro extends Multimedia{

    private String ISBN;
    private int numeroPaginas;


    public Libro(int id, String titulo, String autor, String formato,
                 int tamanio, String ISBN, int numeroPaginas){
        super(id,titulo,autor,formato,tamanio);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(){}

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN "+ISBN);
        System.out.println("Nº Páginas "+numeroPaginas);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


}
