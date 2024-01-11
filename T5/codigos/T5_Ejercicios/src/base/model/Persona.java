package base.model;

public class Persona {

    // nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;
    private char genero;


    public Persona()  {
        this.nombre = "por defeecto";
        this.apellido = "por defeecto";
        this.dni = "11111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
    }



    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        // peso = 0.0
        // altura = 0
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "11111111X";
    }

    public double calcularIMC(){
        // peso / altura2
        return (double) peso / Math.pow((altura/100),2);
    }


    public void mostraDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("DNI "+dni );
        System.out.println("Edad "+edad);
        System.out.println("Peso "+peso);
        System.out.println("Altura "+altura);
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
