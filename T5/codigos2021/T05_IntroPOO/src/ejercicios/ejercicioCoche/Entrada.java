package ejercicios.ejercicioCoche;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Coche> listaCoches = new ArrayList();

        Motor motorDiesel = new Motor(120,2.0);
        Motor motorGasolina = new Motor(120,1.5);
        Mecanico mecanico = new Mecanico();

        Coche focus = new Coche("Ford","Focus",123123,motorDiesel);
        Coche fiesta = new Coche("Ford","Fiesta",456,motorDiesel);
        Coche tiguan = new Coche("Vw","Tiguan",456,new Motor(140,2.2));
        Coche golf = new Coche("Vw","Golf",6543,180,2.5);
        listaCoches.add(focus);
        listaCoches.add(fiesta);
        listaCoches.add(tiguan);
        listaCoches.add(golf);

        int numeroFord=0;
        for ( Coche coche : listaCoches) {
                //coche.mostrarDatos();
            //mecanico.revisarCoche(coche);
            if (coche.getMarca().equals("Ford")){
                //numeroFord++;
                coche.reprogramar();
            }

        }



        //golf.mostrarDatos();
        //System.out.println("Reprogramando.......");


        //mecanico.revisarCoche(golf);
        //golf.reprogramar();
        //mecanico.revisarCoche(focus);
        //golf.mostrarDatos();
        // tiguan.mostrarDatos();

        // focus.getMotor().setCaballosV(200);

        // focus.mostrarDatos();
        // fiesta.mostrarDatos();

    }
}
