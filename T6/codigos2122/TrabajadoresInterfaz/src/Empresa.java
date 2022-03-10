import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> personas;
    private String nombre;
    private int votos;
    private int beneficios;

    public Empresa(String nombre, int beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
        personas = new ArrayList();
    }

    public Empresa(){}

    public void listarPersonas(){
        for ( Persona item : personas ) {
            item.mostrarDatos();
        }
    }

    public void addPersona(Persona persona){
        // restriccion DNI
        personas.add(persona);
    }

    public void despedirPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equalsIgnoreCase(dni)){
                personas.remove(i);
                break;
            }
        }
    }

    public void buscarPersona(String dni){
        for ( Persona item  : personas ) {
            if (item.getDni().equalsIgnoreCase(dni)){
                item.mostrarDatos();
            }
        }
    }

   public void registraVotacion(Comision comision){
        this.votos += comision.votar();
   }

   public void repartirBeneficios(){
       for (Persona item: personas) {
           if (item instanceof Comision){
               ((Comision) item).obtenerBeneficio(beneficios);
           }
       }
   }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(int beneficios) {
        this.beneficios = beneficios;
    }
}
