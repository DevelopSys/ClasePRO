package tiendanidada.model;

import tiendanidada.model.Bicicleta;
import tiendanidada.utils.EspacioException;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Bicicleta<Integer>> listaStock;
    private ArrayList<Bicicleta<Double>> listaReparar;
    private double caja;
    private Almacen almacen;

    public Tienda() {
        listaReparar = new ArrayList<>();
        listaStock = new ArrayList<>();
        caja = 0;
    }

    public void agregarBici(Bicicleta<Integer> bicicleta) {
        this.listaStock.add(bicicleta);
    }

    public void mostrarBicisStock() {
        for (Bicicleta item : listaStock) {
            item.mostrarDatos();
        }
    }

    public void agregarRepararBicicleta(Bicicleta<Double> bicicleta) throws EspacioException, NullPointerException {
        if (almacen.getNumeroPlazas() == listaReparar.size()) {
            throw new EspacioException("No hay espacio");
        } else {
            this.listaReparar.add(bicicleta);
        }
    }

    public void venderBicicleta(int posicion){
        try{
            //listaStock.get(posicion).mostrarDatos();
            listaStock.remove(listaStock.get(posicion));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public void repararBicis() {
        for (int i = 0; i < listaReparar.size(); i++) {
            caja += listaReparar.get(i).reparar();
            listaReparar.get(i).setEstado(true);
            listaReparar.remove(listaReparar.get(i));
        }

        /*for (Bicicleta<Double> item : listaReparar) {
            caja += item.reparar();
            item.setEstado(true);
            listaReparar.remove(item);
        }*/

        System.out.println("La caja acumulada de reparaciones es : "+caja);
    }

    public void construirAlmacen(int plazas) {
        this.almacen = new Almacen(plazas);
    }

    public ArrayList<Bicicleta<Integer>> getListaStock() {
        return listaStock;
    }

    public void setListaStock(ArrayList<Bicicleta<Integer>> listaStock) {
        this.listaStock = listaStock;
    }

    public ArrayList<Bicicleta<Double>> getListaReparar() {
        return listaReparar;
    }

    public void setListaReparar(ArrayList<Bicicleta<Double>> listaReparar) {
        this.listaReparar = listaReparar;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    class Almacen {
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
