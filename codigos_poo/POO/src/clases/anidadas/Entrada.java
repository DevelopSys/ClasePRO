package clases.anidadas;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Partido partido = new Partido("20/Marzo/2020");
        Partido.Equipo madrid = partido.new Equipo("Real Madrid",0);
        Partido.Equipo atleti = partido.new Equipo("Atletico de Madrid",0);
        partido.setEquipoLocal(madrid);
        partido.setEquipoVisitante(atleti);
        System.out.println("Empieza el partido");
        partido.mostarResultado();

        for (int i=1;i<3;i++){

            for(int x=0;x<3;x++){
                partido.agregarGolesLocal();
                partido.agregarGolesVisitante();
            }
            System.out.printf(String.format("Al final de la %d parte el resultado es: %n",i));
            partido.mostarResultado();
        }
    }
}
