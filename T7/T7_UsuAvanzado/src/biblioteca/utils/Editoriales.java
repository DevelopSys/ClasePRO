package biblioteca.utils;

public enum Editoriales {

    SM("sm", 2000),
    RAMA("RAMA", 2010),
    LIBROSA("libros s.a", 2009),
    LECTURAS("lecturas s.l", 1999);

    private String nombre;
    private int fundacion;

    Editoriales(String nombre, int fundacion) {
        this.nombre = nombre;
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }
}
