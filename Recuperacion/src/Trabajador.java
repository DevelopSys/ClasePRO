public abstract class Trabajador {

    protected String nombre, apellido, dni;
    protected int numeroSS, telefono;
    protected double sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String dni, int numeroSS) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroSS = numeroSS;
        this.sueldo = 15000;
    }

    public Trabajador(String nombre, String apellido, String dni, int numeroSS, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroSS = numeroSS;
        this.telefono = telefono;
        this.sueldo = 15000;
    }

    public void mostarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("DNI "+dni);
        System.out.println("Telefono "+telefono);
        System.out.println("Sueldo "+sueldo);
        System.out.println("Numero SS "+numeroSS);
    }

    public abstract void calcularRetencion();

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroSS() {
        return numeroSS;
    }

    public void setNumeroSS(int numeroSS) {
        this.numeroSS = numeroSS;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
