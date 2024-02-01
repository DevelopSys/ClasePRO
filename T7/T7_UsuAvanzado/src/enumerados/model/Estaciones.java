package enumerados.model;

public enum Estaciones {

    // plantillas
    invierno("invierno", 1, false),
    primavera("primavera", 20, true),
    verano("verano", 30, true),
    otonio("otoño", 10, false);

    private String nombre;
    private int temperaturaMedia;
    private boolean incidenciaUV;

    private Estaciones(String nombre, int temperaturaMedia, boolean incidenciaUV) {
        this.nombre = nombre;
        this.incidenciaUV = incidenciaUV;
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public boolean isIncidenciaUV() {
        return incidenciaUV;
    }

    public void setIncidenciaUV(boolean incidenciaUV) {
        this.incidenciaUV = incidenciaUV;
    }
}
