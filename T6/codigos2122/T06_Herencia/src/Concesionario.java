import java.util.ArrayList;

public class Concesionario {

    private ArrayList<Coche> listaCoches;


    public Concesionario() {
        listaCoches = new ArrayList<>();
    }

    public void listar(){
        for ( Coche coche: listaCoches) {
            //coche.mostrarDatos();
        }
    }

    public void agregarCoche(Coche c) {
        //listaCoches.add(c);


        if (existeCoche(c.getMatricula())==null){
            listaCoches.add(c);
        }
    }

    public void borrarCoche(String matricula){
        if (existeCoche(matricula)!=null){
            listaCoches.remove(existeCoche(matricula));
            System.out.println("Coche borrado");
        } else {
            System.out.println("No encontrado");
        }
    }

    public Coche existeCoche(String matricula){
        boolean existe = false;
        Coche cocheEncontrado = null;

        for (Coche coche : listaCoches) {
            if (matricula.equalsIgnoreCase(coche.getMatricula())) {
                // EL COCHE ESTÄ EN LA LISTA
                System.out.println("El coche ya existe");

                return coche;
            }
        }

        return null;

    }


}
