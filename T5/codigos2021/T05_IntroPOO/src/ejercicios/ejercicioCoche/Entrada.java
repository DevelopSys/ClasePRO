package ejercicios.ejercicioCoche;

public class Entrada {

    public static void main(String[] args) {

        Motor motorDiesel = new Motor(120,2.0);
        Motor motorGasolina = new Motor(120,1.5);

        Coche focus = new Coche("Ford","Focus",123123,motorDiesel);
        Coche fiesta = new Coche("Ford","Fiesta",456,motorDiesel);
        Coche tiguan = new Coche("Ford","Fiesta",456,new Motor(140,2.2));

        Coche golf = new Coche("Vw","Golf",6543,180,2.5);
        golf.mostrarDatos();
        System.out.println("Reprogramando.......");
        golf.reprogramar();
        golf.mostrarDatos();
        // tiguan.mostrarDatos();

        // focus.getMotor().setCaballosV(200);

        // focus.mostrarDatos();
        // fiesta.mostrarDatos();

    }
}
