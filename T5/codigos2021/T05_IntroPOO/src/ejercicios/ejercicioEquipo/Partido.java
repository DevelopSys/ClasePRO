package ejercicios.ejercicioEquipo;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private boolean terminado;
    private int parteActual;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        // terminado = false;
        // parteActual = 0;
    }

    public void iniciarPartido() {

        parteActual = 1;
        // tres ataques por cada parte * 2
        // para jugar dos partes
        for (int i = 1; i < 3; i++) {
            System.out.printf("Jugando la %d parte%n", i);
            // para atacar 3 veces por parte
            for (int j = 0; j < 3; j++) {

                marcarGol(equipoLocal, equipoVisitante);
                marcarGol(equipoVisitante, equipoLocal);
                // pregunto si el equipo que ataca ha metido gol
                //equipoLocal.atacar();
                //equipoVisitante.atacar();
            }
            parteActual = 2;
        }

        terminado = true;
    }


    public void marcarGol(Equipo equipoAtaca, Equipo equipoDefiende) {
        if (equipoAtaca.atacar() && equipoAtaca.getNivelAtaque() > equipoDefiende.getNivelDefensa()) {
            System.out.printf("Gol del %s %n", equipoAtaca.getNombre());
            equipoAtaca.setNumeroGoles(equipoAtaca.getNumeroGoles() + 1);
        }
    }


    public void mostrarResultado() {
        if (terminado) {
            System.out.printf("%s: %d vs %s: %d%n", equipoLocal.getNombre(), equipoLocal.getNumeroGoles(),
                    equipoVisitante.getNombre(), equipoVisitante.getNumeroGoles());
        } else {
            System.out.printf("Sin jugar o jugando");
        }
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public int getParteActual() {
        return parteActual;
    }
}
