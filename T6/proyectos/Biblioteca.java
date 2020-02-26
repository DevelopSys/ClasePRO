package correccion_enum;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Prestable> elementos;
    ArrayList<Persona> personas;

    public Biblioteca() {
        this.elementos = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    public void agregarPrestable(Prestable prestable){
        elementos.add(prestable);
    }

    public void agregarSocio(Socio socio){
        this.personas.add(socio);
    }

    public void agregarTrabajador(Trabajador trabajador){
        this.personas.add(trabajador);
    }

    public void realizarPrestamo(Socio socio, Prestable prestable){
        if (!prestable.getPrestado()){
            socio.getPrestamos().add(prestable);

            for (int i=0;i<elementos.size();i++){
                if (elementos.get(i).getId() == prestable.getId()){
                    Prestable prestable1 = elementos.get(i);
                    prestable1.prestar();
                    elementos.set(i,prestable1);
                }
            }
        } else {
            System.out.println("El elemento ya está prestado");
        }
    }


    public void devolverPrestamo(Socio socio, Prestable prestable){
        if (prestable.getPrestado()){
            socio.getPrestamos().remove(prestable);

            for (int i=0;i<elementos.size();i++){
                if (elementos.get(i).getId() == prestable.getId()){
                    Prestable prestable1 = elementos.get(i);
                    prestable1.devolver();
                    elementos.set(i,prestable1);
                }
            }
        } else {
            System.out.println("El elemento ya está prestado");
        }
    }

    public void listarDisponibeles(){
        for (Prestable prestable:elementos) {
            if (!prestable.getPrestado()){
                prestable.mostrarDatos();
            }
        }
    }


    public void listarElementos(){
        for (Prestable prestable:elementos) {
            prestable.mostrarDatos();
        }
    }


}
