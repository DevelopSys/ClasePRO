package ejercicios.terreno;

public class Entrada {

    public static void main(String[] args) {

        Terreno terreno = new Terreno(1000,150000);
        terreno.construirCasa(100,false,3);
        terreno.getCasa().construirPiscina();
        try {
            terreno.getCasa().construirHabitacion(100);
        } catch (TerrenoException e) {
            e.printStackTrace();
        }

    }
}
