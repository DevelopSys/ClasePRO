package genericos;

import java.util.ArrayList;

public class InventarioLetras implements InterfazGenerica<String, Character> {


    private ArrayList<String> listaLetras;

    public InventarioLetras() {
        this.listaLetras = new ArrayList<>();
    }


    @Override
    public void agregarElemento(String elemento) {

    }

    @Override
    public void buscarElemento(Character id) {

    }

    @Override
    public void modificarElemento(String elemento) {

    }

    @Override
    public void borrarElemento(String elemento) {

    }
}
