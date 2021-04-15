package ejerciciotorneo;

import java.util.ArrayList;
import java.util.Collections;

public class Torneo {


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


    private void mostrarPartidos(){
        for ( Partido itemPartido  : listaPartidos ) {
            System.out.printf("%s vs %s%n",itemPartido.getEquipoLocal().getNombre(),itemPartido.getEquipoVisitante().getNombre());
        }
    }

    private void mecanicaTorneo(){

        listaPartidos = new ArrayList<>();
        // MADRID ; BARSA ; SEVILLA ; GETAFE
        // m - b  m - s m -g
        // b - s b -g
        // s - g

        // IDA
        for (int i = 0; i < listaParticipantes.size()-1; i++) {
            //System.out.println(listaParticipantes.get(i).getNombre());
            for (int j = i+1; j < listaParticipantes.size(); j++) {
                //System.out.println("\t"+listaParticipantes.get(j).getNombre());
                Partido partido = new Partido(listaParticipantes.get(i),listaParticipantes.get(j));
                listaPartidos.add(partido);
            }
        }

        // VUELTA
        System.out.println("Realizando vuleta");
        for (int i = listaParticipantes.size()-1; i > 0; i--) {
            //System.out.println(listaParticipantes.get(i).getNombre());
            for (int j = i-1; j >= 0 ; j--) {
                //System.out.println("\t"+listaParticipantes.get(j).getNombre() );
                Partido partido = new Partido(listaParticipantes.get(i), listaParticipantes.get(j));
                listaPartidos.add(partido);
            }
        }

        System.out.println("El número de  de partidos es: "+listaPartidos.size());
        for (int i = 0; i < 10; i++) {
            Collections.shuffle(listaPartidos);
        }
        mostrarPartidos();
    }

    public void realizarSorteo(ArrayList<Equipo> equipos){
        if (equipos!=null) {
            this.listaParticipantes = equipos;
            // TODO realizar el sorteo con el for anidado del otro día
            mecanicaTorneo();
        } else {
            System.out.println("Poro favor comprueba el funcionamiento");
        }
    }
    public void realizarSorteo(){
        // TODO realizar el sorteo con el for anidado del otro día
        if (listaParticipantes.size()>0){
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

    class Partido{

        private Torneo.Equipo EquipoLocal, EquipoVisitante;
        private boolean jugado;
        private int golesLocal, golesVisitante;

        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            EquipoLocal = equipoLocal;
            EquipoVisitante = equipoVisitante;
        }

        public Partido() {
        }

        public Equipo getEquipoLocal() {
            return EquipoLocal;
        }

        public void setEquipoLocal(Equipo equipoLocal) {
            EquipoLocal = equipoLocal;
        }

        public Equipo getEquipoVisitante() {
            return EquipoVisitante;
        }

        public void setEquipoVisitante(Equipo equipoVisitante) {
            EquipoVisitante = equipoVisitante;
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

    static class Equipo{

        private String nombre;
        private int puntos, goles;

        public Equipo(String nombre) {
            this.nombre = nombre;
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
