package correccionExamen;

import java.util.ArrayList;

public class Tienda {

    private Almacen almacen;
    private ArrayList<Bicicleta> bicisStock, bicisReparar;
    private double caja;

    public Tienda() {
        bicisReparar = new ArrayList<>();
        bicisStock = new ArrayList<>();
    }

    public void construirAlmacen(int plazas) {
        almacen = new Almacen(plazas);
    }

    public void agregarBicicleta(Bicicleta bicicleta) {
        try {
            bicisStock.add(bicicleta);
        } catch (NullPointerException e) {
            System.out.println("El array al que intentas agregar es nulo");
        }
    }

    public void repararBicicleta(Bicicleta bicicleta) {
        try {

            // 0 2 -> no fallo
            // 1 2 -> no fallo
            // 2 2 -> fallo
            if (bicisReparar.size() >= almacen.getNumeroPlazas()) {
                throw new AlmacenException("No hay plazas disponibles");
            }
            // si estas aqui no has fallado
            bicisReparar.add(bicicleta);


        } catch (NullPointerException e) {
            System.out.println("el array es nulo");
        } catch (AlmacenException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarBicis() {
        for (Bicicleta itemBici : bicisStock) {
            itemBici.mostrarDatos();
        }
    }

    public void repararTodasBicis(){
        for (Bicicleta itemBici:bicisReparar) {
            this.caja += itemBici.reparar().doubleValue();
        }
    }

    public void venderBicicleta(int posicion){
        try {
            // array de 4 bicis --> array.get(3)
            // array de 4 bicis --> array.get(4) --> fallo
            this.bicisStock.get(posicion).mostrarDatos();
            this.bicisStock.remove(posicion);
            caja += Math.random()*100;

        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Fallo generico");
        }
    }

    public void listarBicisReparar() {
        for (Bicicleta itemBici : bicisReparar) {
            itemBici.mostrarDatos();
        }
    }


    class Almacen {
        private int numeroPlazas;

        public Almacen(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }

        public Almacen() {
        }


        public int getNumeroPlazas() {
            return numeroPlazas;
        }

        public void setNumeroPlazas(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }
    }
}
