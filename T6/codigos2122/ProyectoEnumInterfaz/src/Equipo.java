public enum Equipo {

    // construidos
    Barcelona("FC. Barcelona",10000), Madrid("Real Madrid",20000),
    Atletico, Sevilla, Getafe, Alcorcon("Alcorcon",500);

    // variables
    String nombre;
    int presupuesto;

    // constructores
    Equipo(String nombre, int presupuesto){
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }
    Equipo(){
    }

    // metodos

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(presupuesto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
