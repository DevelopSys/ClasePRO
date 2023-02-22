package model;

import java.util.ArrayList;

public class Carrera {

    private ArrayList<Vehiculo> listaParticipantes;
    private Vehiculo ganador;

    public Carrera() {
        listaParticipantes = new ArrayList<>();
        // ganador = null
    }

    public void validarVehiculo(Vehiculo vehiculo, Validacion validacion){
        if (validacion.validar(vehiculo)){
            // agregar a la lista
            listaParticipantes.add(vehiculo);
            System.out.println("Vehiculo agregado correctamente");
        } else {
            System.out.println("el coche no se ha validado correctamente");
        }; // que retorna --> boolean
    }

    public void generarGanador(){
        int numeroGanadro = (int) (Math.random()*99 +1);
        if (listaParticipantes.size()<numeroGanadro){
            this.ganador = listaParticipantes.get(numeroGanadro-1);
            System.out.println("El ganador de la carrera es");
            this.ganador.mostrarDatos();
        }
    }
}
