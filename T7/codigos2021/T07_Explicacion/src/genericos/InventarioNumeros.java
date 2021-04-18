package genericos;

import java.util.ArrayList;

public class InventarioNumeros implements InterfazGenerica<Integer,Integer> {

    ArrayList<Integer> listaNumeros;

    public InventarioNumeros() {
        this.listaNumeros = new ArrayList<>();
    }


    @Override
    public void agregarElemento(Integer elemento) {

    }

    @Override
    public void buscarElemento(Integer id) {

    }

    @Override
    public void modificarElemento(Integer elemento) {

    }

    @Override
    public void borrarElemento(Integer elemento) {

    }
}
