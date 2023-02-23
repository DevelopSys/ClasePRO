import model.Terreno;
import utils.Orientacion;

public class Entrada {

    public static void main(String[] args) {
        Terreno terreno = new Terreno(500,200000, Orientacion.Sur);
        terreno.construirCasa(400,4);
        terreno.getCasa().construirHabitacion(300);
        terreno.getCasa().construirHabitacion(300);
        terreno.getCasa().construirHabitacion(300);
        terreno.construirPiscinaTerreno();
        terreno.revalorizarTerreno();
        terreno.mostrarDatos();



    }
}
