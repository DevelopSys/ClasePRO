package terrenoanidado.model;

import terrenoanidado.utils.TerrenoException;

public class Terreno {


    private double precio;
    private int metros, metrosDisponibles;
    private Casa casa;
    private Orientacion orientacion;


    public Terreno() {
    }

    public Terreno(int precio, int metros, Orientacion orientacion) {
        this.precio = precio;
        this.metros = metros;
        this.orientacion = orientacion;
        this.metrosDisponibles = metros;
    }

    public void construirCasa(int metros) throws TerrenoException {
        if (metros > this.metros) {
            throw new TerrenoException("No puedes construir la casa porque hay terreno disponible");
        } else {
            casa = new Casa(metros);
            metrosDisponibles -= metros;
            revalorizarTerreno();
        }
    }

    private void revalorizarTerreno() {

        // 25 si han casa
        // 30 si la casa es mas de 100
        // 50 si hay piscina

        if (casa != null && casa.isPiscina()) {
            precio *= 1.50;
        } else if (casa != null && casa.getMetros() >= 100) {
            precio *= 1.30;
        } else if (casa != null) {
            precio *= 1.25;
        }

    }

    public void construirHabitacion(int metros){
        try {
            casa.construirHabitacion(metros);
        } catch (TerrenoException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("La casa no esta en el terreno");
        }
    }

    public void construirPiscina(){
        try {
            casa.construirPiscina();
        } catch (NullPointerException e){
            System.out.println("La casa no esta en el terreno");
        }
    }

    public void mostrarDatos(){
        System.out.println("Los metros del terreno son "+metros);
        System.out.println("Los metros disponibles del terreno son "+metrosDisponibles);
        System.out.println("El precio del terreno es "+precio);
        if (casa!=null){
            System.out.println("La casa tiene "+casa.getMetros());
            System.out.println("La casa tiene "+casa.getNumeroHabitaciones());
            System.out.println("La casa tiene "+casa.getMetrosDisponibles());
            if (casa.isPiscina()){
                System.out.println("La casa cuenta con piscina");
            }
        }
    }



    public void construirAnexo(int metros){
        try {
            casa.construirAnexo(metros);
        } catch (TerrenoException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("La casa no esta en el terreno");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

     public class Casa {
        int metros, numeroHabitaciones, metrosDisponibles;
        boolean piscina;

        Casa(int metros) {
            this.metros = metros;
            this.numeroHabitaciones = 1;
            metrosDisponibles = metros;
        }

        public void construirAnexo(int metros) throws TerrenoException{
            if (metros>metrosDisponibles){
                throw new TerrenoException("No se puede construir el anexo");
            } else {
                //metrosDisponibles -= metros;
                Terreno.this.metrosDisponibles -= metros;
            }
        }

        public void construirPiscina(){
            if (!piscina){
                piscina = true;
                revalorizarTerreno();
            } else {
                System.out.println("Ya tienes una piscina");
            }
        }

        public void construirHabitacion(int metros) throws TerrenoException{
            if (metros>metrosDisponibles){
                throw new TerrenoException("No hay metros para la habitacion");
            } else {
                metrosDisponibles -= metros;
                numeroHabitaciones++;
                System.out.println("habitacion construida");
            }
        }

        public int getMetrosDisponibles() {
            return metrosDisponibles;
        }

        public void setMetrosDisponibles(int metrosDisponibles) {
            this.metrosDisponibles = metrosDisponibles;
        }

        public int getMetros() {
            return metros;
        }

        public void setMetros(int metros) {
            this.metros = metros;
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
