package terrenoanidado;

import terrenoanidado.model.Orientacion;
import terrenoanidado.model.Terreno;
import terrenoanidado.utils.TerrenoException;

public class Entrada {


    public static void main(String[] args) {
        Terreno terreno = new Terreno(500000,500, Orientacion.norte);

        try{
            terreno.construirCasa(190);
            terreno.construirPiscina();
            terreno.mostrarDatos();
            // construir habitacion
            //terreno.construirHabitacion(300);
            //terreno.construirHabitacion(150);
        } catch (TerrenoException e){
            System.out.println(e.getMessage());
        }
    }
}
