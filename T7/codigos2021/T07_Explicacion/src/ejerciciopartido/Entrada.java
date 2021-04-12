package ejerciciopartido;

public class Entrada {

    public static void main(String[] args) {

        //Partido partido = new Partido();
        //Partido partido1 = new Partido(equipo,equipo);
        //Partido.Equipo equipo = partido.new Equipo();
        //Partido.Equipo equipo2 = partido.new Equipo();
        // modifica la propiedad jugado de un partido??
        Partido partido = new Partido();
        Partido.Equipo madrid = partido.new Equipo("Madrid","Local");
        //partido.setEquipoLocal(madrid);
        Partido.Equipo barcelona = partido.new Equipo("Barcelona","Visitante");
        //partido.setEquipoVisitante(barcelona);

        partido.mostrarEquipos();
        partido.mostrarResultado();
        for (int i = 0; i <3 ; i++) {
            partido.jugarPartido();
            partido.mostrarResultado();
            partido.calcularPuntos();
        }
        madrid.mostrarInformacion();
        barcelona.mostrarInformacion();
    }
}
