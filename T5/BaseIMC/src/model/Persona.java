package model;

public class Persona {

    private String nombre, apellido, dni;
    private int edad;
    private double altura, peso;

    public Persona(String nombre, String apellido, String dni,
                   int edad, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, String apellido, String dni, int edad) {

        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "11111111X";
        // peso = 0.0
        // altura = 0.0
        // edad = 0
    }

    public Persona(){
        this.nombre = "sin definir";
        this.apellido = "sin definir";
        this.dni = "1111111X";
        // this.edad = 0;
        // this.peso = 0;
        // this.altura =0;
    }
    public double calcularIMC(){
        double imc =  peso/Math.pow(altura,2);
        return imc;
    }

    public void incrementarEdad(int edad){
        //setEdad(this.edad+edad);
        this.edad += edad;
    }

    public void mostrarDatos() {
        System.out.printf("Nombre: %s" +
                        "\nApellido: %s" +
                        "\nDNI: %s" +
                        "\nAltura: %.2f"
                        + "\nPeso: %.2f"
                        + "\nEdad: %d\n",
                nombre, apellido, dni, altura, peso, edad);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
