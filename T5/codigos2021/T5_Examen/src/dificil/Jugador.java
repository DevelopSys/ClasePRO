package dificil;

import java.util.ArrayList;

public class Jugador {

    private String dni, nombre;
    private ArrayList<Carton> listaCartones;
    private double saldo;
    private boolean ganador =false;

    public Jugador(){
        listaCartones = new ArrayList<>();
    }

    public Jugador(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        this.listaCartones = new ArrayList<>();
    }

    public void comprarCarton(int numeroCartones, int id){
        if (saldo<numeroCartones){
            System.out.println("no puedes comprar");
        } else {
            for (int i = 0; i < numeroCartones; i++) {
                listaCartones.add(new Carton(id));
                id++;
            }
            this.saldo -= numeroCartones;
        }
    }

    public void recargarDinero(int saldo){
        this.saldo += saldo;
    }

    public void mostrarCartones(){
        for ( Carton carton: listaCartones) {
            System.out.println("El id del carton es: "+carton.getId());
            carton.mostrarNumeros();
        }
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Carton> getListaCartones() {
        return listaCartones;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isGanador() {
        return ganador;
    }
}
