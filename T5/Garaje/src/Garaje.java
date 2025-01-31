public class Garaje {

    private Coche coche;
    private double caja;

    public Garaje() {
    }
    public void aceptarCoche(Coche coche, String averia){
        if (this.coche==null){
            this.coche = coche;
            this.coche.arregar("aceite",
                    (int) (Math.random()*401)+100);
        } else {
            System.out.println("No hay espacio");
        }
    }

    public void entregarCoche(){
        cocheActual = null;
    }
}
