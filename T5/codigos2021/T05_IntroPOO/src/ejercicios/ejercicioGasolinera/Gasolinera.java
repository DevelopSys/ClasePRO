package ejercicios.ejercicioGasolinera;

import java.util.ArrayList;

public class Gasolinera {

    private String nombre;
    private ArrayList<Surtidor> conjuntoSurtidores;
    private int ganancias;

    public Gasolinera(String nombre) {
        this.nombre = nombre;
        this.conjuntoSurtidores = new ArrayList<>();
    }

    // metodos

    public void mostrarDatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Ganancias: " +ganancias);
        System.out.println("Nº de Surtidores: "+conjuntoSurtidores.size());
    }

    public void addSurtidor(Surtidor surtidor){
        conjuntoSurtidores.add(surtidor);
    }

    public void eliminarSurtidor(int id){

        for (int i = 0; i < conjuntoSurtidores.size(); i++) {
            if (conjuntoSurtidores.get(i).getId() == id){
                conjuntoSurtidores.remove(i);
                break;
            }
        }
    }

    public Surtidor buscarSurtidor(int id){

        for ( Surtidor surtidor : conjuntoSurtidores ) {
            if (surtidor.getId() == id){
                System.out.println("Surtidor encontrado");
                return surtidor;
            }
        }

        return null;

    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getConjuntoSurtidores() {
        return conjuntoSurtidores;
    }

    public void setConjuntoSurtidores(ArrayList<Surtidor> conjuntoSurtidores) {
        this.conjuntoSurtidores = conjuntoSurtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
