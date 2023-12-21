package controller;

import model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato {

    private String nombre;
    private ArrayList<Carrera> listaCarreras;
    private ArrayList<Coche> listaParticipantes;
    private Coche campeon;


    public Campeonato() {
    }

    public Campeonato(String nombre) {
        this.nombre = nombre;
        this.listaCarreras = new ArrayList<>();
        this.listaParticipantes = new ArrayList<>();
    }

    // inscribirParticipantes
    // agregar un particiopante a la lista

    public void inscribirParticipante(Coche coche) {
        if (listaParticipantes.size() == 20) {
            System.out.println("Error en la inscripcion: no hay plazas");
        } else {
            // esta la matricula del coche que quiero agregar en la lista?
            // true o false
            if (estaCoche(coche.getMatricula()) != null) {
                System.out.println("Error en la inscripcion. Datos duplicados");
            } else {
                listaParticipantes.add(coche);
                System.out.println("Agregado correctamente");
            }
        }
    }

    private Coche estaCoche(String matricula) {

        Coche coincideCoche = null;
        // recorre la lista y pregunta por las matriculas
        for (Coche coche : this.listaParticipantes) {
            if (coche.getMatricula().equalsIgnoreCase(matricula)) {
                coincideCoche = coche;
                break;
            }
        }
        return coincideCoche;
    }

    // descalificarParticiapante
    // elimina un particiopante a la lista
    public void descalificarParticipante(String matricula) {
        // esta el coche en la lista?
        // coche

        Coche cocheEncontrado = estaCoche(matricula);

        if (cocheEncontrado != null) {
            listaParticipantes.remove(cocheEncontrado);
            System.out.println("El coche se ha borrado ok");
        } else {
            System.out.println("No esta");
        }

        /*if (participantes.remove(estaCoche(matricula))){
            System.out.println("Borrado correctamente");
        }else {
            System.out.println("No esta");
        }*/
    }

    // agregarCarrera
    // agregar una carrera a la lista
    public void agregarCarrera(Carrera carrera) {
        // restriccion de numero o repetir circuito?
        listaCarreras.add(carrera);
    }

    // mostrar los datos del campeonato
    // Participantes:
    // nombre matricula
    // nombre matricula
    // Carrera
    // nombre_circuito vueltas km
    // nombre_circuito vueltas km
    public void mostrarDatos() {

        System.out.printf("El campeonato con nombre %s " +
                "tiene los siguientes datos:\n", nombre);
        System.out.println("Los participantes son:");
        for (Coche item : listaParticipantes) {
            System.out.printf("\t%s %s\n", item.getNombre()
                    , item.getMatricula());
        }
        System.out.println("Las carreras son:");
        for (Carrera item : listaCarreras) {
            System.out.printf("\tNombre: %s Vueltas: %d KM: %d\n"
                    , item.getCircuito().getNombre(),
                    item.getCircuito().getVueltas(),
                    item.getCircuito().getKmTotales()
            );
        }
    }


    // iniciarCampeonato
    public void iniciarCampeonato() {

        for (Carrera item : listaCarreras) {

            System.out.println("Procedemos a correr la carrara en "
                    + item.getCircuito().getNombre());
            // inscribir participates en carrera
            //for (Coche element : listaParticipantes) {
            //    item.inscribirParticipante(element);
            //}
            item.setParticipantes(listaParticipantes);
            // correr la carrera
            item.iniciarCarrera();
            // tras cada carrera quiero
            // ver la clasificacion con puntos del campeonato
            System.out.println("La situacion del campeonato tras correr la carrera es");
            mostrarParrilla();

        }
    }
    // recorrer todas las carreres e iniciarlas
    // mostrarClasficiacion
    // muestra los participantes con sus puntos

    public void mostrarParrilla() {
        ordenarParrilla();
        for (int i = 0; i < listaParticipantes.size(); i++) {
            System.out.printf("%d - %s %d km\n", i + 1,
                    listaParticipantes.get(i).getNombre()
                    , listaParticipantes.get(i).getPuntos());
        }

    }

    public void ordenarParrilla() {
        Collections.sort(listaParticipantes, new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getPuntos() < o2.getPuntos()) {
                    return 1;
                } else if (o1.getPuntos() > o2.getPuntos()) {
                    return -1;
                }
                return 0;
            }
        });
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public ArrayList<Coche> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Coche> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public Coche getCampeon() {
        return campeon;
    }

    public void setCampeon(Coche campeon) {
        this.campeon = campeon;
    }
}
