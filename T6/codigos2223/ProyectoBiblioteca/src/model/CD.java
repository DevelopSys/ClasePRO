package model;

import constantes.EnumCD;

public final class CD extends Elemento{

    private int anio;
    private EnumCD tipo;

    public CD() {
    }

    public CD(int id, int seccion, String titulo, int anio, EnumCD tipo) {
        super(id, seccion, titulo);
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año "+anio);
        System.out.println("Tipo "+tipo.name());
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public EnumCD getTipo() {
        return tipo;
    }

    public void setTipo(EnumCD tipo) {
        this.tipo = tipo;
    }
}
