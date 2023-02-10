package model;

public final class Revista extends Elemento{

    private String ISBN;

    public Revista() {
    }

    public Revista(int id, int seccion, String titulo, String ISBN) {
        super(id, seccion, titulo);
        this.ISBN = ISBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN "+ ISBN);
    }
}
