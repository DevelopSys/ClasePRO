package utils;

public enum Orientacion {
    NORTE("norte",1.1), SUR("sur",1.1),
    ESTE("este",1.05), OESTE("oeste",1.05);

    private double revalorizacion;
    private String nombre;

    Orientacion(String nombre, double revalorizacion) {
        this.revalorizacion = revalorizacion;
        this.nombre = nombre;
    }

    public double getRevalorizacion() {
        return revalorizacion;
    }
}
