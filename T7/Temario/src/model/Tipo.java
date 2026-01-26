package model;

public enum Tipo {
    LIBRE("Esta asignatura es de libre ejecucion"),
    TRONCAL("Esta asignatura es de obligatorio cursado"),
    OPTATIVA("Esta asignatura solo tiene partes del curso");

    private Tipo(){}
    private Tipo(String descripcion){
        this.descripcion = descripcion;
    }
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
