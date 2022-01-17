package ejercicios_base.ejercicio1;

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

    public void incrementarEdad(int edadIncremento){
        this.edad += edadIncremento;
    }

    public double calcularIMC(){

        double imc = (this.peso / (this.altura * this.altura))*10000;
        return imc;
    }

    public String estadoIMC(){
        final double IMC = calcularIMC();
        String estado = "";
        if (IMC<18.5){
            estado = "Peso inferior a normal";
        } else if (IMC > 18.5 && IMC <24.9){
            estado = "normal";
        } else if (IMC >=25 && IMC < 29.9){
            estado = "Peso superior a normal";
        } else {
            estado = "obesidad";
        }
        return estado;
    }

    public void mostrarDatos(){
        System.out.printf("Nombre: %s%nApellido: %s%nEdad: %d%n",nombre,apellido,edad);
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

