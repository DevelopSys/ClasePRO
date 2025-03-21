import model.Terreno;
import utils.CasaException;
import utils.Orientacion;

public class Entrada {
    public static void main(String[] args) {
        Orientacion orientacion = Orientacion.SUR;
        // orientacion.getRevalorizacion();
        // sur
        orientacion.name().toLowerCase();
        Terreno terreno  = new Terreno(500,Orientacion.SUR,300000);
        try {
            terreno.construirCasa(200);
            terreno.getCasa().construirPiscina();
            terreno.getCasa().construirHabitacion(200);
            terreno.getCasa().construirAnexo(200);
        } catch (CasaException e){
            System.out.println(e.getMessage());
            switch (e.getTipo()){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
            System.out.println("Error en el proceso");
        }

    }
}
