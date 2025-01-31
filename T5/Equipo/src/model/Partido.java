package model;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocales, golesVisitantes;
    private int parte=1;

    public Partido(){}

    public Partido(Equipo equipoLocal, Equipo equipoVisitante){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        // golesLocales,golesVisante = 0
        // jugado = false
    }

    public void iniciarPartido(){
        if (equipoVisitante!=null && equipoLocal !=null){
            for (int i = parte; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (equipoLocal.atacar()){
                        golesLocales++;
                    }
                    if (equipoVisitante.atacar()){
                        golesVisitantes++;
                    }
                }
            }
            jugado = true;
        }
    }

    public void mostrarResultado(){
        if(jugado){
            System.out.printf("El resultado final es de %s:%d - %s:%d"
                    ,equipoLocal.getNombre(),golesLocales
                    , equipoVisitante.getNombre(), golesVisitantes);
        } else {
            System.out.println("El partido aun no se ha jugado");
        }
    }
}
