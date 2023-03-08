package model;

import java.util.ArrayList;

public class Tienda {

    private Almacen almacen;
    private ArrayList<Bicicleta> bicisStock;
    private ArrayList<Bicicleta> bicisReparar;
    private int caja;

    public Tienda(){
        bicisReparar = new ArrayList<>();
        bicisStock = new ArrayList<>();
    }

    public void construirAlmacen(int numeroPlazas){
        almacen = new Almacen(numeroPlazas);
    }

    public void venderBicicleta(int pocision){

        // cuando la posicion no se pueda acceder al array
        try {
            caja +=  this.bicisStock.remove(pocision).getPrecio();
        } catch (IndexOutOfBoundsException e){
            System.out.println("No se puede vender la bici");
        }

    }

    public void agregarBicicleta(Bicicleta bicicleta){
        bicisStock.add(bicicleta);
    }

    public void agregarBicicletaReapar(Bicicleta bicicleta) throws Exception {
        if (almacen.getNumeroPlazas()>this.bicisReparar.size()){
            bicisReparar.add(bicicleta);
        } else {
            throw new Exception("Error detectado");
        }

    }

    public void repararBicis(){
        for (int i = 0; i <bicisReparar.size(); i++) {
            caja += bicisReparar.get(i).reparar();
            System.out.println("Bici reparada");
            bicisReparar.remove(bicisReparar.get(i));
            bicisReparar.get(i).mostrarDatos();
        }

        /*for ( Bicicleta item : bicisReparar ) {
            caja += item.reparar();
            System.out.println("Bici reparada");
            item.mostrarDatos();
            //bicisReparar.remove(item);
        }*/
        bicisReparar.clear();
    }

    public void verDatosStock(){
        for (Bicicleta item : bicisStock ) {
            item.mostrarDatos();
        }
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public ArrayList<Bicicleta> getBicisStock() {
        return bicisStock;
    }

    public void setBicisStock(ArrayList<Bicicleta> bicisStock) {
        this.bicisStock = bicisStock;
    }

    public ArrayList<Bicicleta> getBicisReparar() {
        return bicisReparar;
    }

    public void setBicisReparar(ArrayList<Bicicleta> bicisReparar) {
        this.bicisReparar = bicisReparar;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    class Almacen{
        int numeroPlazas;

        public Almacen() {
        }

        public Almacen(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }

        public int getNumeroPlazas() {
            return numeroPlazas;
        }

        public void setNumeroPlazas(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }
    }

}
