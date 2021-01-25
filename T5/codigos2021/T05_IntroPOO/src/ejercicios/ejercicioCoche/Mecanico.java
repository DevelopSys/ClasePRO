package ejercicios.ejercicioCoche;

public class Mecanico {

    // variables
    // constructores
    // métodos

    public void revisarCoche(Coche coche){

        System.out.printf("Marca del coche: %s%n ",coche.getMarca());
        System.out.println("Marca del coche: "+coche.getModelo());
        System.out.println("Marca del CV: "+coche.getMotor().getCaballosV());
        System.out.println("Marca del CC: "+coche.getMotor().getCentimetrosC());

    }

}
