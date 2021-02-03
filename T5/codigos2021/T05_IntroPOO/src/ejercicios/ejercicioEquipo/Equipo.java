package ejercicios.ejercicioEquipo;


import java.util.ArrayList;

public class Equipo {

    private int nivelAtaque, nivelDefensa, nivelCentro, numeroGoles;
    private String nombre;
    private ArrayList<Jugador> plantilla;

    public Equipo(String nombre){
        //this.numeroGoles = 0;
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
        this.nivelCentro= (int)(Math.random()*101);
        plantilla = new ArrayList<>();
    }

    public Equipo (String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa){
        this.nombre = nombre;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.nivelAtaque = nivelAtaque;
        plantilla = new ArrayList<>();
    }

    public void ficharJugador(Jugador jugador){
        this.plantilla.add(jugador);
    }

    public void listarEstrellas(){
        for ( Jugador jugador : plantilla ) {
            if (jugador.isEstrella()){
                jugador.mostrarDatos();
            }
        }
    }

    public void listarDelanteros(){
        for ( Jugador jugador : plantilla ) {
            if (jugador.getPosicion().toLowerCase().equals("delantero")){
                jugador.mostrarDatos();
            }
        }
    }


    public boolean atacar(){

        // (nivelAtaque * (aleatorio entre 0-1) + (nivelCentro * aleatorio entre 0-1)/2 > 90
        if ((this.nivelAtaque *(int) (Math.random()*2)) + ((this.nivelCentro * (int) (Math.random()*2))/2) > 70){
            //System.out.println("Gol del "+nombre);
            //numeroGoles++;
            return true;
        }
        return false;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Ataque: "+nivelAtaque);
        System.out.println("Centro: "+nivelCentro);
        System.out.println("Defensa: "+nivelDefensa);
        System.out.println("Goles: "+numeroGoles);
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
