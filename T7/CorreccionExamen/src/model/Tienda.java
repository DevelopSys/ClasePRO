package model;

import util.PlazasException;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Bici> stock;
    private double caja;
    private Almacen almacen;

    public void construirAlmacen(int plazas) {
        if (almacen == null) {
            almacen = new Almacen(plazas);
        } else {
            System.out.println("Ya tienes almacen creado");
        }
    }

    public void aceptarBiciReparacion(Bici bici) {
        try {
            almacen.agregarReparacion(bici);
        } catch (PlazasException e) {
            System.out.println(e);
            // solucion
        }
    }

    public void agregarBiciStock(Bici bici) {
        stock.add(bici);
    }

    public void procesoReparacion() {
        caja += almacen.reperarTodas();
    }

    public void venderBici(int posicion) {
        /*caja += stock.get(posicion).getPrecio();
        stock.remove(posicion);*/
        try {
            Bici bici = stock.remove(posicion);
            caja += bici.getPeso();
        } catch (Exception e) {
            System.out.println("No se puede vender una bici que no existe");
        }

    }

    public ArrayList<Bici> getStock() {
        return stock;
    }

    public double getCaja() {
        return caja;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    class Almacen {
        private int nPlazas;
        private ArrayList<Bici> reparaciones;

        public Almacen() {
        }

        public Almacen(int nPlazas) {
            this.nPlazas = nPlazas;
            this.reparaciones = new ArrayList<>();
        }

        public void agregarReparacion(Bici bici) {
            if (this.reparaciones.size() == nPlazas) {
                throw new PlazasException("Plazas llenas");
            } else {
                this.reparaciones.add(bici);
            }

        }

        public double reperarTodas() {
            double cajaReparaciones = 0;

            for (Bici bici : reparaciones) {
                cajaReparaciones += bici.reparar();
                cajaReparaciones += (int) (Math.random() * 51) + 50;
            }
            reparaciones.clear();

            return cajaReparaciones;
        }
    }

}
