import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Coche> coches;
    private String CIF;
    private int sitiosDisponibles;

    public Empresa(){}
    public Empresa(String nombre, String CIF){
        this.nombre = nombre;
        this.CIF = CIF;
        this.trabajadores = new ArrayList<>();
        this.coches = new ArrayList<>();
        sitiosDisponibles = 10;
    }

    public void contratarTrabajador(Trabajador trabajador){

        /*if (trabajador.getClass() == Pintor.class){
            if (((Pintor)trabajador).getEspecialidad().equals("motos")){

            }
        } else if (trabajador.getClass() == Mecanico.class){
            if (((Mecanico)trabajador).isConocimientoBancada() == true){

            }
        } else if(trabajador.getClass() == Comercial.class){
            if (((Comercial)trabajador).getMaster() != null){

            }
        }*/
        if (trabajador.getTelefono()!=0) {
            trabajadores.add(trabajador);
        } else {
            System.out.println("No has sido seleccionado");
        }

    }
    public void despedirTrabajador(String dni){

        for (int i = 0; i < trabajadores.size(); i++) {
            Trabajador trabajador = trabajadores.get(i);
            if (trabajador.getDni().equals(dni)){
                trabajadores.remove(i);
            }

        }

        //trabajadores.remove(2);
    };
    public void listarTrabajadores(){
        for (int i = 0; i < trabajadores.size(); i++) {
            trabajadores.get(i).mostarDatos();
        }
    }
    public void comprobarAutonomo(Autonomo autonomo){
        autonomo.calcularCoutaAutonomo();
        autonomo.calcularJubilacion();
    }

    public void recepcionarCoche(Coche coche){
        if (sitiosDisponibles>0) {
            coches.add(coche);
            sitiosDisponibles--;
        } else {
            System.out.println("No hau hueco, mas tarde");
        }
    }
    public void entregarCoche(String matricula){

        boolean existe = false;
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getMatricula().equals(matricula)){
                coches.remove(i);
                sitiosDisponibles++;
                System.out.println("coche entregado correctamente");
                existe = true;
                // me permite salir del FOR
                break;
            }
        }

        // existe = true --> cuando ?? cuando se ha entrado en el bucle if
        // existe = false --> cuando ?? cuando no ha entrado en el bucle for -> if
        if (!existe){
            System.out.println("Jefe te has equivocado, no hay matrícula");
        }

    }
    public void listarCoches(){
        /*for (int i = 0; i < coches.size() ; i++) {
            coches.get(i).mostrarDatos();
        }*/

        for ( Coche itemCoche :coches) {
            itemCoche.mostrarDatos();
        }
    }
    public void mostrarCoche(String matricula){
        /*for (int i = 0; i < coches.size() ; i++) {
            if (coches.get(i).getMatricula().equals(matricula)){
                coches.get(i).mostrarDatos();
            }
        }*/

        for ( Coche itemCoche : coches ) {
            if (itemCoche.getMatricula().equals(matricula)){
                itemCoche.mostrarDatos();
            }
        }


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public int getSitiosDisponibles() {
        return sitiosDisponibles;
    }

    public void setSitiosDisponibles(int sitiosDisponibles) {
        this.sitiosDisponibles = sitiosDisponibles;
    }
}
