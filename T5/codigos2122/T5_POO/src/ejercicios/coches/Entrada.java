package ejercicios.coches;

public class Entrada {

    public static void main(String[] args) {
        Motor motorGasoil = new Motor(150,1000);
        Motor motorGasolina = new Motor(120,500);

        Coche cocheGasolina = new Coche("Ford","Fiesta", new Motor(120,500));
        Coche cocheGasoil = new Coche("Opel","Corsa", new Motor(150,1000));

        //System.out.println(cocheGasoil.getMotor().getCv());
        /*
        System.out.println(cocheGasoil.getCosteAverias());
        cocheGasoil.acumularAveria(900);
        cocheGasoil.acumularAveria(200);
        System.out.println(cocheGasoil.getCosteAverias());*/

        Garaje garaje = new Garaje();
        // coche = null // numCoches = 0 // averia = null
        if (garaje.aceptarCoche(cocheGasoil,"aceite")==true){
            System.out.println("Coche aceptado");
            System.out.println(cocheGasoil.getMotor().getLitros());
        } else {
            System.out.println("Garaje ocupado");
        }

        garaje.devolverCoche();

        if (garaje.aceptarCoche(cocheGasolina,"aceite")==true){
            System.out.println("Coche aceptado");
            System.out.println(cocheGasolina.getMotor().getLitros());
        } else {
            System.out.println("Garaje ocupado");
        }




    }
}
