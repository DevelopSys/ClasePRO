package repaso;

import java.util.ArrayList;

public class Empresa {

    // variables
    private ArrayList<Trabajador> listaTrabajadores;
    private String CIF, nombre;
    private double costeEmpleados;
    private final double COSTE_SS = 0.21;


    // constructores

    public Empresa() {

    }

    public Empresa(String nombre, String CIF) {
        this.listaTrabajadores = new ArrayList<>();
        this.CIF = CIF;
        this.nombre = nombre;

    }

    // métodos

    public void listar() {
        if (listaTrabajadores.size() == 0) {
            System.out.println("No hay trabajadores");
        } else {
            for (Trabajador trabajador : listaTrabajadores) {
                trabajador.mostrarDatos();
            }
        }
    }

    public Trabajador existeTrabajador(String dni) {
        for (Trabajador trabajadorItem : listaTrabajadores) {
            if (trabajadorItem.getDni().equals(dni)) {
                return trabajadorItem;
            }
        }
        return null;
    }

    public void calcularCosteTotal(){
        for (Trabajador trabajador:listaTrabajadores) {
             costeEmpleados+= (trabajador.getSueldo() + (trabajador.getSueldo()*COSTE_SS));
        }
    }

    public void costeDirectivos(){
        double costeDirectivos =0;
        for (Trabajador trabajador: listaTrabajadores) {
            if (trabajador.getPuesto().equals("directivo")){
                costeDirectivos = costeDirectivos +
                        (trabajador.getSueldo()
                                + (trabajador.getSueldo() * COSTE_SS));

            }
        }
    }

    public void despedirTrabajador(String dni){
        if (existeTrabajador(dni)!=null){
            listaTrabajadores.remove(existeTrabajador(dni));
        } else {
            System.out.println("No puedo borrarlo");
        }
    }

    public void contratarTrabajador(Trabajador trabajador) {

        if(existeTrabajador(trabajador.getDni())!=null){
            System.out.println("El trabajador ya existe");
        }else {
            listaTrabajadores.add(trabajador);
        }



    }


    // gettes setters

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsteEmpleados() {
        return consteEmpleados;
    }

    public void setConsteEmpleados(double consteEmpleados) {
        this.consteEmpleados = consteEmpleados;
    }

    public double getCOSTE_SS() {
        return COSTE_SS;
    }
}
