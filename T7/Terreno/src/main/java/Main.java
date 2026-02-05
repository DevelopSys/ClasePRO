public class Main {

    public static void main(String[] args) {
        Terreno terreno = new Terreno(1000, Orientacion.SUR);
        terreno.construirCasa(400, true);
        try {
            terreno.getCasa().construirHabitacion(100);
            terreno.getCasa().construirHabitacion(100);
            int dato = 4 / 0;
            terreno.getCasa().construirHabitacion(100);
            terreno.getCasa().construirAnexo(300);
            terreno.getCasa().construirAnexo(200);
        } catch (NullPointerException e) {
            System.out.println("Fallo en la gestion de la casa");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro en la division entre 0");
        } finally {
            System.out.println("Terminando la gestion de la casa");
        }

        try {
            terreno.mostrarDatos();
        } catch (NullPointerException e) {
            System.out.println("Los datos de la casa no son accesibles");
        }

    }
}
