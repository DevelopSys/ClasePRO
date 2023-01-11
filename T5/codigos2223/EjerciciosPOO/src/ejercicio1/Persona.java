package ejercicio1;

public class Persona {

    // nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso, imc;

    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        calcularIMC();
    }
    public Persona(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        // peso =0.0
        // altura =0
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
        calcularIMC();
        // peso = 0
        // altura = 0
        // edad = 0

    }
    public Persona(){
        this.nombre = "por defecto";
        this.apellido = "por defecto";
        this.dni = "111111111X";
    }

    public void aumentarEdad(int numero){
        this.edad += numero;
        //this.edad = this.edad + numero;
    }

    private void calcularIMC(){
        // IMC = peso / (altura * altura)
        this.imc = this.peso / Math.pow ((double) this.altura/100,2);
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
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

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
