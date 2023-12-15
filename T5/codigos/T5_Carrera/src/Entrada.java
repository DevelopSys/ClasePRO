import controller.Carrera;
import model.Circuito;
import model.Coche;

public class Entrada {

    public static void main(String[] args) {
        Coche participante1 = new Coche("Participante1","1234A",60,3000);
        Coche participante2 = new Coche("Participante2","2234A",60,3000);
        Coche participante3 = new Coche("Participante3","3234A",60,3000);
        Coche participante4 = new Coche("Participante4","4234A",60,3000);
        Circuito ciruito1 = new Circuito("Imola",300,5);
        Circuito ciruito2 = new Circuito("Jarama",600,8);
        Carrera carrera1 = new Carrera(ciruito1);
        carrera1.inscribirParticipante(participante1);
        carrera1.inscribirParticipante(participante2);
        carrera1.inscribirParticipante(participante3);

        //carrera1.setCircuito(ciruito2);
        carrera1.mostrarDatos();
        carrera1.mostrarParrilla();


        // velocidad = 0
        // acelerar(50)
            // velocidad = 0 + (0-50);
        /*participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.acelerar(200);
        participante1.mostrarDatos();
        System.out.println("Frenando......");
        participante1.frenar(100);
        participante1.mostrarDatos();
        System.out.println("Frenando......");
        participante1.frenar(100);
        participante1.mostrarDatos();*/

    }
}
