public final class Partido {

    private Equipo local, visitante;
    private boolean jugado;
    private int golesLocales, golesVisitantes;

    public void mostrarResultado(){
        System.out.printf("%s: %d - %s: %d",local.getNombre(),
                golesLocales, visitante.getNombre(), getGolesVisitantes() );
    }

    public void repartirPuntos(){
        if (golesVisitantes == golesLocales){
            this.local.setPuntos(local.getPuntos()+1);
            this.visitante.setPuntos(visitante.getPuntos()+1);
        } else if (golesVisitantes > golesLocales){

            this.visitante.setPuntos(visitante.getPuntos()+3);
        } else if (golesVisitantes < golesLocales){

            this.local.setPuntos(local.getPuntos()+3);
        }
    }

    public void reiniciarPartido(){
        golesVisitantes=0;
        golesLocales=0;
    }

    public void escribirClaficacion(){
        if (local.getPuntos()< visitante.getPuntos()){
            System.out.println("1- Sevilla: "+visitante.getPuntos());
            System.out.println("2- Atleti "+local.getPuntos());
        } else {
            System.out.println("1- Atletico: "+local.getPuntos());
            System.out.println("2- Sevilla "+visitante.getPuntos());
        }
    }

    public void agregarGolesLocales(){
        golesLocales += (int)(Math.random()*3);
    }

    public void agregarGolesVisitantes(){
        golesVisitantes += (int)(Math.random()*3);
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
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

    class Equipo {

        private String nombre;
        private int puntos;

        public Equipo(String nombre) {
            this.nombre = nombre;
            if (nombre.equalsIgnoreCase("Atleti")){
                setLocal(this);
            } else if (nombre.equalsIgnoreCase("Sevilla")) {
                setVisitante(this);
            }
            // puntos =0
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
    }

}
