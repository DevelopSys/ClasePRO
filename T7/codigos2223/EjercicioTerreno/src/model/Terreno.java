package model;

import utils.Orientacion;

import java.net.PortUnreachableException;
import java.util.ArrayList;

public class Terreno {

    private Casa casa;
    private int mCuadrados;
    private int precio;
    private Orientacion orientacion;

    public Terreno() {
    }

    public Terreno(int mCuadrados, int precio, Orientacion orientacion) {
        this.mCuadrados = mCuadrados;
        this.precio = precio;
        this.orientacion = orientacion;
        // casa = null;
    }

    public void revalorizarTerreno(){

        // hay casa
            // 25 si hay casa
            // 30 si la casa tiene mas de 100m2
            // si ademas tiene piscina
        // no hay casa
            // no hago nada


        /*if (casa!=null){
            precio = (int) (precio + (precio*0.25));
        }
        if (casa!=null && casa > 100){

        }
        if (casa!=null && casa > 100 && piscina) {

        }*/
        if (casa!=null){
            if (getCasa().hayPiscina && getCasa().getMetrosCuadradosCasa()>100){
                // si ademas tiene piscina
                precio = (int) (precio + (precio *0.5));

            } else if (getCasa().getMetrosCuadradosCasa()>100){
                // 30 si la casa tiene mas de 100m2
                precio = (int) (precio + (precio *0.3));
            } else {
                // 25 si hay casa
                precio = (int) (precio + (precio *0.25));
            }
            // lo mas especifico hay piscina y 100m2 y casa
            System.out.println("La revalorizacion se ha llevado a cabo, el nuevo precio es de "+precio);
        }

    }

    public void construirCasa(int metros, int numeroHabitaciones){
        if (casa==null){
            if (this.mCuadrados>metros){
                this.casa = new Casa(metros,numeroHabitaciones);
                System.out.println("Casa contruida correctamente");
            } else {
                System.out.println("No se puede construir la casa");
            }

        } else {
            System.out.println("El terreno ya cuenta con una casa");
        }
    }

    public void mostrarDatos(){
        System.out.println("Precio: "+precio);
        System.out.println("Orientacion: "+orientacion.name());
        casa.mostrarDatos();
    }

    public void construirPiscinaTerreno(){
        casa.construirPiscina();
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(int mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public class Casa {

        private int metrosCuadradosCasa;
        private boolean hayPiscina;
        private int numeroHabitaciones;
        private ArrayList<Habitacion> habitaciones;


        public Casa() {
        }

        public Casa(int metrosCuadradosCasa, int numeroHabitaciones) {
            this.metrosCuadradosCasa = metrosCuadradosCasa;
            this.numeroHabitaciones = numeroHabitaciones;
            this.habitaciones = new ArrayList<>();
        }

        public void mostrarDatos(){
            System.out.println("Metros: "+metrosCuadradosCasa );
            System.out.println("Piscina: "+hayPiscina );
            System.out.println("Numero habitaciones: "+numeroHabitaciones );
        }

        public void construirHabitacion(int metros, String estancia){

            Habitacion habitacion = new Habitacion(estancia, metros);

            // calcular el tamaño de todas las habitaciones construidas

            int metrosHabitaciones = 0;
            for ( Habitacion habitacionItem : habitaciones ) {
                metrosHabitaciones += habitacionItem.getMetrosHabitacion();
            }

            if ((metrosCuadradosCasa-metrosHabitaciones)>metros){
                habitaciones.add(habitacion);
                numeroHabitaciones++;
            } else {
                System.out.println("No hay espacio para construir");
            }
        }

        public void construirAnexo(int metros){
            // 1000 400 600
            if ((mCuadrados - metrosCuadradosCasa) > metros){
                System.out.println("Terreno construido");
            } else {
                System.out.println("No hay espacio para construir el terreno");
            }
        }

        public void construirPiscina(){
            if(!hayPiscina){
                hayPiscina = true;
                System.out.println("Piscina construida correctamente");

            } else {
                System.out.println("La casa ya cuenta con una piscina");
            }
        }

        public int getMetrosCuadradosCasa() {
            return metrosCuadradosCasa;
        }

        public void setMetrosCuadradosCasa(int metrosCuadradosCasa) {
            this.metrosCuadradosCasa = metrosCuadradosCasa;
        }

        public boolean isHayPiscina() {
            return hayPiscina;
        }

        public void setHayPiscina(boolean hayPiscina) {
            this.hayPiscina = hayPiscina;
        }

        public int getNumeroHabitaciones() {
            return numeroHabitaciones;
        }

        public void setNumeroHabitaciones(int numeroHabitaciones) {
            this.numeroHabitaciones = numeroHabitaciones;
        }

        class Habitacion{
            String estancia;
            int metrosHabitacion;

            public Habitacion() {
            }

            public Habitacion(String estancia, int metrosHabitacion) {
                this.estancia = estancia;
                this.metrosHabitacion = metrosHabitacion;
            }

            public String getEstancia() {
                return estancia;
            }

            public void setEstancia(String estancia) {
                this.estancia = estancia;
            }

            public int getMetrosHabitacion() {
                return metrosHabitacion;
            }

            public void setMetrosHabitacion(int metrosHabitacion) {
                this.metrosHabitacion = metrosHabitacion;
            }
        }

    }

}
