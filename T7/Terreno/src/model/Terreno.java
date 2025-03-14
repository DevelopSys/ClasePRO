package model;

import utils.Orientacion;

public class Terreno {
    private Casa casa;
    private int metrosCuadrados;
    private Orientacion orientacion;
    private double valoracion;

    public Terreno() {
    }

    // 200000
    public Terreno(int metrosCuadrados, Orientacion orientacion, double valoracion) {
        this.metrosCuadrados = metrosCuadrados;
        this.orientacion = orientacion;
        this.valoracion = valoracion * orientacion.getRevalorizacion();
    }

    public void construirCasa(int metrosCuadrados){
        if (casa==null && this.metrosCuadrados>metrosCuadrados){
            // realizazo la construccion;
            casa = new Casa();
            revalorizarTerreno();
        }
    }

    public void revalorizarTerreno(){

        // casa? -> null
        // casa > 100 -> casa.getM2
        // casa piscina ? -> casa.isPiscina
        // casa orientacion ? -> casa.getOrientacion.getRevalorizacion
        this.valoracion;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public class Casa{

    }
}
