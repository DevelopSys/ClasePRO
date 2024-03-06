package partidoanidado;

import estaticos.model.Equipo;
import partidoanidado.model.Partido;

public class Entrada {

    public static void main(String[] args) {
        //Partido partido = new Partido("Barcelona","R. Madrid");
        Partido partido = new Partido();
        Partido.Equipo madrid = partido.new Equipo("madrid");
        Partido.Equipo barcelona = partido.new Equipo("barcelona");
        barcelona.setPuntos(3);

        // partido.setEquipoLocal(barcelona);
        // partido.setEquipoVisitante(madrid);

        partido.mostrarResultado();

    }
}
