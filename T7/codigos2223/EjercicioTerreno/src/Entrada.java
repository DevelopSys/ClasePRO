import model.Terreno;
import utils.Orientacion;

public class Entrada {

    public static void main(String[] args) {
        Terreno terreno = new Terreno(500,200000, Orientacion.Sur);
        terreno.construirCasa(400,0);
        terreno.getCasa().construirHabitacion(50,"salon");
        terreno.getCasa().construirHabitacion(20 ,"cocina");
        terreno.getCasa().construirHabitacion(70, "dormitorio");
        terreno.getCasa().construirHabitacion(200, "sala juegos");
        terreno.construirPiscinaTerreno();
        terreno.revalorizarTerreno();
        terreno.mostrarDatos();



    }
}
