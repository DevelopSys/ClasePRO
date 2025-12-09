package controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Carrera;
import model.CarreraCoches;
import model.Coche;

import java.util.ArrayList;
import java.util.Comparator;

@Data
@AllArgsConstructor

public class Campeonato {

    private ArrayList<CarreraCoches> listaCarreras;
    private ArrayList<Coche> listaParticipantes;

    public Campeonato() {
        listaCarreras = new ArrayList<>();
        listaParticipantes = new ArrayList<>();
    }

    public void mostrarClasificacionFinal() {
        listaParticipantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getPuntos() > o2.getPuntos()) {
                    return -1;
                } else if (o1.getPuntos() < o2.getPuntos()) {
                    return 1;
                }
                return 0;
            }
        });
        int puesto = 1;
        for (Coche item :
                listaParticipantes) {
            System.out.printf("%d - %s - %s - puntos: %d  %n",puesto,item.getModelo(), item.getMatricula(), item.getPuntos());
            puesto++;
        }
    }

    public void iniciarCampeonato() {
        for (CarreraCoches item : listaCarreras) {
            System.out.println("Corriendo la carrera " + item.getNombre());
            item.setParticipantes(listaParticipantes);
            item.iniciarCarrera();
            item.mostrarInformacion();
        }
    }

    public void mostrarCarreras() {
        System.out.println("Procedemos a mostrar la info de la carreras del campeonato");
        for (CarreraCoches item : listaCarreras) {
            System.out.println("Los km de la carrera son " + item.getKm() + " y el nombre de la carrera es " + item.getNombre());
        }
    }

    public void mostrarParticipantes() {
        System.out.println("Procedemos a mostrar la info de los participantes del campeonato");
        for (Coche item : listaParticipantes) {
            System.out.println("El " + item.getModelo() + " tiene una matricula de  " + item.getMatricula());
        }
    }

    // inscribirParticipantes
    // inscribirCarrera
    public void inscribirCarrera(CarreraCoches carrera) {
        this.listaCarreras.add(carrera);
    }

    public void inscribirParticipante(Coche coche) {
        if (buscarCoche(coche.getMatricula()) != null) {
            System.out.println("Coche ya en la lista de participantes");
        } else {
            if (listaParticipantes.size() < 20) {
                listaParticipantes.add(coche);
                System.out.println("Participante agregado correctamente");
            } else {
                System.out.println("Lista completa");
            }

        }
    }

    private Coche buscarCoche(String mat) {

        for (Coche coche : listaParticipantes) {
            if (coche.getMatricula().equals(mat)) {
                return coche;
            }
        }
        return null;
    }


}
