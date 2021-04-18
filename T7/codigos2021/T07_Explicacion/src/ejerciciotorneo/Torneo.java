package ejerciciotorneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Torneo{

    private ArrayList<Partido> listaPartidos;
    private ArrayList<Equipo> listaParticipantes;
    private String nombreTorneo;

    public Torneo(String nombreTorneo, ArrayList<Equipo> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
        this.nombreTorneo = nombreTorneo;
    }

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
        this.listaParticipantes = new ArrayList<>();
    }

    public Torneo() {
        this.listaParticipantes = new ArrayList<>();
    }


    private void mostrarPartidos() {
        for (Partido itemPartido : listaPartidos) {
            System.out.printf("%s:%d vs %s:%d%n", itemPartido.getEquipoLocal().getNombre(), itemPartido.getGolesLocal(),
                    itemPartido.getEquipoVisitante().getNombre(), itemPartido.getGolesVisitante());
        }
    }

    private void mecanicaTorneo() {

        listaPartidos = new ArrayList<>();
        // MADRID ; BARSA ; SEVILLA ; GETAFE
        // m - b  m - s m -g
        // b - s b -g
        // s - g

        // IDA
        for (int i = 0; i < listaParticipantes.size() - 1; i++) {
            //System.out.println(listaParticipantes.get(i).getNombre());
            for (int j = i + 1; j < listaParticipantes.size(); j++) {
                //System.out.println("\t"+listaParticipantes.get(j).getNombre());
                Partido partido = new Partido(listaParticipantes.get(i), listaParticipantes.get(j));
                listaPartidos.add(partido);
            }
        }

        // VUELTA
        System.out.println("Realizando vuleta");
        for (int i = listaParticipantes.size() - 1; i > 0; i--) {
            //System.out.println(listaParticipantes.get(i).getNombre());
            for (int j = i - 1; j >= 0; j--) {
                //System.out.println("\t"+listaParticipantes.get(j).getNombre() );
                Partido partido = new Partido(listaParticipantes.get(i), listaParticipantes.get(j));
                listaPartidos.add(partido);
            }
        }

        System.out.println("El número de  de partidos es: " + listaPartidos.size());
        for (int i = 0; i < 10; i++) {
            Collections.shuffle(listaPartidos);
        }
        empezarTorneo();
        mostrarPartidos();
    }

    public void empezarTorneo() {
        for (Partido itemPartido : listaPartidos) {
            itemPartido.jugarPartido();
        }
    }

    public void mostrarClasificacion(){

        Collections.sort(listaParticipantes, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                return o2.getGoles()-o1.getGoles();
            }
        });

        System.out.printf("POS.\t\t\tPUNTOS\t\t\tGOLES%n");
        for ( Equipo itemEquipo : listaParticipantes) {
            System.out.printf("%s\t\t\t%d\t\t\t%d%n",itemEquipo.getNombre(),itemEquipo.getPuntos(),itemEquipo.getGoles());
        }
    }

    public void realizarSorteo(ArrayList<Equipo> equipos) {
        if (equipos != null) {
            this.listaParticipantes = equipos;
            // TODO realizar el sorteo con el for anidado del otro día
            mecanicaTorneo();
        } else {
            System.out.println("Poro favor comprueba el funcionamiento");
        }
    }

    public void realizarSorteo() {
        // TODO realizar el sorteo con el for anidado del otro día
        if (listaParticipantes.size() > 0) {
            mecanicaTorneo();
        } else {
            System.out.println("Por favor revisa la forma de hacer el sorteo");
        }
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public ArrayList<Equipo> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Equipo> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    class Partido {

        private Torneo.Equipo equipoLocal, equipoVisitante;
        private boolean jugado;
        private int golesLocal, golesVisitante;

        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;
        }

        public Partido() {
        }

        public void jugarPartido() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    // ataque del local
                    if (equipoLocal.atacar() > equipoVisitante.defender()) {
                        golesLocal++;
                    }
                    // ataque del visitante
                    if (equipoVisitante.atacar() > equipoLocal.defender()) {
                        golesVisitante++;
                    }
                }
            }

            jugado = true;

            equipoLocal.setGoles(equipoLocal.getGoles()+ golesLocal);
            equipoVisitante.setGoles(equipoVisitante.getGoles()+ golesVisitante);

            if (golesLocal > golesVisitante) {
                equipoLocal.setPuntos(equipoLocal.getPuntos() + 3);
            } else if (golesVisitante > golesLocal) {
                equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 3);
            } else {
                equipoLocal.setPuntos(equipoVisitante.getPuntos() + 1);
                equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 1);

            }
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

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }

        public int getGolesLocal() {
            return golesLocal;
        }

        public void setGolesLocal(int golesLocal) {
            this.golesLocal = golesLocal;
        }

        public int getGolesVisitante() {
            return golesVisitante;
        }

        public void setGolesVisitante(int golesVisitante) {
            this.golesVisitante = golesVisitante;
        }
    }

    static class Equipo {

        private String nombre;
        private int puntos, goles;

        public Equipo(String nombre) {
            this.nombre = nombre;
        }

        public int atacar() {
            return (int) (Math.random() * 101);
        }

        public int defender() {
            return (int) (Math.random() * 101);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public int getGoles() {
            return goles;
        }

        public void setGoles(int goles) {
            this.goles = goles;
        }
    }

}
