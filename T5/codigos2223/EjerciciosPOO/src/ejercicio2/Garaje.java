package ejercicio2;

public class Garaje {

    private Coche cocheActual;
    private int numeroCoches;
    private String averiaActual;

    // por defecto ()

    public void devolverCoche(){
        if (cocheActual!=null){
            // hay coche en el garaje
            this.cocheActual = null;
            this.averiaActual = null;
            numeroCoches++;
        } else{
            // no hay coche en el garaje
            System.out.println("No se puede entregar coche porque no hay nadie en el taller");
        }
    }

    public boolean aceptarCoche(Coche coche, String averia){

        if (cocheActual!=null){
            // hay coche en el garaje
            System.out.println("No se puede atender porque ya hay un coche");
        } else{
            // no hay coche en el garaje
            // Si la avería del coche es “aceite” incrementar en 10 los litros de aceite
            this.cocheActual = coche;
            this.averiaActual = averia;
            if (averiaActual.equalsIgnoreCase("aceite")){
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite()+10);
            }
        }

        return cocheActual==null;
    }

    public Coche getCocheActual() {
        return cocheActual;
    }

    public void setCocheActual(Coche cocheActual) {
        this.cocheActual = cocheActual;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public String getAveriaActual() {
        return averiaActual;
    }

    public void setAveriaActual(String averiaActual) {
        this.averiaActual = averiaActual;
    }
}
