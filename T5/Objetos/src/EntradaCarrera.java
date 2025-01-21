import controller.Carrera;
import model.Coche;

public class EntradaCarrera {

    public static void main(String[] args) {
        Carrera carrera1 = new Carrera(5, "Cheste");
        // participantes = [c1], vueltas=5,nombre="Cheste", ganador=null
        Carrera carrera2 = new Carrera(3, "Jarama");
        // participantes = [], vueltas=3,nombre="Jarama", ganador=null
        // carrera1.getParticipantes().add()
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 500));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera1.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        carrera2.inscribirParticipante(new Coche("Ford", "Focus", "1234A", 200));
        
    }
}
