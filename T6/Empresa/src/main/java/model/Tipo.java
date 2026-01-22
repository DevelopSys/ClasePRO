package model;

public enum Tipo {

    BLANDO(1,"este jefe es un blandegue"),
    MODERADO(5,"este jefe es mediano"),
    DURO(10,"Cuidado con este jefe");
    // atributos
    private int nivelDureza;
    private String descripcion;
    // constructores -> vacio
    Tipo(int nivelDureza, String descripcion){
        this.descripcion = descripcion;
        this.nivelDureza = nivelDureza;
    }
    Tipo(){

    }
    // metodos
    public int getNivelDureza() {
        return nivelDureza;
    }

    public void setNivelDureza(int nivelDureza) {
        this.nivelDureza = nivelDureza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
