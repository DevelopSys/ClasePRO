import model.Equipo;
import model.Jugador;
import model.Partido;

public class Entrada {

    public static void main(String[] args) {

        Equipo equipo1 = new Equipo("Madrid",90,80,82);
        Equipo equipo2 = new Equipo("Atletico de Madrid");
        Jugador jugador1 = new Jugador("Luka Modric", "medio", 89);
        Jugador jugador2 = new Jugador("David Alaba", "defensa", 85);
        Jugador jugador3 = new Jugador("Thibaut Courtois", "portero", 92);
        Jugador jugador4 = new Jugador("Dani Carvajal", "defensa", 83);
        Jugador jugador5 = new Jugador("Antonio Rudiger", "defensa", 84);
        Jugador jugador6 = new Jugador("Lucas Vazquez", "delantero", 78);
        Jugador jugador7 = new Jugador("Jesus Vallejo", "defensa", 76);
        Jugador jugador8 = new Jugador("Dani Ceballos", "medio", 80);
        Jugador jugador9 = new Jugador("Kylian Mbappe", "delantero", 95);
        Jugador jugador10 = new Jugador("Ferland Mendy", "defensa", 82);
        Jugador jugador11 = new Jugador("Eder Militao", "defensa", 87);
        Jugador jugador12 = new Jugador("Andriy Lunin", "portero", 75);
        Jugador jugador13 = new Jugador("Brahim Diaz", "medio", 77);
        Jugador jugador14 = new Jugador("Federico Valverde", "medio", 88);
        Jugador jugador15 = new Jugador("Francisco Garcia", "defensa", 74);
        Jugador jugador16 = new Jugador("Aurelien Tchouameni", "medio", 86);
        Jugador jugador17 = new Jugador("Vinicius Junior", "delantero", 93);
        Jugador jugador18 = new Jugador("Rodrygo", "delantero", 85);
        Jugador jugador19 = new Jugador("Eduardo Camavinga", "medio", 84);
        Jugador jugador20 = new Jugador("Jude Bellingham", "medio", 90);
        Jugador jugador21 = new Jugador("Arda Guler", "delantero", 79);
        Jugador jugador22 = new Jugador("Jacobo Ramon", "defensa", 70);
        Jugador jugador23 = new Jugador("Endrick Felipe", "medio", 72);
        Jugador jugador24 = new Jugador("Fran Gonzalez", "portero", 68);
        equipo1.ficharJugador(jugador1);
        equipo1.ficharJugador(jugador2);
        equipo1.ficharJugador(jugador3);
        equipo1.ficharJugador(jugador4);
        equipo1.ficharJugador(jugador5);
        equipo1.ficharJugador(jugador6);
        equipo1.ficharJugador(jugador7);
        equipo1.ficharJugador(jugador8);
        equipo1.ficharJugador(jugador9);
        equipo1.ficharJugador(jugador10);
        equipo1.ficharJugador(jugador11);
        equipo1.ficharJugador(jugador12);
        equipo1.ficharJugador(jugador13);
        equipo1.ficharJugador(jugador14);
        equipo1.ficharJugador(jugador15);
        equipo1.ficharJugador(jugador16);
        equipo1.ficharJugador(jugador17);
        equipo1.ficharJugador(jugador18);
        equipo1.ficharJugador(jugador19);
        equipo1.ficharJugador(jugador20);
        equipo1.ficharJugador(jugador21);
        equipo1.ficharJugador(jugador22);
        equipo1.ficharJugador(jugador23);
        equipo1.ficharJugador(jugador24);

        // equipo1.listarDelanteros();

        Partido partido = new Partido(equipo1,equipo2);
        partido.iniciarPartido();
        partido.mostrarResultado();






    }
}
