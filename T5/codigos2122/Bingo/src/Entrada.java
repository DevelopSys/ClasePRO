public class Entrada {

    public static void main(String[] args) {
        Jugador jugador = new Jugador("Borja","123123",20);
        jugador.comparCartones(5);
        jugador.verCartones();

        do {
            int aleatorio = (int) (Math.random() * 51);
            jugador.comprobarNumero(aleatorio);

        } while (!jugador.isGanador());

    }
}
