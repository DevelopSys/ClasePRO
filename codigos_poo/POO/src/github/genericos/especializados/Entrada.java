package github.genericos.especializados;

import github.genericos.especializados.abstractas.Alimento;
import github.genericos.especializados.abstractas.Clasificable;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        ClasificacionTransporte<Coche> clasificacionCoches = new ClasificacionTransporte();
        ClasificacionTransporte<Moto> clasificacionMotos = new ClasificacionTransporte();
        InventarioGenerico<Clasificable> clasificableInventarioGenerico = new InventarioGenerico();
        clasificableInventarioGenerico.agregarElemento(clasificacionCoches);
        clasificableInventarioGenerico.agregarElemento(clasificacionMotos);
    }
}
