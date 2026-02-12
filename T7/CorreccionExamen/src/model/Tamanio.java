package model;

public enum Tamanio {

    S("Bici pequeña para gente pequeña"), M("Bici mediana para gente mediana"), L("Bici grande para gente grande");

    private String descripcion;

    private Tamanio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
