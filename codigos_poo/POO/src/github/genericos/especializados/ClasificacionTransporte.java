package github.genericos.especializados;

import github.genericos.especializados.abstractas.Clasificable;
import github.genericos.especializados.abstractas.Tranporte;

import java.util.ArrayList;

public class ClasificacionTransporte<T extends Tranporte> implements Clasificable {

    ArrayList<T> listaTransporte;

    public ClasificacionTransporte() {
        listaTransporte = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return listaTransporte.size();
    }

    @Override
    public int getNames() {
        return listaTransporte.size();
    }

    @Override
    public String getType() {
        return "hola";
    }
}
