package controller;

import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Carrera {

    private int vueltas;
    private String nombre;
    private Coche ganador;
    private ArrayList<Coche> participantes;

    public Carrera(int vueltas, String nombre) {
        this.nombre = nombre;
        this.vueltas = vueltas;
        participantes = new ArrayList<>();
    }

    private Coche buscarCoche(String matricula) {

        for (Coche item : participantes) {
            if (item.getMatricula().equalsIgnoreCase(matricula)) {
                return item;
            }
        }
        return null;

    }

    private void ordenarParticipantes() {
        participantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {

                if (o1.getKm() > o2.getKm()) {
                    return -1;
                } else if (o1.getKm() < o2.getKm()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void mostrarClasificacion() {
        // la lista debe estar ordenada
        if (participantes.isEmpty()){
            System.out.println("No se ha inscrito nadie");
        } else {
            ordenarParticipantes();
            int posicion = 1;
            for (Coche item: participantes) {
                System.out.printf("%d - %s %s %s km:%d\n",
                        posicion,item.getMarca(),item.getModelo()
                        ,item.getMatricula(),item.getKm());
                posicion++;
            }
        }
    }

    public void empezarCarrera(){
        // vueltas y que tenga 8 participantes
        if (participantes.size()==8){
            for (int i = 0; i < vueltas; i++) {
                for (Coche coche: participantes) {
                    int aletorio = (int) (Math.random()*26)+50;
                    coche.setKm(aletorio);
                }

                System.out.println("Clasificacion en la vuelta "+(i+1));
                mostrarClasificacion();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void mostrarGanador() {
        // la lista debe estar ordenada
        ordenarParticipantes();
        System.out.println("El ganador es "+participantes.get(0).getMatricula());
    }

    public void descalificarParticipante(String matricula) {
        /*if (buscarCoche(matricula)!=null){
            // esta en la lista por lo tanto lo eliminas
            participantes.remove(buscarCoche(matricula));
            System.out.println("Coche borrado");
        }else {
            System.out.println("No se encuentra el participante");
        }*/

        if (participantes.removeIf(new Predicate<Coche>() {
            @Override
            public boolean test(Coche coche) {
                return coche.getMatricula().equalsIgnoreCase(matricula);
            }
        })) {
            System.out.println("Borrado correctamente");
        } else {
            System.out.println("No esta en la lista");
        }
    }

    public void inscribirParticipante(Coche coche) {
        // si ya hay 8, si tienes mas de 300cv, si ya hay esa matricula -> no agrego
        if (participantes.size() == 8
                || coche.getCv() >= 300
                || buscarCoche(coche.getMatricula()) != null) {
            System.out.println("Lo siento no puedes inscribir");
        } else {
            // agrego
            participantes.add(coche);
            System.out.println("Agregado con exito");
        }

    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}
