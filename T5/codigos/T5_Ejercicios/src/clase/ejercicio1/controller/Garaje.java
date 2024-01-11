package clase.ejercicio1.controller;

import clase.ejercicio1.model.Coche;

public class Garaje {

    private int numeroCoches;
    private String averia;
    private double caja;
    private Coche cocheTratado;
    private double precioReparacion;

    public Garaje() {
    }

    public boolean aceptarCoche(Coche coche, String averia){

        if (cocheTratado==null){
            cocheTratado = coche;
            if (averia.equalsIgnoreCase("aceite")){
                cocheTratado.getMotor().setLibtrosAceite(
                        cocheTratado.getMotor().getLibtrosAceite()+10);

            }
            precioReparacion = Math.random()*300;
            cocheTratado.acumularAveria(precioReparacion);
            numeroCoches++;
            return true;
        }

        return false;
    }

    public void devolverCoche(){
        // cobrar averia
            caja+=precioReparacion;
        // vaciar el sitio del garaje
        this.cocheTratado = null;
    }

    public int getNumeroCoche() {
        return numeroCoches;
    }

    public void setNumeroCoche(int numeroCoche) {
        this.numeroCoches = numeroCoche;
    }

    public String getAveria() {
        return averia;
    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public Coche getCocheTratado() {
        return cocheTratado;
    }

    public void setCocheTratado(Coche cocheTratado) {
        this.cocheTratado = cocheTratado;
    }
}
