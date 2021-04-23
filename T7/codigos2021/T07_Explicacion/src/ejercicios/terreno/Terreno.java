package ejercicios.terreno;

public class Terreno {

    protected int metrosCuadradosTerreno;
    protected Casa casa;
    protected int valoracion;

    public Terreno(int metrosCuadrados, int valoracion) {
        this.metrosCuadradosTerreno = metrosCuadrados;
        this.valoracion = valoracion;
    }

    public void construirCasa(int metros, boolean piscina, int habitaciones) {
        casa = new Casa(metros, piscina, habitaciones);
    }

    public void revalorizarCasa() {
        // TODO
        if (casa.getMetrosCuadrados() > 100 && casa.getNumeroHabitaciones() > 4 && casa.isPiscina()) {
            this.valoracion = this.valoracion + (int) (this.valoracion * 0.50);
        } else if (casa.getMetrosCuadrados() > 100 && casa.getNumeroHabitaciones() > 4) {
            this.valoracion = this.valoracion + (int) (this.valoracion * 0.35);
        } else if (casa.getMetrosCuadrados() > 100) {
            this.valoracion = this.valoracion + (int) (this.valoracion * 0.25);
        } else if (casa!=null) {
            this.valoracion = this.valoracion + (int) (this.valoracion * 0.20);
        }
    }

    public int getMetrosCuadradosTerreno() {
        return metrosCuadradosTerreno;
    }

    public void setMetrosCuadradosTerreno(int metrosCuadradosTerreno) {
        this.metrosCuadradosTerreno = metrosCuadradosTerreno;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    class Casa {

        private int metrosCuadrados;
        private boolean piscina;
        private int numeroHabitaciones;

        public Casa(int metrosCuadrados, boolean piscina, int numeroHabitaciones) {
            this.metrosCuadrados = metrosCuadrados;
            this.piscina = piscina;
            this.numeroHabitaciones = numeroHabitaciones;
        }

        public void construirHabitacion(int metros) throws TerrenoException {

            if (metros > metrosCuadrados) {
                throw new TerrenoException("habitación muy grande");
            } else {
                numeroHabitaciones++;
                revalorizarCasa();
            }

        }

        public void construirPiscina() {
            if (piscina) {
                System.out.println("ya tienes una piscina");
            } else {
                this.piscina = true;
                revalorizarCasa();
            }
        }

        public void construirAnexo(int metros) throws TerrenoException {
            if (metros > (metrosCuadradosTerreno - metrosCuadrados)) {
                throw new TerrenoException("Terreno muy grande");
            }
        }

        public int getMetrosCuadrados() {
            return metrosCuadrados;
        }

        public void setMetrosCuadrados(int metrosCuadrados) {
            this.metrosCuadrados = metrosCuadrados;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }

        public int getNumeroHabitaciones() {
            return numeroHabitaciones;
        }

        public void setNumeroHabitaciones(int numeroHabitaciones) {
            this.numeroHabitaciones = numeroHabitaciones;
        }
    }
}
