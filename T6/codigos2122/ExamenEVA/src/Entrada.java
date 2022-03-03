public class Entrada {

    public static void main(String[] args) {
        Seleccion espania = new Seleccion("España");
        // nombre = España
        // gastos = 0
        // lista = [Jugador, Jugador, Jugador, Jugador, Entrenador, Entrenador]
        espania.contratarJugador(new Jugador("Andres", "Iniesta",
                "1234", 33, 1000, "delantero"));
        espania.contratarJugador(new Jugador("Nombre", "Apellido",
                "12345", 30, 1500, "medio"));
        espania.contratarJugador(new Jugador("Nombre2", "Apellido2",
                "123456", 31, 2000, "defensa"));
        espania.contratarJugador(new Jugador("Nombre3", "Apellido3",
                "1234567", 33, 3000, "portero"));
        espania.contratarEntrenador(new Entrenador("Entrenador1", "Apellido1",
                "12345678", 33, 1000, "defensivo"));
        espania.contratarEntrenador(new Entrenador("Entrenador2", "Apellido1",
                "123456789", 33, 1000, "ofensivo"));



        espania.verPosicion("delantero");

        espania.mostrarGastos();

        espania.verPlantilla();
    }
}
