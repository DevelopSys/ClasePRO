import model.Centralita;
import model.Llamada;
import model.LlamadaLocal;
import model.LlamadaNacional;

public class Entrada {

    public static void main(String[] args) {


        // 0.50 + (0.15*duracion)
        LlamadaLocal llamadaLocal = new LlamadaLocal(123123,1231231,23);

        // 0.60*duracion
        LlamadaNacional llamadaNacional = new LlamadaNacional(123123,123123123,23,'C');


        Centralita centralita = new Centralita();
        // listaLlamadas = []

        centralita.agregarLlamada(llamadaLocal);
        centralita.agregarLlamada(llamadaNacional);


        //centralita.listarLlamadas();
        //centralita.mostrarCosteAcumulado();
        centralita.listarDetalleClase(LlamadaLocal.class);

    }
}
