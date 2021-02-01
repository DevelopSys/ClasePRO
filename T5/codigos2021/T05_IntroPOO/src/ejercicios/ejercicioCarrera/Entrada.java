package ejercicios.ejercicioCarrera;

public class Entrada {

    public static void main(String[] args) {

        Coche opelA = new Coche();
        Coche fordB = new Coche("Ford", "1234AAA", 140);

        System.out.printf("+++Datos iniciales+++%n");
        opelA.mostrarDatos();
        fordB.mostrarDatos();

        System.out.printf("+++Realizando modificaciones del cocha A+++%n");
        opelA.setCv(140);
        opelA.setMatricula("7890B");
        opelA.setModelo("Corsa");

        System.out.printf("+++Datos modificados+++%n");
        opelA.mostrarDatos();
        fordB.mostrarDatos();

        System.out.printf("+++Acelerando coches+++%n");
        opelA.acelerar((int) (Math.random() * 21) + 10);
        fordB.acelerar((int) (Math.random() * 21) + 10);

        System.out.printf("+++Datos modificados y acelerados+++%n");
        opelA.mostrarDatos();
        fordB.mostrarDatos();


        Coche cocheGanador = null;

        if (fordB.getKm() > opelA.getKm()) {
            //System.out.printf("El coche B ha sido el ganador con %.2f %n", fordB.getKm());
            cocheGanador = fordB;
        } else if(fordB.getKm() < opelA.getKm()) {
            //System.out.printf("El coche A ha sido el ganador con %.2f %n", opelA.getKm());
            cocheGanador = opelA;
        }

        if (cocheGanador!=null){
            System.out.printf("El %s ha sido el ganador con %.2f %n", cocheGanador.getModelo(),cocheGanador.getKm());
        } else {
            System.out.printf("Empate");
        }




        /*for (int i = 0; i < 100000000; i++) {
            System.out.println((int) (Math.random()*21)+10); // (10 - 30) +10
        }*/


    }
}
