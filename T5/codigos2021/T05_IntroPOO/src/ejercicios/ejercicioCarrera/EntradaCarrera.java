package ejercicios.ejercicioCarrera;

public class EntradaCarrera {

    public static void main(String[] args) {

        int etapaKM = 100000;
        Coche cocheGanador = null;
        Coche ford = new Coche("Focus","123A",150);
        Coche opel = new Coche("Corsa","2345B",145);

        do{
            System.out.println("Aceleración");
            opel.acelerar((int) (Math.random() * 21) + 10);
            ford.acelerar((int) (Math.random() * 21) + 10);
        }while ( opel.getKm()<etapaKM || ford.getKm()<etapaKM );


        if (ford.getKm() > opel.getKm()) {
            //System.out.printf("El coche B ha sido el ganador con %.2f %n", fordB.getKm());
            cocheGanador = ford;
        } else if(ford.getKm() < opel.getKm()) {
            //System.out.printf("El coche A ha sido el ganador con %.2f %n", opelA.getKm());
            cocheGanador = opel;
        }

        System.out.printf("El ganado es %s %s con %.2f KM%n",cocheGanador.getModelo(),cocheGanador.getMatricula(),cocheGanador.getKm());




    }
}
