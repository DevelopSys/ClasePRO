import controller.Campeonato;
import model.Carrera;
import model.CarreraCoches;
import model.Coche;

public class MainCampeonato {

    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        campeonato.inscribirCarrera(new CarreraCoches(7000, "Abudabi"));
        campeonato.inscribirCarrera(new CarreraCoches(10000, "Las Vegas"));
        campeonato.inscribirCarrera(new CarreraCoches(17000, "Valencia"));
        campeonato.inscribirCarrera(new CarreraCoches(12000, "Barcelona"));
        campeonato.inscribirCarrera(new CarreraCoches(9000, "Italia"));
        // campeonato.mostrarCarreras();
        campeonato.inscribirParticipante(new Coche("Ford1", "Focus1", "1234A", 100));
        campeonato.inscribirParticipante(new Coche("Ford2", "Focus2", "2234A", 120));
        campeonato.inscribirParticipante(new Coche("Ford3", "Focus3", "3234A", 130));
        campeonato.inscribirParticipante(new Coche("Ford4", "Focus4", "4234A", 110));
        campeonato.inscribirParticipante(new Coche("Ford5", "Focus5", "5234A", 110));
        // campeonato.mostrarParticipantes();
        campeonato.iniciarCampeonato();
        System.out.println("Procedemos a imprimir la clasificación final");
        campeonato.mostrarClasificacionFinal();
    }
}
