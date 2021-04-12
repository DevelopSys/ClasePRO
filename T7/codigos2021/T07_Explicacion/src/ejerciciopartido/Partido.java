package ejerciciopartido;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private int golesLocal, golesVisitante;
    private boolean jugado;

    public void jugarPartido(){

        golesLocal = 0;
        golesVisitante =0;
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                if (equipoLocal.atacar()>equipoVisitante.defender()){
                    golesLocal++;
                }

                if (equipoVisitante.atacar()>equipoLocal.defender()) {
                    golesVisitante++;
                }
            }
            System.out.println("Fin parte");
        }
        System.out.println("Fin partido");

    }

    public void calcularPuntos(){
        if (golesLocal > golesVisitante){
            equipoLocal.setPuntos(equipoLocal.getPuntos()+3);
        } else if(golesVisitante > golesLocal) {
            equipoVisitante.setPuntos(equipoVisitante.getPuntos()+3);
        } else {
            equipoLocal.setPuntos(equipoLocal.getPuntos()+1);
            equipoVisitante.setPuntos(equipoVisitante.getPuntos()+1);

        }
    }

    public void mostrarResultado(){
        System.out.printf("%s %d - %s %d%n",equipoLocal.getNombre(), golesLocal, equipoVisitante.getNombre(),golesVisitante);
    }

    public void mostrarEquipos(){
        System.out.println(equipoLocal.getNombre() +" VS "+equipoVisitante.getNombre());
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

    class Equipo{

        private String nombre;
        private int puntos;

        // MADRID LOCAL
        // BCN VISITANTE
        public Equipo(String nombre, String posicion) {
            this.nombre = nombre;
            if (posicion.toLowerCase().equals("local")){
                setEquipoLocal(this);
            } else if(posicion.toLowerCase().equals("visitante")){
                setEquipoVisitante(this);
            }
        }

        public int atacar(){
            return (int) (Math.random()*100);
        }

        public int defender(){
            return (int) (Math.random()*100);
        }


        public void modificarJugado(){
            jugado = true;
        }

        public void mostrarInformacion(){
            System.out.println("Nombre: "+nombre+" Puntos: "+puntos);
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
