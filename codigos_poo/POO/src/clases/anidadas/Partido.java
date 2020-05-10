package clases.anidadas;


import java.io.Serializable;

public class Partido {

    private String fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(String fecha){
        this.fecha = fecha;
    }

    public void mostarResultado(){
        System.out.printf("%s:%d - %s:%d %n",getEquipoLocal().getNombre(), getEquipoLocal().getGoles(),
                getEquipoVisitante().getNombre(), getEquipoVisitante().getGoles());
    }

    public void agregarGolesVisitante(){
        int goles = (int) (Math.random()*2);
        getEquipoVisitante().setGoles(goles);
    }

    public void agregarGolesLocal(){
        int goles = (int) (Math.random()*3);
        getEquipoLocal().setGoles(goles);
    }

    public String getFecha() {
        return fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    class Equipo {

        private String nombre;
        private int goles;

        public Equipo(String nombre, int goles) {
            this.nombre = nombre;
            this.goles = goles;
        }

        public String getNombre() {
            return nombre;
        }

        public int getGoles() {
            return goles;
        }

        public void setGoles(int goles) {
            this.goles += goles;
        }
    }

}


