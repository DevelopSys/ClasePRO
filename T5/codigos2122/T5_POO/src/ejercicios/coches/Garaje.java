package ejercicios.coches;

public class Garaje {

    private Coche coche;
    private String averia;
    private int numCoches;

    // constructor por defecto se da por escrito

    public void devolverCoche(){
        this.coche = null;
    }

    public boolean aceptarCoche(Coche coche, String averia){
        if (this.coche!=null){
            return false;
        } else {
            numCoches++;
            this.coche = coche;
            if (averia.equalsIgnoreCase("aceite")){
                coche.getMotor().setLitros(coche.getMotor().getLitros()+10);
            } else {
                coche.getMotor().setLitros(coche.getMotor()
                        .getLitros()+(int)(Math.random()*1000));
            }
            return true;
        }
    }

}
