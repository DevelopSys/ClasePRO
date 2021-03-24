public class Entrada {


    public static enum PoscionDef {
        DELANTERO,MEDIO,DEFENSA,PORTERO;
    }
    public static void main(String[] args) {

        PoscionDef delantero = PoscionDef.DELANTERO;
        Jugador jugador = new Jugador
                ("Nombre","Apellido",24,PoscionDef.DELANTERO.name());
        jugador.mostarDatos();
    }
}
