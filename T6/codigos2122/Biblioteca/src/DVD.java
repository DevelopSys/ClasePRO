public final class DVD extends Elemento {

    private String director;
    private String[] actores;
    private int anioEdicion;
    private Tipo tipo;

    public DVD(String titulo, int id, Seccion seccion, String director, String[] actores, int anioEdicion, Tipo tipo) {
        super(titulo, id, seccion);
        this.director = director;
        this.actores = actores;
        this.anioEdicion = anioEdicion;
        this.tipo = tipo;
    }

    public DVD() {
        }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(director);
        System.out.println(anioEdicion);
        System.out.println(tipo.name());
        System.out.println("Actores");
        for (String item: actores) {
            System.out.println("\t item");
        }
    }
}
