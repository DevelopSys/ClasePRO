package model;

import utils.CasaException;
import utils.Orientacion;

public class Terreno {
    private Casa casa;
    private int metrosCuadrados;

    private int metrodDisponibleTerreno;
    private Orientacion orientacion;
    private double valoracion;

    public Terreno() {
    }

    // 200000
    public Terreno(int metrosCuadrados, Orientacion orientacion, double valoracion) {
        this.metrosCuadrados = metrosCuadrados;
        metrodDisponibleTerreno = metrosCuadrados;
        this.orientacion = orientacion;
        this.valoracion = valoracion * orientacion.getRevalorizacion();
    }

    public void construirCasa(int metrosCuadrados) throws CasaException {
        if (casa == null && this.metrosCuadrados > metrosCuadrados) {
            // realizazo la construccion;
            casa = new Casa(metrosCuadrados);
            revalorizarTerreno();
            metrodDisponibleTerreno -= metrosCuadrados;
        } else {
            throw new CasaException("No hay espacio para el terreno",3);
        }
    }

    public void revalorizarTerreno() {

        if (casa != null) {
            this.valoracion = this.valoracion * 1.25;
        }

        assert casa != null;
        if (casa.isPiscina()) {
            this.valoracion = this.valoracion * 1.5;
        }
        // casa? -> null
        // casa > 100 -> casa.getM2
        // casa piscina ? -> casa.isPiscina
        // casa orientacion ? -> casa.getOrientacion.getRevalorizacion

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

    public class Casa {
        private int numeroHabitaciones;
        private boolean piscina;
        private int metrosCuadrados;
        private int metrosDisponibles;

        public Casa(int metrosCuadrados) {
            this.metrosCuadrados = metrosCuadrados;
            this.metrosDisponibles = metrosCuadrados;
        }

        public void construirPiscina() {
            if (!piscina) {
                piscina = true;
                revalorizarTerreno();
            }
        }

        public void construirHabitacion(int metrosCuadrados) throws CasaException {
            if (metrosCuadrados > metrosDisponibles) {
                metrosDisponibles -= metrosCuadrados;
            } else {
                throw new CasaException("No hay espacio para el terreno",2);
            }
        }

        public void construirAnexo(int metrosCuadrados) throws CasaException {
            if (metrosCuadrados > metrodDisponibleTerreno) {
                metrosDisponibles -= metrosCuadrados;
            } else {
                throw new CasaException("No hay espacio para el terreno",1);
            }
        }

        public int getMetrosCuadrados() {
            return metrosCuadrados;
        }

        public void setMetrosCuadrados(int metrosCuadrados) {
            this.metrosCuadrados = metrosCuadrados;
        }

        public int getNumeroHabitaciones() {
            return numeroHabitaciones;
        }

        public void setNumeroHabitaciones(int numeroHabitaciones) {
            this.numeroHabitaciones = numeroHabitaciones;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }
    }
}
