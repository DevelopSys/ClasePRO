import controller.Carrera;
import model.Coche;

public class EntradaCarrera {

    public static void main(String[] args) {
        Carrera carrera1 = new Carrera(5, "Cheste");
        carrera1.inscribirParticipante(new Coche("Ford1", "Focus1", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford2", "Focus2", "2234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford3", "Focus3", "3234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford4", "Focus4", "4234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford5", "Focus5", "5234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford6", "Focus6", "6234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford7", "Focus7", "7234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford8", "Focus8", "8234A", 200));
        carrera1.empezarCarrera();
        // carrera1.mostrarClasificacion();
        // carrera1.mostrarGanador();
    }
}
