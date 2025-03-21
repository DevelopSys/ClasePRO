package controller;

import model.Helado;
import utils.CantidadException;
import utils.Sabores;

import java.util.ArrayList;

public class Heladeria<T, S> {

    private ArrayList<T> catalogoProductos1;
    private ArrayList<S> catalogoProductos2;
    private ArrayList<T> pedidos;
    private MaquinaHelados maquinaHelados;

    public Heladeria() {
        catalogoProductos1 = new ArrayList();
        pedidos = new ArrayList<>();
    }

    public void comprarMaquina(int capacidad) {
        this.maquinaHelados = new MaquinaHelados(capacidad);
    }

    public void realizarPedido(T producto) {

        try {
            maquinaHelados.generarHelado();
            this.pedidos.add(producto);
        } catch (CantidadException e){
            System.out.println(e.getMessage());
        }
    }

    class MaquinaHelados {
        // acceder a todos los datos de la clase padre
        private int capacidad;
        private Sabores sabor;

        public MaquinaHelados(int capacidad) {
            this.capacidad = capacidad;
        }

        public void generarHelado() throws CantidadException {
            // generado
            if (capacidad == 0) {
                throw new CantidadException("Error en la generacion del helado");
            } else {
                capacidad--;
            }
        }
    }

}
