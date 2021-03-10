package ejercicios.ejercicioTrabajadoresInterfaz;

import java.util.ArrayList;

public class Empresa {

    private final String CIF ="123A";
    private ArrayList<Trabajador> listaTrabajadores;
    private double votacion;

    public Empresa(){
        listaTrabajadores = new ArrayList<>();
    };

    public void registrarTrabajador(Trabajador trabajador){
        listaTrabajadores.add(trabajador);
    }

    public void registrarVoto(Responsable responsable, int voto){
        this.votacion += responsable.emitirVoto(voto);
    }

    public void verResultadoVotacion(){
        System.out.println(votacion);
    }

    public String getCIF() {
        return CIF;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public double getVotacion() {
        return votacion;
    }

    public void setVotacion(double votacion) {
        this.votacion = votacion;
    }
}
