package clases.ejercicios.EjercicioTorneo;

import clases.anidadas.Partido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Torneo {

    private String nombre;
    private ArrayList<Partido> listaPartidos;
    private ArrayList<Equipo> listaParticipantes;

    public Torneo(String nombre) {
        this.nombre = nombre;
        listaPartidos = new ArrayList();
    }

    public void realizarSorteo(ArrayList<Equipo> equipos) {

        this.listaParticipantes = equipos;

        for (int i = 0; i < equipos.size(); i++) {
            for (int x = i + 1; x < equipos.size(); x++) {
                listaPartidos.add(new Partido(equipos.get(i), equipos.get(x)));
            }
        }
    }

    public void sacarClasificacion() {

        Collections.sort(listaParticipantes, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPuntos() > o2.getPuntos()) {
                    return -1;
                } else if (o1.getPuntos() < o2.getPuntos()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (Equipo equipo : listaParticipantes) {
            System.out.printf("%s - %d %n", equipo.getNombre(), equipo.getPuntos());
        }
    }


    public void mostrarPartidos() {
        for (Partido partido : listaPartidos) {
            partido.mostrarResultado();
        }
    }

    public void cambiarPuntos() {
        for (int i = 0; i < listaPartidos.size(); i++) {
            Partido p = listaPartidos.get(i);
            if (p.getEquipoLocal().getGolesEncuentro() > p.getEquipoVisitante().getGolesEncuentro()) {
                p.getEquipoLocal().setPuntos(3);
            } else if (p.getEquipoLocal().getGolesEncuentro() < p.getEquipoVisitante().getGolesEncuentro()) {
                p.getEquipoVisitante().setPuntos(3);
            } else {
                p.getEquipoLocal().setPuntos(1);
                p.getEquipoVisitante().setPuntos(1);
            }
        }
    }


    public void jugarPartidos() {

        for (int j = 0; j < listaPartidos.size(); j++) {

            Partido partido = listaPartidos.get(j);
            for (int i = 1; i < 3; i++) {
                for (int x = 0; x < 3; x++) {
                    partido.addGolesLocales();
                    partido.addGolesVisitantes();
                }
            }
        }

        cambiarPuntos();

    }


    private void mostrarGoles() {

        for (Partido p : listaPartidos) {
            System.out.printf("Local: %d - Visitante: %d %n", p.getEquipoLocal().getGolesEncuentro(), p.getEquipoVisitante().getGolesEncuentro());
            if (p.getEquipoLocal().getGolesEncuentro() > p.getEquipoVisitante().getGolesEncuentro()) {
                System.out.println("Local gana");
                p.getEquipoLocal().setPuntos(3);
            } else if (p.getEquipoLocal().getGolesEncuentro() < p.getEquipoVisitante().getGolesEncuentro()) {
                System.out.println("Visitante gana");
                p.getEquipoVisitante().setPuntos(3);

            } else {
                System.out.println("Empate");
                p.getEquipoLocal().setPuntos(1);
                p.getEquipoVisitante().setPuntos(1);

            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    class Partido {
        private Equipo equipoLocal, equipoVisitante;
        private Boolean jugado;
        private int numeroGoles;

        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
        }

        public void addGolesLocales() {
            int goles = (int) (Math.random() * 2);
            getEquipoLocal().setGolesEncuentro(goles);
        }

        public void addGolesVisitantes() {
            int goles = (int) (Math.random() * 2);
            getEquipoVisitante().setGolesEncuentro(goles);
        }

        public void mostrarResultado() {
            System.out.printf("%s:%d:%d - %s:%d:%d %n", getEquipoLocal().getNombre(), getEquipoLocal().getGolesEncuentro()
                    , getEquipoLocal().getPuntos(), getEquipoVisitante().getNombre(), getEquipoVisitante().getGolesEncuentro()
                    , getEquipoVisitante().getPuntos());
        }

        public Equipo getEquipoLocal() {
            return equipoLocal;
        }

        public void setEquipoLocal(Equipo equipoLocal) {
            this.equipoLocal = equipoLocal;
        }

        public Equipo getEquipoVisitante() {
            return equipoVisitante;
        }

        public void setEquipoVisitante(Equipo equipoVisitante) {
            this.equipoVisitante = equipoVisitante;
        }

        public Boolean getJugado() {
            return jugado;
        }

        public void setJugado(Boolean jugado) {
            this.jugado = jugado;
        }

        public int getNumeroGoles() {
            return numeroGoles;
        }

        public void setNumeroGoles(int numeroGoles) {
            this.numeroGoles = numeroGoles;
        }
    }

    static class Equipo {

        private String nombre;
        private int golesEncuentro;
        private int puntos;

        public Equipo(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getGolesEncuentro() {
            return golesEncuentro;
        }

        public void setGolesEncuentro(int goles) {
            this.golesEncuentro += goles;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos += puntos;
        }
    }
}
