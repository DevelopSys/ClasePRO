import controller.Equipo;
import controller.Seleccion;
import model.*;
import utils.Posicion;
import utils.Tactica;

public class Entrada {

    public static void main(String[] args) {

        Seleccion espania = new Seleccion("España");
        Equipo equipo = new Equipo("Madrid",1000);
        Profesional jugador = new Profesional("J1","123",Posicion.Delantero, true,200 );
        equipo.ficharJugador(jugador);
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Canterano("J1","123",Posicion.Delantero));
        equipo.ficharJugador(new Profesional("J1","123",Posicion.Delantero,true,500));
        equipo.ficharJugador(new Profesional("J1","123",Posicion.Delantero,true,1));
        espania.contratarSeleccionador(new Seleccionador("Seleccionador", "123A",Tactica.Media));
        espania.llamarJugador(jugador);
        espania.llamarJugador(new Profesional("J2","123",Posicion.Delantero,true,100));
        espania.llamarJugador(new Profesional("J3","123",Posicion.Delantero,true,100));
        espania.llamarJugador(new Top("T1","123",Posicion.Delantero));
        espania.llamarJugador(new Top("T2","123",Posicion.Delantero));

    }


}
