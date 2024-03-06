package partidoanidado.model;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocales, golesVisitantes;

    public Partido(String nombreLocal, String nombreVisitante) {
        equipoLocal = new Equipo(nombreLocal);
        equipoVisitante = new Equipo(nombreVisitante);
    }

    public Partido() {
    }
    
    public void iniciarPartido(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                agregarGoles("local");
                agregarGoles("visitante");
            }
            mostrarResultado();
        }
        System.out.println("Partido finalizado");
        mostrarResultado();
    }

    public void agregarGoles(String equipo){
        if (equipo.equals("local")){
            int aleatorio = (int) (Math.random()*3);

            golesLocales+= aleatorio;
        } else {
            int aleatorio = (int) (Math.random()*3);
            golesVisitantes+= aleatorio;
        }
    }

    public void mostrarResultado() {
        System.out.printf("%s: %d vs %s: %d%n",
                equipoLocal.getNombre(), golesLocales, equipoVisitante.getNombre(), golesVisitantes);

        System.out.printf("%s: puntos %d vs %s: puntos %d%n",
                equipoLocal.getNombre(), equipoLocal.getPuntos(), equipoVisitante.getNombre(), equipoVisitante.getPuntos());

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

    public int getGolesLocales() {
        return golesLocales;
    }

    public void setGolesLocales(int golesLocales) {
        this.golesLocales = golesLocales;
    }

    public int getGolesVisitantes() {
        return golesVisitantes;
    }

    public void setGolesVisitantes(int golesVisitantes) {
        this.golesVisitantes = golesVisitantes;
    }

    public class Equipo {

        private int puntos;
        private String nombre;

        public Equipo() {
        }

        public Equipo(String nombre) {
            this.nombre = nombre;
            if (Partido.this.getEquipoLocal() == null) {
                setEquipoLocal(this);
            } else {
                Partido.this.setEquipoVisitante(this);
            }
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
    }
}
