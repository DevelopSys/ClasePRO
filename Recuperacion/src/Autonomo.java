public interface Autonomo {

    String NOMBRE_RETENCIONES = "AUTONOMOS S.L";
    double RETENCIONES_FIJAS = 0.1;

    default void mensajeAutonomono(){
        System.out.println("Soy un autonomo");
    }

    void calcularCoutaAutonomo();
    void calcularJubilacion();

}
