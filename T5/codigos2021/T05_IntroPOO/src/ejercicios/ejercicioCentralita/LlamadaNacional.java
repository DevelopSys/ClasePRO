package ejercicios.ejercicioCentralita;

public class LlamadaNacional {

    private long numeroOrigen, numeroDestino;
    private double duracion, coste;
    private char destino;


    // constructor

   public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion, char destino){

       this.numeroDestino = numeroDestino;
       this.numeroOrigen = numeroOrigen;
       this.duracion = duracion;
       this.destino = destino;

       switch (destino){
           case 'A':
               this.coste = (this.duracion*0.40) +0.70;
               break;
           case 'B':
               this.coste = (this.duracion*0.50) +0.70;
               break;
           case 'C':
               this.coste = (this.duracion*0.60) +0.70;
               break;
           default:
               //System.out.println("No se encuenta");
               this.coste = (this.duracion*1.50) +0.70;
               break;
       }

   }

   public LlamadaNacional(){

   }

   // metodos

    public void mostrarDatos(){
        System.out.println("Número origen "+this.numeroOrigen);
        System.out.println("Número destino "+this.numeroDestino);
        System.out.println("Duración "+this.duracion);
        System.out.println("Coste "+this.coste);
        System.out.println("Destino "+this.destino);
    }

   // setter y getter


    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }
}
