package ejercicios.ejercicioCoche;

public class Motor {

    // variables
    private int caballosV;
    private double centimetrosC;

    // constructor
    public Motor (int caballosV, double centimetrosC){
        this.caballosV = caballosV;
        this.centimetrosC = centimetrosC;
    }

    public int getCaballosV() {
        return this.caballosV;
    }

    public double getCentimetrosC(){
        return this.centimetrosC;
    }

    public void setCaballosV(int caballosV) {
        this.caballosV = caballosV;
    }

    public void setCentimetrosC(double centimetrosC) {
        this.centimetrosC = centimetrosC;
    }
}
