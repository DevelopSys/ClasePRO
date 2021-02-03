package ejercicios.ejercicioEquipo;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList pendientes = new ArrayList();
        Equipo atletico = new Equipo("Atleti",100,50,100);
        Equipo cadiz = new Equipo("Cadiz",80,50,94);

        atletico.ficharJugador(new Jugador("Suarez", "delantero", 91));
        atletico.ficharJugador(new Jugador("Oblak", "portero", 99));
        atletico.ficharJugador(new Jugador("Saul", "medio", 87));

        //atletico.listarEstrellas();

        // cadiz.atacar() --> true
        // atletico.atacar() --> true

        Partido partido = new Partido(atletico, cadiz);
        partido.iniciarPartido();
        partido.mostrarResultado();


        /*
        int contador=0;

        System.out.println("Mostrando datos----");
        atletico.mostrarDatos();
        cadiz.mostrarDatos();

        System.out.println("Jugar partido");

        do{
            if(atletico.atacar()){
                System.out.println("Gol del atleti");
            };

            if(cadiz.atacar()){
                System.out.println("Gol del Cadiz");
            };
            contador++;
        }while(contador<3);


        System.out.printf("El resultado es %s: %d VS %s: %d %n",atletico.getNombre(), atletico.getNumeroGoles(), cadiz.getNombre(), cadiz.getNumeroGoles() );

        */


    }
}
