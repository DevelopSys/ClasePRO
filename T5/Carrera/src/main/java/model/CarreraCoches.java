package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraCoches {

    private int km;
    private ArrayList<Coche> participantes;

    public CarreraCoches(int km) {
        this.km = km;
        this.participantes = new ArrayList<>();
    }

    public void inscribirParticipante(Coche coche) {
        if (buscarCoche(coche.getMatricula()) != null) {
            System.out.println("Coche ya en la lista de participantes");
        } else {
            if (participantes.size() < 20) {
                participantes.add(coche);
                System.out.println("Participante agregado correctamente");
            } else {
                System.out.println("Lista completa");
            }

        }
    }

    private Coche buscarCoche(String mat) {

        for (Coche coche : participantes) {
            if (coche.getMatricula().equals(mat)) {
                return coche;
            }
        }
        return null;
    }

    public void iniciarCarrera() {

        if (participantes.size() < 4) {
            System.out.println("No puedes iniciar la carrera, faltan participantes");
        } else {
            System.out.println("Iniciando carrera");
            boolean ganador = false;
            do {
                for (Coche coche : participantes) {
                    coche.acelerar((int) (Math.random() * 10));
                    if (coche.getKm() >= km) {
                        ganador = true;
                        break;
                    }
                }
                // repetir el acelerar mientras no tengas un ganador
            } while (!ganador);
            System.out.println("Carrera terminada, tenemos ganador");
            ordenarCarrera();
        }

    }

    private void ordenarCarrera() {
        participantes.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getKm() > o2.getKm())
                    return -1;
                else if (o1.getKm() < o2.getKm()) {
                    return 1;
                }
                return 0;
            }
        });
    }

    public void mostrarClasificacion() {
        int puesto = 1;
        for (Coche coche : participantes) {
            System.out.printf("%d %s %s %s %d%n",
                    puesto, coche.getMarca(), coche.getModelo(), coche.getModelo(), coche.getKm());
            puesto++;
        }
    }

    public void repartirPuntos() {
        ordenarCarrera();
        participantes.get(0).setPuntos(participantes.get(0).getPuntos() + 10);
        participantes.get(1).setPuntos(participantes.get(1).getPuntos() + 7);
        participantes.get(2).setPuntos(participantes.get(2).getPuntos() + 5);
    }


}
