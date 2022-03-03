public class Entrada {

    public static void main(String[] args) {
        Seleccion espania = new Seleccion("España");
        Posiciones posicionesDefensa = Posiciones.defensa;
        Vocaciones vocaciones = Vocaciones.generico;
        String[] posiciones = new String[]{Posiciones.defensa.name(),Posiciones.medio.name(),Posiciones.delantero.name(), Posiciones.portero.name()};


        // nombre = España
        // gastos = 0
        // lista = [Jugador, Jugador, Jugador, Jugador, Entrenador, Entrenador]
        espania.contratarJugador(new Jugador("Andres", "Iniesta",
                "1234", 33, 1000,posicionesDefensa.name() ));
        espania.contratarJugador(new Jugador("Nombre", "Apellido",
                "12345", 30, 1500, posiciones[1]));
        espania.contratarJugador(new Jugador("Nombre2", "Apellido2",
                "123456", 31, 2000, Posiciones.defensa.name()));
        espania.contratarJugador(new Jugador("Nombre3", "Apellido3",
                "1234567", 33, 3000, Posiciones.delantero.name()));
        espania.contratarEntrenador(new Entrenador("Entrenador1", "Apellido1",
                "12345678", 33, 1000, vocaciones.getDefensiva()));
        espania.contratarEntrenador(new Entrenador("Entrenador2", "Apellido1",
                "123456789", 33, 1000, vocaciones.getOfensiva()));



        espania.verPosicion("delantero");

        espania.mostrarGastos();

        espania.verPlantilla();
    }
}
