public final class Dialecto extends Idioma{

    // al base del dialecto;
    private Idioma idioma;
    // el numero del dialecto
    private int numeroHablates;

    public Dialecto(String nombre, int numeroHablantes, Idioma idioma, int numeroHablates) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
        this.numeroHablates = numeroHablates;
    }

    public Dialecto(Idioma idioma, int numeroHablates) {
        this.idioma = idioma;
        this.numeroHablates = numeroHablates;
    }

    @Override
    public void saludar() {
        System.out.println("Este es el saludo en catalan");

    }

    @Override
    public void despedir() {
        System.out.println("Esta la despedida en catalan");
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public int getNumeroHablates() {
        return numeroHablates;
    }

    public void setNumeroHablates(int numeroHablates) {
        this.numeroHablates = numeroHablates;
    }

    public void calcularNumeroHablantes(int numeroHablates, Cuantificable c){
        c.cuantificarHablantes(numeroHablates);
    }


}
