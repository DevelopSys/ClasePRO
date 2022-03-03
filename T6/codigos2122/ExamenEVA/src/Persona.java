public abstract class Persona {

    protected String nombre, apellido, dni;
    protected int edad;
    protected double sueldo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.sueldo = sueldo;
        calcularSueldo();
    }

    public abstract void calcularSueldo();

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);
        System.out.println(sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
