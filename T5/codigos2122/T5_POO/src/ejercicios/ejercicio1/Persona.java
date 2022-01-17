package ejercicios.ejercicio1;

public class Persona {

    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;
    public static int ejemplo =234;

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        // peso y altura = 0.0
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "1111111X";
    }
    public Persona(){
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "111111X";
    }


    private void metodoPrivado(){

    }

    protected void metodoProtected(){

    }

    public static void metodoStatic(){

    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s%nApellido: %s%nEdad: %d",nombre,apellido,edad);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

