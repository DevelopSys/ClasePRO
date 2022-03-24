import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Torneo {

    private ArrayList<Partido> listaPartidos;
    private ArrayList<Equipo> listaEquipos;
    private String nombre;

    public Torneo(String nombre) {
        this.nombre = nombre;
        listaPartidos = new ArrayList();
    }

    public void realizarSorteo(ArrayList<Equipo> lista) {
        this.listaEquipos = lista;
        //IDA
        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }

        //VUELTA
        for (int i = lista.size() - 1; i >= 0; i--) {
            Equipo equipo1 = lista.get(i);
            for (int j = i - 1; j >= 0; j--) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }
        Collections.shuffle(listaPartidos);
    }

    public void imprimirClasificacion(){
        // acceder a todos los equipo
        Collections.sort(listaEquipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPuntos() > o2.puntos){
                    return -1;
                } else if (o1.getPuntos() == o2.getPuntos()) {
                    if (o1.getGolesTotal() > o2.getGolesTotal()){
                        return  -1;
                    }
                }
                return 0;
            }
        });
        int contador=1;
        for ( Equipo equipo: listaEquipos ) {
            System.out.printf("%d - %s - %d %d%n",contador,equipo.getNombre(),equipo.getPuntos(), equipo.getGolesTotal());
            contador++;
        }
    }

    public void iniciarTorneo(){
        for ( Partido item: listaPartidos) {
            item.jugarPartido();
        }
    }

    public void mostrarPartidosJugados() {
        for (Partido partido : listaPartidos) {
            System.out.printf("%s:%d vs %s:%d%n",
                    partido.getEquipoLocal().getNombre(),
                    partido.golesLocal,
                    partido.getEquipoVisitante().getNombre(),
                    partido.golesVisitante);
        }
    }

    public void mostrarPartidos() {
        for (Partido partido : listaPartidos) {
            System.out.printf("%s vs %s%n",
                    partido.getEquipoLocal().getNombre(),
                    partido.getEquipoVisitante().getNombre());
        }
    }

    public ArrayList getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

class Partido {
    private Equipo equipoLocal, equipoVisitante;
    private int golesLocal, golesVisitante;
    private boolean jugado;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void generarGolLocal(){
        if (equipoLocal.getNivelAtaque() > equipoVisitante.getNivelAtaque()){
            golesLocal = (int) (Math.random()*3);
            equipoLocal.setGolesTotal(equipoLocal.getGolesTotal()+golesLocal);
        }
    }
    public void generarGolVisitantes(){
        if (equipoVisitante.getNivelAtaque() > equipoLocal.getNivelAtaque()){
            golesVisitante = (int) (Math.random()*3);
            equipoVisitante.setGolesTotal(equipoVisitante.getGolesTotal()+golesVisitante);
        }
    }

    public void jugarPartido(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
               generarGolLocal();
               getEquipoVisitante();
            }
        }
        jugado = true;
        if (golesVisitante > golesLocal){
            equipoVisitante.setPuntos(equipoVisitante.puntos+3);
        } else if (golesLocal > golesVisitante){
            equipoLocal.setPuntos(equipoLocal.puntos+3);
        } else {
            equipoLocal.setPuntos(equipoLocal.puntos+1);
            equipoVisitante.setPuntos(equipoVisitante.puntos+1);
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
}

static class Equipo {
    private String nombre;
    private int nivelAtaque, nivelDefensa;
    private int puntos;
    private int golesTotal;



    public Equipo(String nombre, int nivelAtaque, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }


    public int getGolesTotal() {
        return golesTotal;
    }

    public void setGolesTotal(int golesTotal) {
        this.golesTotal = golesTotal;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }
}
}
