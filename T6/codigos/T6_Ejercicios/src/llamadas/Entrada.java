package llamadas;

import llamadas.constantes.Costes;
import llamadas.controller.Centralita;
import llamadas.model.LlamadaNacional;
import llamadas.model.LlamadaProvincial;
import llamadas.model.Local;

public class Entrada {

    public static void main(String[] args) {

        Local local = new Local(123,123123,30);
        // 0
        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(123123,123123,30);
        // 30 * 0.15
        LlamadaNacional llamadaNacional = new LlamadaNacional(123123,123123,30,3);
        // 30 *0.30
        //llamadaNacional.mostrarDatos();

        Centralita centralita = new Centralita();
        centralita.registrarLlamada(local);
        centralita.registrarLlamada(llamadaNacional);
        centralita.registrarLlamada(llamadaProvincial);
        System.out.println(centralita.getCosteTotal());
        centralita.listarLlamadas();
        //centralita.buscarLlamadas(123123);

    }


}
