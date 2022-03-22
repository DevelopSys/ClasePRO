import java.util.ArrayList;
import java.util.Collections;

public class Torneo {

    private ArrayList<Partido> listaPartidos;
    private String nombre;

    public Torneo(String nombre) {
        this.nombre = nombre;
        listaPartidos = new ArrayList();
    }

    public void realizarSorteo(ArrayList<Equipo> lista) {
        //System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }

        for (int i = lista.size() - 1; i >= 0; i--) {
            Equipo equipo1 = lista.get(i);
            for (int j = i - 1; j >= 0; j--) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }
        Collections.shuffle(listaPartidos);
    }

    public void iniciarTorneo(){
        for ( Partido item: listaPartidos) {
            item.jugarPartido();
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

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
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

    public Equipo(String nombre, int nivelAtaque, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
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
