package cocheanidado;

public class Entrada {

    public static void main(String[] args) {

        Coche coche = new Coche("Ford","Fucus",1234);
        coche.mostrarDatos();


        Coche.Motor motor = coche.new Motor("Ford",100,1500);
        motor.mostrarDatos();


        Coche coche2 = new Coche("Ford","Fiesta",2345);
        Coche.Motor motor2 = coche2.new Motor("Ford",75,1000);

        //motor.algo();

        //coche.setMotor(motor);

        coche.reprogramar();
        motor.mostrarDatos();

        //System.out.println("Asociando motor");
        //coche.mostrarDatos();

        //motor.algo();// acceda a coche

        // cambiado la marca
        //coche.mostrarDatos();
    }
}
