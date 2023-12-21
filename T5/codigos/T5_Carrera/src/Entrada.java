import controller.Campeonato;
import controller.Carrera;
import model.Circuito;
import model.Coche;

public class Entrada {

    public static void main(String[] args) {
        Coche participante1 = new Coche("Participante1","1234",70,3000);
        Coche participante2 = new Coche("Participante2","2345",90,3000);
        Coche participante3 = new Coche("Participante3","3456",100,3000);
        Coche participante4 = new Coche("Participante4","4567",110,3000);
        Coche participante5 = new Coche("Participante5","5678",80,3000);
        Coche participante6 = new Coche("Participante6","6789",75,3000);
        Circuito ciruito1 = new Circuito("Imola",200,9);
        Circuito ciruito2 = new Circuito("Jarama",500,8);
        Circuito ciruito3 = new Circuito("Suzuka",300,5);
        Carrera carrera1 = new Carrera(ciruito1);
        Carrera carrera2 = new Carrera(ciruito2);
        Carrera carrera3 = new Carrera(ciruito3);
        Carrera carrera4 = new Carrera(ciruito1);
        Carrera carrera5 = new Carrera(ciruito2);
        Campeonato campeonato = new Campeonato("Campeonato CES");
        campeonato.inscribirParticipante(participante1);
        campeonato.inscribirParticipante(participante2);
        campeonato.inscribirParticipante(participante3);
        campeonato.inscribirParticipante(participante4);
        campeonato.inscribirParticipante(participante5);
        campeonato.inscribirParticipante(participante6);
        campeonato.agregarCarrera(carrera1);
        campeonato.agregarCarrera(carrera2);
        campeonato.agregarCarrera(carrera3);
        campeonato.agregarCarrera(carrera4);
        campeonato.agregarCarrera(carrera5);
        //campeonato.mostrarDatos();
        campeonato.iniciarCampeonato();


        /*carrera1.inscribirParticipante(participante1);
        carrera1.inscribirParticipante(participante2);
        carrera1.inscribirParticipante(participante3);
        carrera1.inscribirParticipante(participante4);
        carrera1.inscribirParticipante(participante5);
        carrera1.inscribirParticipante(participante6);*/
        //carrera1.mostrarDatos();
        //carrera1.mostrarParrilla();
        //carrera1.iniciarCarrera();
        //carrera1.mostrarParrilla();


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
