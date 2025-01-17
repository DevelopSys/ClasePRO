import model.Coche;

import java.util.ArrayList;

public class Carrera {

    public static void main(String[] args) {

        Coche cocheOpel = new Coche("Opel","Corsa",120);
        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford","Focus","Plata"));
        listaCoches.add(new Coche("Seat","Ibiza","Blanco"));
        listaCoches.add(new Coche("Mercedes","C300",400));
        listaCoches.add(cocheOpel);

        cocheOpel.setCv(cocheOpel.getCv()*2);
        for ( Coche coche : listaCoches) {
            coche.mostrarDatos();
        }
    }
}

/*
Un coche tiene un atributo KM,
los cuales pueden decir la distancia que ha recorrido un coche
Para poder hacer una carrera, es necesario que se pida por consola
los datos de 6 participantes, donde se debe indicar marca, modelo,
matricula, cv.
Una vez indicados todos los participantes, es necesario indicar cuantas
vueltas consta la carrera
Una vez indica el nº de vueltas, la carrera comienza. Para ello en cada vuelta
cada coche recorre un numero de km aleatorio (50-75)
Una vez se terminan las vueltas el sistema mostrara:

El ganado es el coche XXXX XXXX XXXXX
La clasificacion final es:
1- XXXX XXXX XXXX XX
2- XXXX XXXX XXXX XX

 */
